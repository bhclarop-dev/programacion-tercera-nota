package unidad1;
import java.util.Scanner;

public class NumeroMas10
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número: ");
        int numero = scanner.nextInt();
        int resultado = numero + 10;
        System.out.println("El resultado es: " + resultado);
        scanner.close();
    }
}