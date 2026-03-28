import java.util.Scanner;

public class tres_opciones {
    public static void main(String[] args) throws Exception {
         Scanner scanner = new Scanner(System.in);
        System.out.println("1. Saludar");
        System.out.println("2 Mostrar Fecha ");
        System.out.println("3. Salir");

        System.out.println("Seleccione la opción que desea ");
        int opcion = scanner.nextInt();


        switch (opcion) {
            case 1:
                System.out.println("Hola usuario");
                break;
            case 2:
                System.out.println("Hoy es un buen dia para morir ");
                break;
            case 3:
                System.out.println("Programa finalizado");
                break;
        
            default:
                System.out.println("Opción inválida ") ;

                break;
        }
        scanner.close();
    }
}
