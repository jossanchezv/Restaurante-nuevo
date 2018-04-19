/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pp;

import javax.swing.JOptionPane;

/**
 *
 * @author Estudiantes
 */
public class ensalada extends pp {
        @Override
    public void seleccion() {
        int op= Integer.parseInt(JOptionPane.showInputDialog("Que ensalada desea? \n 1. Frutas \n 2. Verduras " ));
        switch (op){
            case 1:
                sel= "Frutas";
                break;
            case 2:
                sel= "Verduras";  
                break;
            default:
                sel= "Ninguno";
        }
    }
        @Override
        public void imprimir() {
        JOptionPane.showMessageDialog(null, sel);
    }

}
