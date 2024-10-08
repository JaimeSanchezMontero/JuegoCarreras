package Streams;

import java.util.Arrays;
import java.util.List;

public class Ejercicio6 {
    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(3, 7, 9, 12, 16, 144);

        //Al trabajar con el metodo count() es más conveniente usar el tipo de dato "long"
        long mayores = numeros.stream().filter(numero -> numero > 10).count();

        System.out.println("Cantidad de números mayores de 10: " + mayores);
    }
}
