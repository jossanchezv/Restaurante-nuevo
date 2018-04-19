/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pp;

import javax.swing.JOptionPane;

/**
 *
 * @author ASUS
 */
public class legumbre extends pp {

    @Override
    public void seleccion() {
        int op = Integer.parseInt(JOptionPane.showInputDialog("Que desea para acompañar? \n 1.lenteja \n 2.arveja \n 3.ahuyama"));
        switch (op) {
            case 1:
                sel = "lenteja";
                break;
            case 2:
                sel = "arveja";
                break;
            case 3:
                sel = "ahuyama";
                break;
            default:
                sel = "Ninguno";
        }
    }

    @Override
    public void imprimir() {
        JOptionPane.showMessageDialog(null, sel);
    }
}
