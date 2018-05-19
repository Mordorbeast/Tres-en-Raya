
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SISCU
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Tablero t = new Tablero();
        String cadena,ficha = " ";
        int posicion = 0;
        boolean salir = false;

        
        do{
            t.mostrarTablero();
            System.out.println(" ");

            if(t.J1Juega == true){
                ficha = "X";
                System.out.println("Juega el jugador 1 (X)");
            }else{
                ficha = "O";
                System.out.println("Juega el jugador 2 (O)");
            }

            
            
        }while(salir == false);
        
        t.mostrarTablero();
        
        t.quienGana(t.tresEnRaya());
        
        
        
        
    }
}
