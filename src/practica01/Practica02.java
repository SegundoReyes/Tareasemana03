
package practica01;
import java.util.Scanner;
public class Practica02 {
public static void main(String[] args){
    int edad;
 Scanner lectura = new Scanner(System.in);
 System.out.print("Ingresa tu edad: ");
        edad = lectura.nextInt();
        if (edad >= 18) {
            System.out.println("Eres mayor de edad.");
       }else {
            System.out.println("Eres menor de edad.");
       }
       }   
}
