import java.util.Scanner;

public class entrada_salida {
    public static void main(String[] args) throws Exception {
         Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el primer número: ");
        int num1 = scanner.nextInt();
        System.out.print("Ingrese el segundo número: ");
        int num2 = scanner.nextInt();
        System.out.print("Ingrese el tercer numero ");
        int num3 = scanner.nextInt();

        boolean resultado = (num1 > num2) && (num1 > num3 );

        System.out.println("¿El primer número es mayor que el segundo y el tercero? " + resultado);
        scanner.close();

    }
}
