package unidad1;
import java.util.Scanner;

public class ParcialDePractica {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el número 1 ");
        int num1= scanner.nextInt();
        System.out.println("Ingrese el número 2 ");
        int num2= scanner.nextInt();

        if (num1>=num2 && num2!=0) {
            int suma= num1+num2;
            int resta= num1-num2;
            System.out.println("La suma es de: "+suma+", y la diferencia de: "+resta);
        }
            else if (num1<num2 && num2!=0) {
                 int producto = num1*num2;
                 double division= (double)num1/num2;
                 System.out.println("El producto es de: "+producto+" y su division: "+division);
                
            }
            else {
                 int producto = num1*num2;
                 System.out.println("El producto es de: "+producto+" y su division no es posible entre cero");
            }

        scanner.close();
    }
    
}
