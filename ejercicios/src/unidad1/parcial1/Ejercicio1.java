package unidad1.parcial1;
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el nombre del empleado");
        String name = scanner.nextLine();
        System.out.println("Ingrese documento de identificación");
        int documento = scanner.nextInt();
        System.out.println("Ingrese puntaje de desempeño");
        int puntaje= scanner.nextInt();
        if (puntaje>=90 && puntaje<=100) {
           System.out.println("Nombre: "+name);
                System.out.println("Documento: "+documento);
                System.out.println("Puntaje: "+puntaje);
                System.out.println("Desempeño Sobresaliente ");
        }
            else if (puntaje>=0 && puntaje<=59) {
                System.out.println("Nombre: "+name);
                System.out.println("Documento: "+documento);
                System.out.println("Puntaje: "+puntaje);
                System.out.println("Desempeño Insuficiente");
            }
            else if (puntaje>=60 && puntaje<=74) {
                System.out.println("Nombre: "+name);
                System.out.println("Documento: "+documento);
                System.out.println("Puntaje: "+puntaje);
                System.out.println("Desempeño Aceptable");
            }
            else if (puntaje>=75  && puntaje<=89 ) {
                System.out.println("Nombre: "+name);
                System.out.println("Documento: "+documento);
                System.out.println("Puntaje: "+puntaje);
                System.out.println("Desempeño Bueno ");
            }
            else {
                System.out.println("Valor invalido");
            }
            
        scanner.close();
    

    }
}