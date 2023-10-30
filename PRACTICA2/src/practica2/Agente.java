/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica2;

import jade.core.Agent;
import java.io.IOException;
import java.util.Iterator;
import java.util.logging.Logger;


import jade.core.behaviours.CyclicBehaviour;

/**
 *
 * @author alegp
 */
public class Agente extends Agent{
    
    
    private int fil_ini;
    private int col_ini;
    
    private int fil_obj;
    private int col_obj;
    
    
    private int[][] myVision;
    

    public Agente() {
        this.myVision = new int [3][3];
        this.fil_ini = 0;
        this.col_ini = 0;
        this.fil_obj = 9;
        this.col_obj = 9;
        
    }
   
    
    
    @Override
    protected void setup() {
        try {
            System.out.println("HOLA! Soy el agente de practica2");
            System.out.println("My local-name is " + getAID().getLocalName());
            System.out.println("My GUID is " + getAID().getName());
            System.out.println("My addresses are: ");
            
         
            Iterator  it = getAID().getAllAddresses();
            while ( it.hasNext()) {
                System.out.println("-" + it.next());
            }
            
            ////////////////////  LECTURA DE MAPA ////////////////////
            Level myLevel = new Level("C:\\Users\\alegp\\OneDrive\\Escritorio\\DBA\\Practicas\\P2\\DBA\\PRACTICA2\\Mapas\\MapaConvexo.txt");            
            int [][] mapa;
            mapa = myLevel.getMap();
            
            addBehaviour(new CyclicBehaviour(this, 1000) {
                @Override
                protected void onTick() {
                        
                    
                    /*
                    if( me puedo mover y reduzco la distancia al objetivo )
                        move();
                    
                    
                    */
                }
        });
            
            //doDelete();
        } catch (IOException ex) {
            Logger.getLogger(Agente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
    }
    
    // devuelve la distancia estimada entre diferencia de filas y columnas por pitagoras al objetivo
    public float getDistance()
    
    ////////////////////  MOVIMIENTO Y VISION ////////////////////
    
    // actualiza la posicion en el mapa hacia una nueva casilla (si ha sido posible moverse hacia ella)
    public void move(int[][]& myvision, int fil, int col){
        
    }
            
    // devuelve si es posible moverse hacia alguna de las casillas dentro de myVision        
    public int[][] perceive(){
        
    }
    
    
    
    @Override
    public void takeDown() {
        System.out.println("Terminating agent...");
    }
    
}
