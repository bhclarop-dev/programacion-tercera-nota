package unidad2;
class Estudiante {
    String nombre;
}
public class ActividadEstudiantes {
     public static void main(String[] args) {

        int cupos = 30;

        Estudiante estudiante = new Estudiante();
        estudiante.nombre = "Ana";

        String[] materias = {"Matemáticas", "Historia", "Programación"};

        // 1. Cambiar cupos
        cambiarCupos(cupos);
        System.out.println("Cupos después: " + cupos);

        // 2. Cambiar nombre del estudiante
        cambiarNombre(estudiante);
        System.out.println("Nombre después: " + estudiante.nombre);

        // 3. Reemplazar estudiante
        reemplazarEstudiante(estudiante);
        System.out.println("Nombre después de reemplazar: " + estudiante.nombre);

        // 4. Cambiar materia del arreglo
        cambiarMateria(materias);
        System.out.println("Materia después: " + materias[0]);

        // 5. Reemplazar arreglo completo
        reemplazarArreglo(materias);
        System.out.println("Materia después de reemplazar arreglo: " + materias[0]);
    }

    // 1
    public static void cambiarCupos(int c) {
        c = 50;
        System.out.println("Dentro cambiarCupos: " + c);
    }

    // 2
    public static void cambiarNombre(Estudiante e) {
        e.nombre = "María";
        System.out.println("Dentro cambiarNombre: " + e.nombre);
    }

    // 3
    public static void reemplazarEstudiante(Estudiante e) {
        e = new Estudiante();
        e.nombre = "Carlos";
        System.out.println("Dentro reemplazarEstudiante: " + e.nombre);
    }

    // 4
    public static void cambiarMateria(String[] arr) {
        arr[0] = "Física";
        System.out.println("Dentro cambiarMateria: " + arr[0]);
    }

    // 5
    public static void reemplazarArreglo(String[] arr) {
        arr = new String[]{"Química", "Arte", "Inglés"};
        System.out.println("Dentro reemplazarArreglo: " + arr[0]);
    }
}
