/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pp;

/**
 *
 * @author Estudiantes
 */
public abstract class pp {

    String sel;

    public abstract void imprimir();

    public abstract void seleccion();

    public void setSel(String sel) {
        this.sel = sel;
    }
    public String getSel() {
        return sel;
    }
}
