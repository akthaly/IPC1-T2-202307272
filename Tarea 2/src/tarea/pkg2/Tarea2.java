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
                
                suma(scanner);
            }
            
            if (opcion == 2) {
                
                resta(scanner);
            }
            
            if (opcion == 3) {
                
                multiplicacion(scanner);
                
            }
            
            if (opcion == 4) {
                
                division(scanner);
                
            }
        } while (opcion !=4);
        
    }
    public static void suma(Scanner scanner){
        System.out.println("Por favor colocar dos numeros que desea sumar");
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
    public static void resta(Scanner scanner){
        int a=0;
        int b=0;
        int c=0;
        
        System.out.println("Coloque dos numeros que desee restar: ");
        System.out.println("");
        System.out.println("Coloque el minuendo");
        System.out.println("");
        a = scanner.nextInt();
        System.out.println("");
        System.out.println("Coloque el sustraendo");
        System.out.println("");
        b = scanner.nextInt();
        System.out.println("");
        System.out.println("La diferencia es: ");
        c = a-b;
        System.out.println(c);
        System.out.println("");
    }
    
    public static void multiplicacion(Scanner scanner){
        int a=0;
        int b=0;
        int c=0;
        
        System.out.println("Coloque dos numeros que desee multiplicar: ");
        System.out.println("");
        a = scanner.nextInt();
        System.out.println("");
        b = scanner.nextInt();
        System.out.println("");
        c = a*b;
        System.out.print("La multiplicacion de " + a + "*" + b + " es: ");
        System.out.println(c);
        System.out.println("");
        
    }
    public static void division(Scanner scanner){
        System.out.println("Coloque dos números que desee dividir");
        System.out.println("");
        int numerador = 1;
        int denominador = 1;
        int resultado = 0;
        System.out.println("Coloque el numerador: ");
        numerador = scanner.nextInt();
        System.out.println("");
        System.out.println("Coloque el denominador");
        denominador = scanner.nextInt();
        System.out.println("");
        if (denominador != 0){
            resultado = numerador / denominador;
            System.out.println("La division de " + numerador + "/" + denominador + "es: ");
            System.out.println("");
            System.out.println(resultado);
        }
        else{
            System.out.println("No se puede dividir dentro de cero, vuelva a ingresar datos: ");
            System.out.println("");
        }
        
            
        
}
    
}
