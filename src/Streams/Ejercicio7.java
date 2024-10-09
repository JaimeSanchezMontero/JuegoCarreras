package Streams;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Ejercicio7 {
    public static void main(String[] args) {

        /*Creo un Map que almacena nombre y edad de cada persona
        Con el "LinkedHashMap" me aseguro que se mantenga el orden de inserción,
        ya que de lo contrario no se itera en orden sobre los elementos
        */
        Map<String, Integer> personas = new LinkedHashMap<>();
        personas.put("John", 23);
        personas.put("Jaime", 35);
        personas.put("Lucas", 18);
        personas.put("Sara", 12);
        personas.put("Roberto", 38);

        /* Aquí primero filtro todos los que son mayores que 30,
        y luego aplico metodo para saber el primero que cumple la condición*/

        String mayor30 = personas.entrySet().stream()
                .filter(entry -> entry.getValue() > 30)
                .map(Map.Entry::getKey)
                .findFirst().orElse("No hay nadie mayor de 30 años");

        System.out.println("La primera persona mayor de 30 años es " + mayor30);


    }
}
