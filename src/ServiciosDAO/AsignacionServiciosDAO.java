package ServiciosDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Objects;
import javax.swing.JOptionPane;
import modeloVO.AsignacionVO;
import modeloVO.InstructorVO;

public class AsignacionServiciosDAO {

    public static ResultSet getTabla(String sql) {
        Connection con = Conexion.getConnection();
        Statement st;
        ResultSet datos = null;
        try {
            st = con.createStatement();
            datos = st.executeQuery(sql);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return datos;
    }

    public void insertar(AsignacionVO avo) {
        String sql = "INSERT INTO asignacion (codigo, cliente, clase, fecha_ini, fecha_fin)"
                + " VALUES(?,?,?,?,?)";
        try (Connection conexion2 = Conexion.getConnection();
                PreparedStatement cons = conexion2.prepareStatement(sql)) {
            cons.setInt(1, avo.getCodigo());
            cons.setInt(2, avo.getCliente());
            cons.setInt(3, avo.getClase());
            cons.setString(4, avo.getFechaIn());
            cons.setString(5, avo.getFechaFin());

            cons.execute();
            JOptionPane.showMessageDialog(null, "Se guardó Instructor");

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    public boolean BuscarCliente(Integer cedula) {
        boolean esta = false;
        Integer cod2 = 0;
        String sql = "SELECT * FROM cliente WHERE cedula = '" + cedula + "'";
        try (Connection conexion3 = Conexion.getConnection();
                Statement declaracion = conexion3.createStatement();
                ResultSet rs = declaracion.executeQuery(sql)) {
            while (rs.next()) {
                cod2 = rs.getInt("cedula");
            }
            esta = Objects.equals(cod2, cedula);
        } catch (SQLException e) {
            System.err.println(e.getMessage());

        }
        return esta;
    }

    public void eliminar(Integer codigo) {
        try (Connection conexion3 = Conexion.getConnection();
                Statement declaracion = conexion3.createStatement()) {
            String sql = "DELETE FROM asignacion WHERE codigo = '" + codigo + "'";
            declaracion.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "Se eliminó Asignacion");
           

        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }

}
