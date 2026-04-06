package unidad1;
import java.util.Scanner;
public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int [] A = new int[5];
        int [] B = new int[5];
        int [] C = new int[5];
        int suma= 0;

        for (int i = 0; i < A.length; i++) {
            System.out.println("llene vector A-"+ i);
            A[i] = scanner.nextInt();
            
        }
        for (int i = 0; i < B.length; i++) {
            System.out.println("Llene el vector B-"+i);
            B[i] = scanner.nextInt();
        }
        for (int i = 0; i < C.length; i++) {
            C[i] = A[i] + B[i];
            suma= suma+ C[i];
            
        }
        for (int i = 0; i < A.length; i++) {
            System.out.println("A"+i+" = "+A[i]);
        }
        for (int i = 0; i < B.length; i++) {
            System.out.println("B"+i+" = "+B[i]);
        }
        for (int i = 0; i < C.length; i++) {
            System.out.println("C"+i+" = "+ C[i]);
        }
         System.out.println("La suma total de C es: "+ suma);

       scanner.close();
    }
}