/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Heladeria;
import javax.swing.JFrame;
import vista.FrmPrincipal;
/**
 *
 * @author alumno
 */
public class Heladeria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        FrmPrincipal formulario = new FrmPrincipal();
        formulario.setExtendedState(JFrame.MAXIMIZED_BOTH);
        formulario.setVisible(true);
        
    }
    
}
