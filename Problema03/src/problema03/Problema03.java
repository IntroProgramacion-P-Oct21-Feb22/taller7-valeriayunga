/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema03;

/**
 *
 * @author valeriayunga
 */
public class Problema03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int limite = 37;
        int numero = 2;
        int contador = 3 ;
        String cadena ="";
        
           do {
            // para manejar el signo asociado 
            
            cadena = String.format("%s%d ", 
                    cadena,
                    numero);
            
          
                numero = numero  + contador;
                contador = contador + 2;
        } while (numero <= limite);
           
          System.out.println(cadena);     
    }
    
}
