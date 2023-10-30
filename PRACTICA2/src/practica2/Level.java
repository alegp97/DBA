package practica2;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Level {

    private int[][] map;
    private int size_filas, size_columnas;

    public Level(String filename) throws FileNotFoundException, IOException {
        loadMap(filename);
    }
    
    private void loadMap(String filename) throws FileNotFoundException, IOException{
        BufferedReader br = new BufferedReader(new FileReader(filename));
        String line = br.readLine();
     
        size_filas = Integer.parseInt(line);
        System.out.println("filas: " + size_filas);
        
        line = br.readLine();
        size_columnas = Integer.parseInt(line);
        System.out.println("columnas: " + size_columnas);
        
        map = new int[size_filas][size_columnas];

        
        for (int fila = 0; fila < size_filas; fila++) {
            line = br.readLine();
            String[] numeros = line.split("\t");
            for (int columna = 0; columna < size_columnas; columna++) {
                map[fila][columna] = Integer.parseInt(numeros[columna]);
            }
        }

    }

   
    public int[][] getMap(){
        return map;
    }
    
    public int getFilas(){
        return size_filas;
    }
    
    public int getColumnas(){
        return size_columnas;
    }
 
}