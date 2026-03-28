import java.util.Scanner;

public class punto2_parcial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese nota 1 ");
        double n1= scanner.nextDouble();
        System.out.println("Ingrese nota 2");
        double n2 = scanner.nextDouble();
        System.out.println("Ingrese nota 3");
        double n3=  scanner.nextDouble();
        if (n1>=0.0 && n1<=10.0 && n2>=0.0 && n2<=10.0 && n3>=0.0 && n3<=10.0) {
            double promedio = (n1+n2+n3)/3;
            if (promedio>=7.0) {
                System.out.println("El promedio es de: "+ promedio+" ,promocionado"); 
            }
            if (promedio>=4.0 && promedio<7.0) {
                System.out.println("El promedio es de: "+ promedio+" ,regular"); 
            }
            if (promedio<4.0) {
                System.out.println("El promedio es de: "+ promedio+" ,reprobado"); 
            }
        }
        else{
            System.out.println("Todas las notas deben estar entre 0.0 y 10.0");
        }


        scanner.close();
    }
}
