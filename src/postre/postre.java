/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package postre;

/**
 *
 * @author Estudiantes
 */
public abstract class postre {

    String sel;
    int a;
    int preferencia;

    public abstract void seleccion();

    public abstract void imprimir();

    public void setSel(String sel) {
        this.sel = sel;
    }

    public String getSel() {
        return sel;
    }
}
