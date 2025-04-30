package src;

public class Desiciones {
    public static void main(String[] args) {
        int fechaDeLanzamiento = 1999;
        boolean incluidoEnElPlan = true;
        double notaDeLaPelicula = 8.2;

        if (fechaDeLanzamiento > 2022) {
            System.out.println("Peliculas más populares");
        } else {
            System.out.println("Películas retro que aún vale la pena ver");
        }
    }
}
