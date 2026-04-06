package unidad1.parcial1;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de estudiantes que desea registrar");
        int can = scanner.nextInt();
        double[] notas = new double[can];
        double suma = 0;
        int aprobados = 0;
        int reprobados = 0;
        double mayor = 0;
        double menor = 5;
        for (int i = 0; i < notas.length; i++) {
            System.out.println("Ingrese la nota de todos los estudiantes");
            notas[i] = scanner.nextDouble();
            suma = suma + notas[i];
            if (notas[i] > mayor) {
                mayor = notas[i];
            }
            if (notas[i] < menor) {
                menor = notas[i];
            }
        }
        for (int i = 0; i < notas.length; i++) {
            if (notas[i] >= 3.0 && notas[i] <= 5.0) {
                aprobados = aprobados + 1;
            }
        }

        for (int i = 0; i < notas.length; i++) {
            if (notas[i] >= 0.0 && notas[i] < 2.9) {
                reprobados = reprobados + 1;
            }
        }

        double promedio = suma / can;
        System.out.println("Aprobaron " + aprobados + " estudiantes");
        System.out.println("Reprobaron " + reprobados + " estudiantes");
        System.out.println("Promedio del curso: " + promedio);
        System.out.println("Nota más alta: " + mayor);
        System.out.println("Nota más baja: " + menor);
        scanner.close();
    

    }
}