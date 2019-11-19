package ServiciosDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Objects;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import modeloVO.InstructorVO;

public class InstructorServiciosDAO {
//codigo SQL

    public void insertar(InstructorVO ins) {
        String sql = "INSERT INTO instructor(codigo, nombre, apellido, telefono, especialidad, jornada, hora)"
                + " VALUES(?,?,?,?,?,?,?)";
        try (Connection conexion2 = Conexion.getConnection();
                PreparedStatement cons = conexion2.prepareStatement(sql)) {
            cons.setInt(1, ins.getCedula());
            cons.setString(2, ins.getNombre());
            cons.setString(3, ins.getApellido());
            cons.setString(4, ins.getTelefono());
            cons.setString(5, ins.getEspecialidad());
            cons.setString(6, ins.getJornada());
            cons.setString(7, ins.getHora());
            cons.execute();
            JOptionPane.showMessageDialog(null, "Se guardó Instructor");

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    public boolean Buscar(Integer codigo) {
        boolean esta = false;
        Integer cod2 = 0;
        String sql = "SELECT codigo FROM instructor WHERE codigo = '" + codigo + "'";
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

    public void Llenar(Integer codigo, JTextField nom, JTextField ape,
            JTextField tel, JComboBox jor, JComboBox hora, JComboBox esp) {
        String hor = "", jorn = "", espe = "";
        String sql = "SELECT * FROM instructor WHERE codigo = '" + codigo + "'";
        try (Connection conexion3 = Conexion.getConnection();
                Statement declaracion = conexion3.createStatement();
                ResultSet rs = declaracion.executeQuery(sql)) {

            while (rs.next()) {

                nom.setText(rs.getString("nombre"));
                ape.setText(rs.getString("apellido"));
                tel.setText(rs.getString("telefono"));
                hor = rs.getString("hora");
                jorn = rs.getString("jornada");
                espe = rs.getString("especialidad");

            }
            if (espe.equalsIgnoreCase("Yoga")) {
                esp.setSelectedIndex(1);
            }
            if (espe.equalsIgnoreCase("Aquaerobics")) {
                esp.setSelectedIndex(2);
            }
            if (espe.equalsIgnoreCase("Bailoterapia")) {
                esp.setSelectedIndex(3);
            }
            if (espe.equalsIgnoreCase("Bodycombat")) {
                esp.setSelectedIndex(4);
            }
            if (espe.equalsIgnoreCase("Entrenamiento funcional")) {
                esp.setSelectedIndex(5);
            }
            if (espe.equalsIgnoreCase("Spining")) {
                esp.setSelectedIndex(5);
            }
            if (jorn.equalsIgnoreCase("Mañana")) {
                jor.setSelectedIndex(1);
            }
            if (jorn.equalsIgnoreCase("Tarde")) {
                jor.setSelectedIndex(2);
            }
            if (jorn.equalsIgnoreCase("Noche")) {
                jor.setSelectedIndex(3);
            }
            if (hor.equalsIgnoreCase("6:00 am - 7:00 am")) {
                hora.setSelectedIndex(0);
            }
            if (hor.equalsIgnoreCase("7:00 am - 8:00 am")) {
                hora.setSelectedIndex(1);
            }
            if (hor.equalsIgnoreCase("8:00 am - 9:00 am")) {
                hora.setSelectedIndex(2);
            }
            if (hor.equalsIgnoreCase("9:00 am - 10:00 am")) {
                hora.setSelectedIndex(3);
            }
            if (hor.equalsIgnoreCase("6:00 am - 7:00 am")) {
                hora.setSelectedIndex(4);
            }
            if (hor.equalsIgnoreCase("3:00 pm - 4:00 pm")) {
                hora.setSelectedIndex(5);
            }
            if (hor.equalsIgnoreCase("4:00 pm - 5:00 pm")) {
                hora.setSelectedIndex(6);
            }
            if (hor.equalsIgnoreCase("5:00 pm - 6:00 pm")) {
                hora.setSelectedIndex(7);
            }
            if (hor.equalsIgnoreCase("6:00 pm - 7:00 pm")) {
                hora.setSelectedIndex(8);
            }
            if (hor.equalsIgnoreCase("7:00 pm - 8:00 pm")) {
                hora.setSelectedIndex(9);
            }
            if (hor.equalsIgnoreCase("8:00 pm - 9:00 pm")) {
                hora.setSelectedIndex(10);
            }

        } catch (SQLException e) {
            System.err.println(e.getMessage());

        }
    }

    public void actualizarIns(InstructorVO ins, Integer codigo) {
        String sql = "UPDATE instructor SET codigo= '" + ins.getCedula() + "', nombre = '" + ins.getNombre()
                + "', apellido = '" + ins.getApellido() + "', telefono = '" + ins.getTelefono() 
                + "', jornada = '" + ins.getJornada() + "', especialidad = '"
                + ins.getEspecialidad() + "', hora = '" + ins.getHora() + "' WHERE codigo = '" + codigo + "'";

        try (Connection conexion2 = Conexion.getConnection();
                PreparedStatement pst = conexion2.prepareStatement(sql)) {
            JOptionPane.showMessageDialog(null, "Se actualizó Instructor");

            pst.execute();

        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }

    public void eliminarIns(Integer codigo, InstructorVO ins) {
        try (Connection conexion3 = Conexion.getConnection();
                Statement declaracion = conexion3.createStatement()) {
            String sql = "DELETE FROM instructor WHERE codigo = '" + codigo + "'";
            declaracion.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "Se eliminó Instructor");

        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }

}
