package unidad2;

import java.util.Scanner;

public class VentasTienda {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int ventasRealizadas;
        int ventasEntre50Y500 =0;
        int ventasMayoresA500 = 0;
        int totalVendido = 0;
        System.out.println("Ingrese cantidad de ventas por la tienda ");
        ventasRealizadas = scanner.nextInt();
        int ventas [] = new int[ventasRealizadas];

        for (int i = 0; i < ventasRealizadas; i++) {
            do {
                System.out.println("Ingrese el valor de la venta: "+ (i+1));
                ventas[i] = scanner.nextInt();
                if (ventas[i]<50 || ventas[i]>1000) {
                    System.out.println("El valor de la venta es incorrecto");
                }

            }

            while (ventas[i]<50 || ventas[i]>1000);
            totalVendido= totalVendido+ventas[i]; 

            if (ventas[i]>=50 && ventas[i]<=500) {
                ventasEntre50Y500++;
            } else {
                ventasMayoresA500++;
            }

        }
        System.out.println("Ventas entre 50 y 500: "+ ventasEntre50Y500);
        System.out.println("Ventas de más de 500: "+ ventasMayoresA500);
        System.out.println("Total vendido por la tienda: "+ totalVendido);
        scanner.close();
    }
}
