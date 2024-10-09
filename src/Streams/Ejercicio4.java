package Streams;

import java.util.Arrays;
import java.util.List;

public class Ejercicio4 {
    public static void main(String[] args) {

        //Creación de cadenas
        List<String> cadenas = Arrays.asList("Perro", "Gato", "Oso", "Murciélago", "Ciervo");

        //Filtro las cadenas de más de 5 caracteres e imprimo por pantalla
        cadenas.stream().filter(cadena -> cadena.length()>5).forEach(System.out::println);
    }
}
