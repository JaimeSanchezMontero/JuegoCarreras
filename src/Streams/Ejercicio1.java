package Streams;

import java.util.Arrays;
import java.util.List;

public class Ejercicio1 {
    public static void main(String[] args) {

        //Creación de la lista
        List<Integer> numerosEnteros = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        //Filtro los números pares
        List<Integer> numerosPares = numerosEnteros.stream().filter(n -> n % 2 == 0).toList();

        //Imprimo los pares
        System.out.println(numerosPares);
    }
}
