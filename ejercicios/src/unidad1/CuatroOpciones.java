package unidad1;
import java.util.Scanner;

public class CuatroOpciones {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bienvenido, escoja la opcion que desea");
        System.out.println("1. Sumar ");
        System.out.println("2. Restar ");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir ");

        int opcion = scanner.nextInt();
        System.out.println(" Ingrese el primer número ");
        int numero1 = scanner.nextInt();
        System.out.println("Ingrese el segundo número ");
        int numero2 = scanner.nextInt();
        switch (opcion) {
            case 1:
                System.out.println("El resultado es: "+(numero1+numero2));
                break;
            case 2: 
                System.out.println("El resultado es: "+ (numero1-numero2));
                break;
            case 3: 
                System.out.println("El resultado es: "+ (numero1*numero2));
                break;
            case 4: 
               if (numero2 != 0) {
                System.out.println("El resultado es: "+ (numero1/numero2));}
            else {
                System.out.println("No es posible dividir por cero");      
            }
            break;
            
            default:
                System.out.println("Opción no válida");
                break;

        }
        scanner.close();
    }
}