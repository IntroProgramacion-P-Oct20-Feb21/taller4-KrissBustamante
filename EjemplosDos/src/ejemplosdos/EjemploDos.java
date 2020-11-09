/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplosdos;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class EjemploDos {
    // 1. Inicio
    public static void main(String[] args) {
        
        // declaro las variables
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        // 2. largo, d[0, n]
        double largo;
        // 3. ancho, d[0, n]
        double ancho;
        // 4. area, d[0, n]
        double area;
        // 5. costoMetro, d[0, n]
        double costoMetro;
        // 6. costoTerreno, d[0, n]
        double costoTerreno;
        String comprador;
        
         
        // pido datos por teclado - entradas
        // 7. Escribir "Ingrese el largo del terreno"
        System.out.println("Ingrese el largo del terreno");
        // 8. Leer largo
        largo = entrada.nextDouble();
        // 9. Escribir "Ingrese el ancho del terreno"
        System.out.println("Ingrese el ancho del terreno");
        // 10. Leer ancho
        ancho = entrada.nextDouble();
        // 11. Escribir "Ingrese el costo del m2 del terreno"
        System.out.println("Ingrese el costo del m2 del terreno");
        // 12. Leer costoMetro
        costoMetro = entrada.nextDouble();
         entrada.nextLine();
         
        System.out.println("Ingrese el nombre del comprador");        
        comprador= entrada.nextLine();
       

        // proceso
        // 13. area <-- largo * ancho
        area = largo * ancho;
        // 14. costoTerreno <-- area * costoMetro
        costoTerreno = area * costoMetro;    
        
        // salida
        // 15. Escribir "El costo del terreno es :" + costoTerreno
        System.out.printf("El costo del terreno es : %.2f\n"+ 
                "El comprador es: %s\n ", 
                costoTerreno,
                comprador);
        // el costo del terreno es: 10000 y el cpmprador es Rene Elizalde)
    } // 16. Fin
}
