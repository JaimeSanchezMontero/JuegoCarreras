package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Ejercicio9 {
    public static void main(String[] args) {

        //Creación de lista con elementos duplicados
        List<Integer> numerosDuplicados = Arrays.asList(1, 2, 3, 3, 3, 4, 5, 5, 6, 6, 6, 7, 8, 8);

        //Conversión a Set para eliminar duplicados
        Set<Integer> numerosSinDuplicar = numerosDuplicados.stream()
                .distinct() //Aquí eliminamos los repetidos
                .collect(Collectors.toSet()); //Aquí se recogen en un Set

        System.out.println("Números sin duplicar: " + numerosSinDuplicar);
    }
}
