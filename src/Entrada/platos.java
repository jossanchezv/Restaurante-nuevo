/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entrada;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Estudiantes
 */
public class platos extends entrada {

    Scanner as = new Scanner(System.in);

    @Override
    public void seleccion() {

        preferencia = Integer.parseInt(JOptionPane.showInputDialog("Fruta o Sopa \n 1. Fruta \n 2. Sopa"));
        if (preferencia == 1) {

            int anadir = Integer.parseInt(JOptionPane.showInputDialog("La fruta se compone de: Papaya, fresa y melón, desea agregar algo más? \n 1. Si \n 2. No "));

            int op = 0;
            if (anadir == 1) {
                op = Integer.parseInt(JOptionPane.showInputDialog("Que otro ingrediente desea \n 1. Uvas \n2. Cerezas \n3. Banano"));
                switch (op) {
                    case 1: {
                        sel = "Papaya,fresa, melón, uvas";
                        break;
                    }
                    case 2:
                        sel = "Papaya,fresa, melón,cerezas";
                        break;
                    case 3:
                        sel = "Papaya, fresa, melón, banano";
                        break;
                    default:
                        sel = "Papaya, fresa, melón";
                }
            }
            if (anadir == 2) {
                sel = "Papaya, fresa, melón";
            }
        }
        if (preferencia == 2) {
            int op;
            op = Integer.parseInt(JOptionPane.showInputDialog("Que sopa desea? \n 1.Ajiaco \n 2.Arroz \n 3Colisero"));
            switch (op) {
                case 1:
                    sel = "Sopa de Ajiaco";
                    break;
                case 2:
                    sel = "Sopa de Arroz";
                    break;
                case 3:
                    sel = "Sopa de Colisero";
                    break;
                default:
                    sel = "Ninguno";
            }
        }
    }

    @Override
    public void imprimir() {
        JOptionPane.showMessageDialog(null, sel);
    }
}
