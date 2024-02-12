/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tarea.pkg2;
import java.util.Scanner;
/**
 *
 * @author Aleja
 */
public class Tarea2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        System.out.println("Elija una opcion que desee realizar");
        int opcion;
        
        do {
            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Multiplicacion");
            System.out.println("4. Division");
            System.out.println("");
            opcion = scanner.nextInt();
            
            if (opcion == 1) {
                System.out.println("Por favor colocal los números que desea sumar");
                System.out.println("");
                int a = 0;
                int b = 0;
                int c = 0;
                a = scanner.nextInt();
                System.out.println("");
                b = scanner.nextInt();
                System.out.println("");
                c = a + b;
                System.out.println("la suma de " + a + "+" + b + " es: ");
                System.out.println(c);
                System.out.println("");
                
            }
        } while (opcion !=4);
        
    }
    
}
