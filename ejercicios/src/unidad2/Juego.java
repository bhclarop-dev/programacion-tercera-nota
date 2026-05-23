package unidad2;
import java.util.Scanner;

// Clase base
class Personaje {

    String nombre;
    int fuerza;
    int vida;

    // Constructor
    public Personaje(String nombre, int fuerza, int vida) {
        this.nombre = nombre;
        this.fuerza = fuerza;
        this.vida = vida;
    }
}

// Clase Heroe
class SuperHero extends Personaje {

    public SuperHero(String nombre, int fuerza, int vida) {
        super(nombre, fuerza, vida);
    }
}

// Clase Villano
class Villano extends Personaje {

    public Villano(String nombre, int fuerza, int vida) {
        super(nombre, fuerza, vida);
    }
}

public class Juego

{

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Crear personajes
        SuperHero twilight = new SuperHero(
                "Twilight Sparkle",
                20,
                100);

        Villano discord = new Villano(
                "Discord",
                15,
                100);

        System.out.println("================================");
        System.out.println(" BATALLA MY LITTLE PONY ");
        System.out.println("================================");

        // Ciclo de pelea
        while (twilight.vida > 0 && discord.vida > 0) {

            System.out.println("\nVida de " + twilight.nombre + ": " + twilight.vida);
            System.out.println("Vida de " + discord.nombre + ": " + discord.vida);

            System.out.println("\nPresiona ENTER para atacar");
            scanner.nextLine();

            // Ataque del héroe
            discord.vida = discord.vida - twilight.fuerza;

            System.out.println(twilight.nombre + " ataco a " + discord.nombre);
            System.out.println("Daño realizado: " + twilight.fuerza);

            // Verificar si perdió
            if (discord.vida <= 0) {
                System.out.println("\nEl ganador es " + twilight.nombre);
                break;
            }

            // Ataque del villano
            twilight.vida = twilight.vida - discord.fuerza;

            System.out.println(discord.nombre + " ataco a " + twilight.nombre);
            System.out.println("Daño realizado: " + discord.fuerza);

            // Verificar si perdió
            if (twilight.vida <= 0) {
                System.out.println("\nEl ganador es " + discord.nombre);
                break;
            }
        }

        System.out.println("\nFin del juego");

        scanner.close();
    }
}