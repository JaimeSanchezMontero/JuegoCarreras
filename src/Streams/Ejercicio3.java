package Streams;

import java.util.Arrays;
import java.util.List;

public class Ejercicio3 {
    public static void main(String[] args) {

        //Creación de lista de Strings
        List<String> listaPalabras = Arrays.asList("Bienvenido", "al", "curso", "de", "Java");

        //Convierto la lista de palabras a mayúscula y muestro por pantalla a la vez
        listaPalabras.stream().map(String::toUpperCase).forEach(System.out::println);
    }
}
