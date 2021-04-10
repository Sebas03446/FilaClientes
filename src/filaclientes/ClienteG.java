/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filaclientes;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

/**
 *
 * @author Familia
 */
public class ClienteG{
    private String id;
    DateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
    Date date = new Date();
    String horaLLegada;
    public ClienteG() {
        this.id="G";
        this.horaLLegada=dateFormat.format(date);
    }
    @Override
    public String toString() {
        return "Cliente General" ; //To change body of generated methods, choose Tools | Templates.
    }
    
}
