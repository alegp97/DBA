/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica2;
import jade.core.behaviours.CyclicBehaviour;
/**
 *
 * @author rorris
 */
public class BuscaObjetivo extends CyclicBehaviour {
    
    private Agente agente;
    private int[][] map;
    
    public BuscaObjetivo( Agente agente, int[][] map){
        this.agente = agente;
        this.map = map;
    }
    
    @Override
    public void action(){
        if(agente.getFil_actual() != agente.getFil_obj() && agente.getCol_actual() != agente.getCol_obj()){
            see(agente.getMyVision(), agente.getFil_actual(), agente.getCol_actual(), map);
            
        }
        
        else{
            
        }
    }
    
     public void see(int[][] vision, int filaActual, int colActual, int[][] map){
      
        
        int visionFila = 0;
        int visionColumna = 0;

        // Recorremos un bucle para copiar los valores de map a vision
        for (int i = filaActual - 1; i <= filaActual + 1; i++) {
            for (int j = colActual - 1; j <= colActual + 1; j++) {
                // Comprobamos si la posición está dentro de los límites de map
                if (i >= 0 && i < map.length && j >= 0 && j < map[0].length) {
                    vision[visionFila][visionColumna] = map[i][j];
                } else {
                    // Si está fuera de rango, colocamos un 1 en vision
                    vision[visionFila][visionColumna] = 1;
                }

                visionColumna++;
            }
            visionFila++;
            visionColumna = 0;
        }
        
        for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    System.out.print(vision[i][j] + " ");
                }
                System.out.println();
        }
    }
    
   
    
}
