/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica2;

import jade.core.Agent;
import java.util.Iterator;

/**
 *
 * @author alegp
 */
public class PRACTICA2 extends Agent{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
    
    @Override
    protected void setup() {
            System.out.println("HOLA! Soy el agente de practica2");
            
            System.out.println("My local-name is " + getAID().getLocalName());
            System.out.println("My GUID is " + getAID().getName());
            System.out.println("My addresses are: ");
            
            
            Iterator  it = getAID().getAllAddresses();
            while ( it.hasNext()) {
                System.out.println("-" + it.next());
            }
            
            doDelete();
    }
    
    @Override
    public void takeDown() {
        System.out.println("Terminating agent...");
    }
    
    
}
