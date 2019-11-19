package ServiciosDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Objects;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import modeloVO.ClienteVO;

public class ClienteServiciosDAO {

    public void registrar(ClienteVO cl) {
        String sql = "INSERT INTO cliente (cedula, nombre, apellido, direccion, telefono, fecha)"
                + "VALUES(?,?,?,?,?,?)";
        try (Connection co = Conexion.getConnection();
                PreparedStatement ps = co.prepareStatement(sql)) {

            ps.setInt(1, cl.getCedula());
            ps.setString(2, cl.getNombre());
            ps.setString(3, cl.getApellido());
            ps.setString(4, cl.getDireccion());
            ps.setString(5, cl.getTelefono());
            ps.setString(6, cl.getFechaIng());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Se registro Cliente");
        } catch (SQLException s) {
            JOptionPane.showMessageDialog(null, s);
        }
    }

    public boolean Buscar(Integer codigo) {
        boolean esta = false;
        Integer cod2 = 0;
        String sql = "SELECT * FROM cliente WHERE cedula = '" + codigo + "'";
        try (Connection conexion3 = Conexion.getConnection();
                Statement declaracion = conexion3.createStatement();
                ResultSet rs = declaracion.executeQuery(sql)) {
            while (rs.next()) {
                cod2 = rs.getInt("cedula");
            }
            esta = Objects.equals(cod2, codigo);
        } catch (SQLException e) {
            System.err.println(e.getMessage());

        }
        return esta;
    }

    public void actualizarCliente(ClienteVO clVo, Integer cedula) {
        String sql = "UPDATE cliente  SET cedula= '" + clVo.getCedula() + "', nombre = '" 
                + clVo.getNombre() + "', apellido = '" + clVo.getApellido()
                + "', direccion = '" + clVo.getDireccion() + "', telefono = '" + clVo.getTelefono() + "', fecha = '"
                + clVo.getFechaIng() + "' WHERE cedula = '" + cedula + "'";

        try (Connection conexion2 = Conexion.getConnection();
                PreparedStatement pst = conexion2.prepareStatement(sql)) {

            pst.executeUpdate();
            if (pst.executeUpdate() < 0) {
                JOptionPane.showMessageDialog(null, "No se actualizó Cliente");

            } else {
                JOptionPane.showMessageDialog(null, "Se actualizó Cliente");

            }

        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }

    public void Llenar(Integer cedula, JTextField nom, JTextField ape, JTextField dire, JTextField tel, JTextField fecha) {

        String sql = "SELECT * FROM cliente WHERE cedula = '" + cedula + "'";
        try (Connection conexion3 = Conexion.getConnection();
                Statement declaracion = conexion3.createStatement();
                ResultSet rs = declaracion.executeQuery(sql)) {
            while (rs.next()) {
                nom.setText(rs.getString("nombre"));
                ape.setText(rs.getString("apellido"));
                dire.setText(rs.getString("direccion"));
                tel.setText(rs.getString("telefono"));
                fecha.setText(rs.getString("fecha"));
            }
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }

    public void eliminarCliente(Integer cedula, ClienteVO cl) {
        try (Connection conexion3 = Conexion.getConnection();
                Statement declaracion = conexion3.createStatement()) {
            String sql = "DELETE FROM cliente WHERE cedula = '" + cedula + "'";
            declaracion.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "Se eliminó Cliente");
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }
}
