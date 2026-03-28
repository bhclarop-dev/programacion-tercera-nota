import java.util.Scanner;

public class mayor_de_tres {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el numero 1 ");
        int numero1 = scanner.nextInt();
        System.out.println("Ingrese el numero 2 ");
        int numero2 = scanner.nextInt();
        System.out.println("Ingrese el numero 3 ");
        int numero3 = scanner.nextInt();

        if (numero1>numero2 && numero1>numero3) {
            System.out.println("El número: "+ numero1 + " ,es el mayor de los tres");
        }
        else if (numero2>numero3 && numero2>numero1) {
            System.out.println("El número: "+numero2+ " ,es el mayor de los tres");
        }
        else {
            System.out.println("El número: "+ numero3+ " ,es el mayor de los tres");

        }
        scanner.close();
    }  
 }


