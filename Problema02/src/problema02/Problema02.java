/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema02;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author valeriayunga
 */
public class Problema02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
        
        int limite = 110;
        int numero = 2;
        int contador = 2;
        
        while (numero <= limite) {
            
             System.out.printf("%d ", numero);
             
             contador = contador + 2;
            numero= numero + contador;
              
            
        } 
            
         
        
    }
    
}
