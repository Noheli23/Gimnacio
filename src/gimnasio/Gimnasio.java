/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gimnasio;


import control.Controlador;
import vista.*;

/**
 *
 * @author Claudia
 */
public class Gimnasio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        Inicio ini = new Inicio();
        Clases cla = new Clases();
        Clientes cli = new Clientes();
        Formulario f = new Formulario();
        Instructores in = new Instructores();
        AsignacionClie ag = new AsignacionClie();
        f.setVisible(true);
 Controlador con = new Controlador();
 con.ruj(ini, cla, cli, f, in, ag);

    }

}
