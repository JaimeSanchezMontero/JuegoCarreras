package Streams;

import java.util.Arrays;
import java.util.List;

public class Ejercicio5 {
    public static void main(String[] args) {

        List<String> nombres = Arrays.asList("Jaime", "Javier", "Francisco", "Pedro", "Rubén");

        String concatenados = nombres.stream().reduce("", (a,b) -> a.isEmpty() ? b: a + ", " + b);

        System.out.println("Nombres concatenados: " + concatenados);
    }
}
