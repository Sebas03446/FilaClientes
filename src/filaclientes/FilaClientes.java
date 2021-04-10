/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filaclientes;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;
import jdk.jfr.events.ExceptionThrownEvent;

/**
 *
 * @author Familia
 */
public class FilaClientes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        FilaClientes fila = new FilaClientes();
        int a = sc.nextInt();
        Queue<Object> listaClientes = new LinkedList<>();
        for(int i=0;i<a;i++){
            ClienteP nuevo = new ClienteP();
            ClienteG nuevo2 = new ClienteG();
            listaClientes.add(nuevo);
            listaClientes.add(nuevo2);
        }
        //fila.fila(listaClientes);
        fila.nodos(listaClientes);
    }
    public void fila(Queue<Object> listaClientes ){     // Metodo para resolver la fila con queue
        Queue<ClienteP> listaClientesP = new LinkedList<>();
        Queue<ClienteG> listaClientesG = new LinkedList<>();
        int cantidadClientes= listaClientes.size()/2;
        for(int i=0;i<cantidadClientes;i++){
            if( listaClientes.element().toString().equals("Cliente Preferencial")){
                listaClientesP.add((ClienteP) listaClientes.remove());
            }
            if( listaClientes.element().toString().equals("Cliente General")){
                listaClientesG.add((ClienteG) listaClientes.remove());
            }
        }
        int cantidadClientes2= listaClientesP.size();
        int cantidadClientes3= listaClientesG.size();
        for (int i = 0; i < cantidadClientes2; i++) {
            System.out.print("\n"+listaClientesP.element()  + "  " );
            System.out.print(listaClientesP.remove().horaLLegada   );
        }
        for (int i = 0; i < cantidadClientes3; i++) {
            System.out.print("\n"+listaClientesG.element()  + "  " );
            System.out.print(listaClientesG.remove().horaLLegada  +"\n" );
        }
    }
    public void nodos(Queue<Object> listaClientes ){    // Metodo para resolver la fila con nodos
        int cantidadClientes= listaClientes.size()/2;
        Node nodop = new Node();
        Node nodog = new Node();
        for(int i=0;i<cantidadClientes;i++){
            if( listaClientes.element().toString().equals("Cliente Preferencial")){
                nodop.insert(nodop, listaClientes.remove());
            }
            if( listaClientes.element().toString().equals("Cliente General")){
                nodog.insert(nodog, listaClientes.remove());
            }
        }
        for (int i = 0; i <nodop.length ; i++) {
            ClienteP clientep=(ClienteP) nodop.get(nodop).data;
            System.out.println("Cliente Preferencial " + clientep.horaLLegada);
        }
        for (int i = 0; i <nodog.length ; i++) {
            ClienteG clienteg=(ClienteG) nodog.get(nodog).data;
            System.out.println("Cliente Gerencial " + clienteg.horaLLegada);
        }
        
    }
   
    
}
