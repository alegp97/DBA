/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica2;

import jade.core.Profile;
import jade.core.ProfileImpl;
import jade.wrapper.AgentController;
import jade.wrapper.ContainerController;
import jade.wrapper.StaleProxyException;
import java.io.IOException;

/**
 *
 * @author alegp
 */
public class PRACTICA2{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        System.out.println("Empezando main ");
        jade.core.Runtime rt = jade.core.Runtime.instance();
        Profile p = new ProfileImpl();
        p.setParameter(Profile.MAIN_HOST, "localhost"); // Cambia a tu dirección de host si es diferente
        p.setParameter(Profile.CONTAINER_NAME, "Contenedor1"); // Puerto predeterminado de JADE

        
        
        
        Level level = new Level("C:\\Users\\alegp\\OneDrive\\Escritorio\\DBA\\Practicas\\P2\\DBA\\PRACTICA2\\Mapas\\MapaConvexo.txt");
  
        int[][] map = level.getMap();
        // Imprimir el mapa
        for (int i = 0; i < level.getFilas(); i++) {
            for (int j = 0; j < level.getColumnas(); j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
        
        
        
        ContainerController cc = rt.createAgentContainer(p);
        try {
            AgentController ac = cc.createNewAgent("PRACTICA2", Agente.class.getCanonicalName(), null);
                ac.start();
            }catch (StaleProxyException ex) {
            }
    }
    
    

    
}
