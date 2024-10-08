package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class Ejercicio2 {
    public static void main(String[] args) {

        //Creación de lista
        List<? extends Number> numeros = Arrays.asList(7, 8.4, 9, 12, 19.6, 87);

        //Cálculo del promedio
        double promedio = numeros.stream().mapToDouble(Number::doubleValue).average().orElse(0.0);

        //Imprimimos el promedio
        System.out.println("El promedio es: " + promedio);
    }
}
