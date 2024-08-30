
package practica01;
import java.util.Scanner;
public class Practica01 {
public static void main(String[] args) {
    int calif1, calif2, calif3;
        double promedio;
    Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa la primera calificación: ");
        calif1 = scanner.nextInt();
        System.out.print("Ingresa la segunda calificación: ");
        calif2 = scanner.nextInt();     
        System.out.print("Ingresa la tercera calificación: ");
        calif3 = scanner.nextInt();
        promedio = (calif1 + calif2 + calif3) / 3.0;   
        if (promedio >= 70) {
            System.out.println("Alumno aprobado");
        } else {
            System.out.println("Alumno reprobado");
        }
    }
    
}
