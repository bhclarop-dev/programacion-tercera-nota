package unidad2;

import java.util.Scanner;

public class EdadesEvento {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int cantidadPersonas;
        int entre18Y30 = 0;
        int masDe30 = 0;
        int sumaTotalDeEdades = 0;

        System.out.println("Ingrese la cantidad de personas que hay en el evento");
        cantidadPersonas = scanner.nextInt();

        int edadDeCadaPersona[] = new int[cantidadPersonas];

        for (int i = 0; i < cantidadPersonas; i++) {

            do {
                System.out.println("Ingrese la edad de la persona: " + (i + 1));
                edadDeCadaPersona[i] = scanner.nextInt();

                if (edadDeCadaPersona[i] < 18) {
                    System.out.println("Edad ingresada no válida");
                }

            } while (edadDeCadaPersona[i] < 18);

            sumaTotalDeEdades=sumaTotalDeEdades+edadDeCadaPersona[i];

            if (edadDeCadaPersona[i] >= 18 && edadDeCadaPersona[i] <= 30) {
                entre18Y30++;
            } else {
                masDe30++;
            }
        }

        System.out.println("Entre 18 y 30: " + entre18Y30);
        System.out.println("Más de 30: " + masDe30);
        System.out.println("Suma total de edades: " + sumaTotalDeEdades);

        scanner.close();
    }
}
