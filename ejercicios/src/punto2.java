public class punto2 {
    public static void main(String[] args) throws Exception {
        int cantidadFija = 1000;
        final int semanasMes = 4;
        System.out.println("""
                Si la persona retira 200 por cada semana de un mes debe hacer este retiro 4 veces. 
                """);
        int retiroTotal = cantidadFija-(200*semanasMes);
        System.out.println("La persona quedó con un total de: "+retiroTotal+" en su cuenta bancaria. ");

    }
}
