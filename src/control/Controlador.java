/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import ServiciosDAO.*;
import modeloVO.*;
import ServiciosDAO.Conexion;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import vista.*;

public class Controlador {

    
    Inicio inii = null;
    Clases claa = null;
    Clientes clii = null;
    Formulario fi = null;
    Instructores i = null;
    AsignacionClie agi = null;

   
    public void ruj(Inicio ini, Clases cla, Clientes cli, Formulario f, Instructores in, AsignacionClie ag) {
        
        this.inii = ini;
        this.i = in;
        this.claa = cla;
        this.clii = cli;
        this.agi = ag;
        this.fi = f;
        fi.setVisible(true);
        
        inii.setVisible(true);
        inii.setSize(800, 800);
        fi.jLayeredPane1.add(inii);
        
        clii.setSize(800, 800);
        clii.setVisible(true);
        fi.jLayeredPane2.add(clii);
        
        agi.setSize(800, 800);
        agi.setVisible(true);
        fi.jLayeredPane3.add(i);
        
        i.setSize(800, 800);
        i.setVisible(true);
        fi.jLayeredPane4.add(claa);
        
        claa.setSize(800, 800);
        claa.setVisible(true);
        fi.jLayeredPane5.add(agi);
        
    }
    //Clases
    public void ClaseLLenar(Integer codigo, JComboBox clases, JComboBox hora, JComboBox instructor) {
        try {
            ClaseServiciosDAO clase = new ClaseServiciosDAO();
            clase.Llenar(codigo, clases, hora, instructor);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
    public void ClaseInsertar(ClasesVO clases) {
        try {
            ClaseServiciosDAO clase = new ClaseServiciosDAO();
            clase.insertar(Conexion.getConnection(), clases);
        } catch (Exception e) {
            System.out.println(e);
        }
        
    }
    
    public void ClaseBorrar(Integer codigo, ClasesVO css) {
        try {
            ClaseServiciosDAO clase = new ClaseServiciosDAO();
            clase.eliminarIns(codigo, css);
        } catch (Exception e) {
            System.out.println(e);
        }
        
    }
    
    public void ClaseActualizar(ClasesVO css, Integer codigo) {
        try {
            ClaseServiciosDAO clase = new ClaseServiciosDAO();
            clase.actualizarIns(css, codigo);
        } catch (Exception e) {
            System.out.println(e);
        }
        
    }
    
    public boolean ClaseBuscar(Integer codigo) {
        boolean ff = false;
        try {
            ClaseServiciosDAO clase = new ClaseServiciosDAO();
            ff = clase.Buscar(codigo);
        } catch (Exception e) {
            System.out.println(e);
        }
        return ff;
    }

//Cliente
    public void ClienteRegistrar(ClienteVO cl) {
        try {
            ClienteServiciosDAO cliente = new ClienteServiciosDAO();
            cliente.registrar(cl);
        } catch (Exception e) {
            System.out.println(e);
        }
        
    }
    
    public boolean Clientebuscar(Integer codigo) {
        boolean ff = false;
        try {
            ClienteServiciosDAO cliente = new ClienteServiciosDAO();
            ff = cliente.Buscar(codigo);
        } catch (Exception e) {
            System.out.println(e);
        }
        return ff;
    }
    
    public void ClienteActualizar(ClienteVO clVo, Integer cedula) {
        try {
            ClienteServiciosDAO cliente = new ClienteServiciosDAO();
            cliente.actualizarCliente(clVo, cedula);
        } catch (Exception e) {
            System.out.println(e);
        }
        
    }
    
    public void ClienteLlenar(Integer cedula, JTextField nom, JTextField ape, JTextField dire, JTextField tel, JTextField fecha) {
        try {
            ClienteServiciosDAO cliente = new ClienteServiciosDAO();
            cliente.Llenar(cedula, nom, ape, dire, tel, fecha);
        } catch (Exception e) {
            System.out.println(e);
        }
        
    }
    
    public void ClienteEliminar(Integer cedula, ClienteVO cl) {
        try {
            ClienteServiciosDAO cliente = new ClienteServiciosDAO();
            cliente.eliminarCliente(cedula, cl);
        } catch (Exception e) {
            System.out.println(e);
        }
        
    }

//Instructor
    public void InstructorRegistrar(InstructorVO inss) {
        try {
            InstructorServiciosDAO ins = new InstructorServiciosDAO();
            ins.insertar(inss);
        } catch (Exception e) {
            System.out.println(e);
        }
        
    }
    
    public boolean InstructorBuscar(Integer codigo) {
        boolean ff = false;
        try {
            
            InstructorServiciosDAO ins = new InstructorServiciosDAO();
            ff = ins.Buscar(codigo);
        } catch (Exception e) {
            System.out.println(e);
        }
        return ff;
    }
    
    public void InstructorLlenar(Integer codigo, JTextField nom, JTextField ape,
            JTextField tel, JComboBox jor, JComboBox hora, JComboBox esp) {
        try {
            InstructorServiciosDAO ins = new InstructorServiciosDAO();
            ins.Llenar(codigo, nom, ape, tel, jor, hora, esp);
        } catch (Exception e) {
            System.out.println(e);
        }
        
        
    }
    
    public void InstructorActulizar(InstructorVO inss, Integer codigo) {
        try {
            InstructorServiciosDAO ins = new InstructorServiciosDAO();
            ins.actualizarIns(inss, codigo);
            
        } catch (Exception e) {
            System.out.println(e);
        }
        
    }
    
    public void InstructorEliminar(Integer codigo, InstructorVO inss) {
        try {
           InstructorServiciosDAO ins = new InstructorServiciosDAO();
           ins.eliminarIns(codigo, inss);
        } catch (Exception e) {
            System.out.println(e);
        }
        
    }

    //Asignacion
    public void AsignacionRegistrar(AsignacionVO avo) {
        try {
            AsignacionServiciosDAO ag= new AsignacionServiciosDAO();
            ag.insertar(avo);
        } catch (Exception e) {
            System.out.println(e);
        }
        
    }
    public boolean AsignacionBuscar(Integer cedula) {
        boolean ff=false;
        
        try {
            AsignacionServiciosDAO ag= new AsignacionServiciosDAO();
            ff= ag.BuscarCliente(cedula);
        } catch (Exception e) {
            System.out.println(e);
        }
        return ff;
    }
     public void AsignacionEliminar(Integer cod) {
        try {
            AsignacionServiciosDAO ag= new AsignacionServiciosDAO();
            ag.eliminar(cod);
        } catch (Exception e) {
            System.out.println(e);
        }
        
    }
    
}
