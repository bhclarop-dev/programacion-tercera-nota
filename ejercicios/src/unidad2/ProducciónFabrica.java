package unidad2;

import java.util.Scanner;

public class ProducciónFabrica {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cantidadOperarios;
        int entre10Y100Productos =0;
        int masDe100Productos=0;
        int produccionTotal=0;
        System.out.println("Ingrese cantidad de operarios");
        cantidadOperarios= scanner.nextInt();

        int productos[]=new int[cantidadOperarios];

        for (int i = 0; i <cantidadOperarios; i++) {
            do {
                System.out.println("Ingrese cantidad de productos de empleado "+(i+1));
            productos[i]= scanner.nextInt();
            if (productos[i]<10 || productos[i]>200) {

                System.out.println("La cantidad de productos es incorrecta");
                
            }
            } while (productos[i]<10 || productos[i]>200);
            produccionTotal=produccionTotal+productos[i];
            if (productos[i]>=10 && productos[i]<=100) {
                entre10Y100Productos++;
                
            } else {
                masDe100Productos++;
            }
        }
        System.out.println("Productos entre 10 y 100: "+entre10Y100Productos);
        System.out.println("Productos mayores a 100: "+masDe100Productos);
        System.out.println("Suma total de productos: "+ produccionTotal );


        scanner.close();
    }
}
