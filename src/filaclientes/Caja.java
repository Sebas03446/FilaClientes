/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filaclientes;

/**
 *
 * @author Familia
 */
public class Caja {
    int id;
    boolean disponibilidad;

    public Caja() {
        this.id+=1;
        this.disponibilidad=false;
    }
    public void disponibilidadCaja(Caja c){
        c.disponibilidad=true;
    }
    
    
}
