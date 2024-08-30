
package practica01;
import java.util.Scanner;
public class Practica03 {
   public static void main(String[] args) {
        int num1, num2, num3, mayor;
        Scanner scanner = new Scanner(System.in);
        // Proceso: Ingreso de datos
        System.out.print("Ingresa el primer número: ");
        num1 = scanner.nextInt();
        System.out.print("Ingresa el segundo número: ");
        num2 = scanner.nextInt();
        System.out.print("Ingresa el tercer número: ");
        num3 = scanner.nextInt();
        if (num1 > num2 && num1 > num3) {
            mayor = num1;
        } else if (num2 > num1 && num2 > num3) {
            mayor = num2;
        } else {
            mayor = num3;
        System.out.println("El número mayor es: " + mayor);
     }   
    }
   } 
