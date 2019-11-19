package ServiciosDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Objects;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import modeloVO.ClasesVO;

public class ClaseServiciosDAO {
//codigo SQL

    public ArrayList<String> llenarInst(String m, String n, JButton bo) {

        String mi = "", ni = "";
        ArrayList<String> listains = new ArrayList<>();
        String sql = "SELECT * FROM instructor";
        try (Connection conexion3 = Conexion.getConnection();
                Statement declaracion = conexion3.createStatement();
                ResultSet rs = declaracion.executeQuery(sql)) {

            listains.add("Seleccione Instructor");

            while (rs.next()) {
                mi = rs.getString("especialidad");
                ni = rs.getString("hora");
                if (mi.equals(m) && n.equals(ni)) {
                    listains.add(rs.getString("codigo"));
                    bo.setEnabled(true);
                }

            }
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
        return listains;
    }

    public void insertar(Connection conexion2, ClasesVO clase) {

        try {
            PreparedStatement cons;
            cons = conexion2.prepareStatement("INSERT INTO clase(codigo, clase, horario, cod_instructor)"
                    + " VALUES(?,?,?,?)");
            cons.setInt(1, clase.getCodigo());
            cons.setString(2, clase.getClase());
            cons.setString(3, clase.getHorario());
            cons.setInt(4, clase.getInstructor());
            cons.executeUpdate();
            JOptionPane.showMessageDialog(null, "Se guardó Clase");

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    public boolean Buscar(Integer codigo) {
        boolean esta = false;
        Integer cod2 = 0;
        String sql = "SELECT codigo FROM clase WHERE codigo = '" + codigo + "'";
        try (Connection conexion3 = Conexion.getConnection();
                Statement declaracion = conexion3.createStatement();
                ResultSet rs = declaracion.executeQuery(sql)) {
            while (rs.next()) {
                cod2 = rs.getInt("codigo");
            }
            esta = Objects.equals(cod2, codigo);
        } catch (SQLException e) {
            System.err.println(e.getMessage());

        }
        return esta;
    }

    public void Llenar(Integer codigo, JComboBox clase, JComboBox hora, JComboBox instructor) {

        String sql = "SELECT * FROM clase WHERE codigo = '" + codigo + "'";
        try (Connection conexion3 = Conexion.getConnection();
                Statement declaracion = conexion3.createStatement();
                ResultSet rs = declaracion.executeQuery(sql)) {
            while (rs.next()) {
                clase.setSelectedItem(rs.getString("clase"));
                hora.setSelectedItem(rs.getString("horario"));
                instructor.setSelectedItem(rs.getString("cod_instructor"));
            }
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }

    public void actualizarIns(ClasesVO cs, Integer codigo) {
        String sql = "UPDATE clase SET codigo= '" + cs.getCodigo() + "', clase = '" + cs.getClase() 
                + "', horario = '" + cs.getHorario()
                + "', cod_instructor = '" + cs.getInstructor() + "' WHERE codigo = '" + codigo + "'";
        try (Connection conexion2 = Conexion.getConnection();
                PreparedStatement pst = conexion2.prepareStatement(sql)) {
            JOptionPane.showMessageDialog(null, "Se actualizó Clase");
            pst.executeUpdate();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }

    public void eliminarIns(Integer codigo, ClasesVO cs) {
        try (Connection conexion3 = Conexion.getConnection();
                Statement declaracion = conexion3.createStatement()) {
            String sql = "DELETE FROM clase WHERE codigo = '" + codigo + "'";
            declaracion.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "Se eliminó Clase");
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }
}
