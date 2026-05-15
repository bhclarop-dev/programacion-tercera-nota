package unidad2;

import java.util.Scanner;

public class NotasEstudiantes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cantidadEstudiantes;
        int entre3y4 = 0;
        int masDe4 = 0;
        double sumaTotal =0;
        System.out.println("Ingrese cantidad de estudiantes ");
        cantidadEstudiantes = scanner.nextInt();
        double notas [] = new double [cantidadEstudiantes];

        for (int i = 0; i < cantidadEstudiantes ; i++) {
            do {
                System.out.println("Ingrese  la nota "+ (i+1));
                notas[i] = scanner.nextDouble();
                if (notas[i]<0.0 || notas[i]>5.0) {
                    System.out.println("Nota ingresada no es valida ");
                }
            } while (notas[i]<0.0 || notas[i]>5.0);

            sumaTotal= sumaTotal+notas[i];
            
            if (notas[i]>=3.0 && notas[i]<=4.0) {
                entre3y4++;
            } else if (notas[i]>4.0) {
                masDe4++;
            }
            
        }
        System.out.println("Notas entre 3.0 y 4.0: "+ entre3y4);
        System.out.println("Notas mayores a 4.0: "+ masDe4);
        System.out.println("Suma total de las notas: "+ sumaTotal);
        scanner.close();
    }
}
