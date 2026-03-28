public class punto1 
{
    public static void main(String[] args) {
         double camisa = 25.0;
         double pantalon = 30.0;
         double camisaDescuento = camisa-(camisa*0.15);
         double pantalonDescuento = pantalon-(pantalon*0.15);
         double valorTotal = camisaDescuento+pantalonDescuento;
         System.out.println("Al comprar un pantalon y una camiseta el precio total a pagar es de: "+valorTotal);

         double descuentoCamisa1 = camisaDescuento-(camisaDescuento*0.05); 
         double compra2Camisas = descuentoCamisa1+camisaDescuento;
         System.out.print("Al comprar dos camisas tiene descuento de 20% en la primera y 15% en la segunda");
         System.out.println(" pagando un total de: "+ compra2Camisas);


    }
}
