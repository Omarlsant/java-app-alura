package src;

public class Saludo {
    public static void main(String[] args) {
        String nombre = "Juan";
        int aulas = 4;

        String mensaje = """
                Hola, %s!
                Bienvenido al curso de Java.
                Tendremos %d aulas para mostrarte lo que es necesario para que puedas dar tu primeros pasos en este lenguaje
                """.formatted(nombre, aulas);

        System.out.println(mensaje);
    }
}
