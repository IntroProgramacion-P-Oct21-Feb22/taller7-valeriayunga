/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema01;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author valeriayunga
 */
public class Problema01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        String nombre;
        int edad;
        String posicion;
        double estatura;
        String cadena = "";
        String salida = "";
        double contador_edades =0;
        double contador_estatura =0;
        double suma_edades =0;
        double suma_estatura =0;
        double promedio_edades ;
        double promedio_estatura;
        boolean bandera = true ;
        int acumulador = 0;
        do{
        System.out.println("Ingrese el nombre del jugador");
        nombre = entrada.nextLine();

        System.out.println("Ingrese la edad del jugador");
        edad = entrada.nextInt();
        
        entrada.nextLine();  
        
        System.out.println("Ingrese la posición del jugador");
            posicion = entrada.nextLine();
            
        System.out.println("Ingrese la estatura del jugador");
        estatura = entrada.nextDouble();
        
        contador_edades = contador_edades + 1;
        
        contador_estatura= contador_estatura + 1;
        
        suma_edades = suma_edades + edad;
        
        suma_estatura = suma_estatura + estatura;    
        
        acumulador = acumulador + 1;
        
         cadena = String.format("%s %d) %s -%s-, edad %d, estatura %.2f\n\n"
                 + "",cadena,acumulador,nombre,posicion,edad,estatura);
         
         entrada.nextLine();
        System.out.println("Ingrese (s),(si),"
                    + " (yes)o (y) si desea salir del ciclo ");
            salida = entrada.nextLine();

            if (salida.equals("s")||salida.equals("si")||salida.equals("yes")
                    ||salida.equals("YES")||salida.equals("SI"))
            {
                bandera = false;
            }
         }while (bandera);
        
        promedio_edades = suma_edades / contador_edades;
        
        promedio_estatura =suma_estatura / contador_edades;
        
        cadena = String.format("%s Promedio de edades:%.2f Promedio de"
                + " estaturas: %.2f", cadena,
               promedio_edades,promedio_estatura );
        
        System.out.printf("Listado de jugadores\n%s\n", cadena);

    }

}
