package unidad2;

import java.util.Scanner;

public class Paquetes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cantidadPaquetes;
        int entre1Y20 = 0;
        int mayorDe20=0;
        int pesoTotal=0;

        System.out.println("Ingrese la cantidad de paquetes");
        cantidadPaquetes= scanner.nextInt();
        int pesos [] = new int [cantidadPaquetes];

        for (int i = 0; i < cantidadPaquetes; i++) {
            do {
                System.out.println("Ingrese el peso del paquete: "+(i+1));
                pesos[i]= scanner.nextInt();
                if (pesos[i]<1 || pesos[i]>50) {
                    System.out.println("El peso ingresado es incorrecto");
                    
                }
            } while (pesos[i]<1 || pesos[i]>50);
            pesoTotal= pesoTotal+pesos[i];
            if (pesos[i]>=1 && pesos[i]<=20) {
                entre1Y20++;
                
            } else{
                mayorDe20++;
            }
        }
        System.out.println("Paquetes entre 1 y 20: "+entre1Y20);
        System.out.println("Paquetes mayores de 20: "+mayorDe20);
        System.out.println("Suma total del peso: "+pesoTotal);

        scanner.close();
    }
}
