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
public  class carnes extends pp {
        @Override
    public void seleccion() {
        JOptionPane.showMessageDialog(null, "El plato principal trae inicialmente arroz y papas a la francesa.");
        int op= Integer.parseInt(JOptionPane.showInputDialog("que carne desea? \n 1.Res \n 2.Cerdo \n 3.Pollo"));
        switch (op){
            case 1:
                sel= "Res";
                break;
            case 2:
                sel= "Cerdo";
                break;
            case 3:
                sel= "Pollo";   
                break;
            case 4:
                sel = "Vegetariana";
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
