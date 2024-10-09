package Streams;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


public class Ejercicio8 {
    public static void main(String[] args) {

        //Aquí creo un map para agrupar a todas las personas
        Map<String, Integer> personas  = new HashMap<>();
        personas.put("Carlos", 18);
        personas.put("Jorge", 19);
        personas.put("Lucía", 15);
        personas.put("Jesús", 24);
        personas.put("Pedro", 14);
        personas.put("Jaime", 27);

        Map<Boolean, List<String>> agrupadas = personas.entrySet().stream()
                .collect(Collectors.partitioningBy(entry -> entry.getValue() >= 18,
                        Collectors.mapping(Map.Entry::getKey, Collectors.toList())));


        System.out.println("Personas mayores de 18: " + agrupadas.get(true));
        System.out.println("Personas menores de 18: " + agrupadas.get(false));
    }

}
