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
    
    private int fil_actual;
    private int col_actual;
    
    private int fil_obj;
    private int col_obj;
    
    
    private int[][] myVision;
    

    public Agente() {
        this.myVision = new int [3][3];
        this.fil_ini = 0;
        this.col_ini = 1;
        this.fil_actual = fil_ini;
        this.col_actual = col_ini;
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
             Level level = new Level("/home/rorris/Documentos/DBAConjunto/DBA/Mapas/Mapa0.txt");
  
            int[][] map = level.getMap();
            // Imprimir el mapa
            for (int i = 0; i < level.getFilas(); i++) {
                for (int j = 0; j < level.getColumnas(); j++) {
                    System.out.print(map[i][j] + " ");
                }
                System.out.println();
            }
            
            addBehaviour(new BuscaObjetivo(this, map));
            
                    
  
            //doDelete();
        } catch (IOException ex) {
            Logger.getLogger(Agente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        
        
    }

    public int getFil_ini() {
        return fil_ini;
    }

    public int getCol_ini() {
        return col_ini;
    }

    public int getFil_actual() {
        return fil_actual;
    }

    public int getCol_actual() {
        return col_actual;
    }

    public int getFil_obj() {
        return fil_obj;
    }

    public int getCol_obj() {
        return col_obj;
    }

    public int[][] getMyVision() {
        return myVision;
    }
    
   
    
    
    
    /*
    // devuelve la distancia estimada entre diferencia de filas y columnas por pitagoras al objetivo
    public float getDistance()
    
    ////////////////////  MOVIMIENTO Y VISION ////////////////////
    
    // actualiza la posicion en el mapa hacia una nueva casilla (si ha sido posible moverse hacia ella)
    public void move(int[][]& myvision, int fil, int col){
        
    }
            
    // devuelve si es posible moverse hacia alguna de las casillas dentro de myVision        
    public int[][] perceive(){
        
    }
  */  
    
    
    @Override
    public void takeDown() {
        System.out.println("Terminating agent...");
    }
    
}

