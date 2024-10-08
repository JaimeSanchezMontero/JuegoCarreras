package Streams;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Ejercicio10 {
    public static void main(String[] args) {

        List<LocalDate> fechas = Arrays.asList(
                LocalDate.of(2017, 12, 30),
                LocalDate.of(2020, 1, 1),
                LocalDate.of(2020, 2, 1),
                LocalDate.of(2018, 7, 25),
                LocalDate.of(2021, 4, 16)
        );

        //Filtro para fechas posteriores a 1 de enero de 2020
        LocalDate fechaReferencia = LocalDate.of(2020,1,1);

        List<LocalDate> fechasPosteriores = fechas.stream()
                .filter(fecha -> fecha.isAfter(fechaReferencia))
                .collect(Collectors.toList());

        System.out.println("Fechas posteriores a 1 de enero de 2020:");
        fechasPosteriores.forEach(System.out::println);

    }
}
