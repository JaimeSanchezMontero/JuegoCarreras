<<<<<<< HEAD
import java.util.ArrayList;
import java.util.List;
=======
import EjerciciosIndividuales.Ejercicio1.Animal;
import EjerciciosIndividuales.Ejercicio1.Gato;
import EjerciciosIndividuales.Ejercicio1.Perro;
import EjerciciosIndividuales.Ejercicio2.Vehículo;
import EjerciciosIndividuales.Ejercicio3.Circulo;
import EjerciciosIndividuales.Ejercicio3.Rectangulo;
import EjerciciosIndividuales.Ejercicio4.Coche;
import EjerciciosIndividuales.Ejercicio5.DiasSemana;
import EjerciciosIndividuales.Ejercicio6.Empleado;
import EjerciciosIndividuales.Ejercicio6.EmpleadoTiempoCompleto;
import EjerciciosIndividuales.Ejercicio6.EmpleadoTiempoParcial;
import EjerciciosIndividuales.Ejercicio7.Persona;
import EjerciciosIndividuales.Ejercicio7.RepositorioPersonas;
import org.w3c.dom.css.Rect;

import java.sql.SQLOutput;
>>>>>>> 38319196eeb5b41090e7144d49d9ce80d88e59d6
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
<<<<<<< HEAD
        Scanner scanner = new Scanner(System.in);
        List<Coche> coches = new ArrayList<>();

        // Configuración de coches
        System.out.println("Introduce el número de coches:");
        int numCoches = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer

        for (int i = 0; i < numCoches; i++) {
            System.out.println("Introduce el nombre del coche:");
            String nombreCoche = scanner.nextLine();
            System.out.println("Introduce la velocidad máxima (km/h):");
            double velocidadMaxima = scanner.nextDouble();
            System.out.println("Introduce la aceleración (km/h/s):");
            double aceleracion = scanner.nextDouble();
            System.out.println("Introduce el manejo (1-10):");
            int manejo = scanner.nextInt();
            System.out.println("Introduce la durabilidad (1-100):");
            int durabilidad = scanner.nextInt();
            System.out.println("Introduce el combustible restante (litros):");
            double combustible = scanner.nextDouble();
            scanner.nextLine(); // Limpiar el buffer
            System.out.println("Introduce el nombre del piloto:");
            String nombrePiloto = scanner.nextLine();

            Piloto piloto = new Piloto(nombrePiloto);
            Coche coche = new Coche(nombreCoche, velocidadMaxima, aceleracion, manejo, combustible, durabilidad, piloto);
            coches.add(coche);
        }

        // Configuración del circuito
        System.out.println("Introduce la longitud del circuito (km):");
        double longitudCircuito = scanner.nextDouble();
        System.out.println("Introduce el número de vueltas:");
        int numeroVueltas = scanner.nextInt();
        System.out.println("Introduce el número de curvas:");
        int numeroCurvas = scanner.nextInt();
        System.out.println("Introduce la dificultad del circuito (1-10):");
        int dificultadCircuito = scanner.nextInt();

        Circuito circuito = new Circuito(longitudCircuito, numeroVueltas, numeroCurvas, dificultadCircuito);

        // Iniciar la carrera
        Carrera carrera = new Carrera(coches, circuito);
        carrera.iniciarCarrera();
=======

        //EJERCICIO 1
        Animal animal = new Animal();
        animal.hacerSonido();

        Perro perro = new Perro();
        perro.hacerSonido();

        Gato gato = new Gato();
        gato.hacerSonido();

        //EJERCICIO 2
        //El error se debe a que una clase que es "final" no puede ser heredada.
        //No se pueden crear subclases a partir de una clase "final".
        Vehículo vehiculo = new Vehículo();
        vehiculo.arrancar();

        //EJERCICIO 3
        Circulo circulo = new Circulo(7.0);
        System.out.println("El área del círculo es: " + circulo.calcularArea());

        Rectangulo rectangulo = new Rectangulo(3.0, 7.0);
        System.out.println("El área del rectángulo es: " + rectangulo.calcularArea());

        //EJERCICIO 4
        Coche coche = new Coche();
        coche.acelerar();
        coche.frenar();

        //EJERCICIO 5
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa un día de la semana: ");
        String diaTecleado = scanner.nextLine().toUpperCase();

        try{

            DiasSemana dia = DiasSemana.valueOf(diaTecleado);
            switch (dia) {
                case LUNES:
                case MARTES:
                case MIERCOLES:
                case JUEVES:
                case VIERNES:
                    System.out.println(dia + " es laboral");
                    break;
                case SABADO:
                case DOMINGO:
                    System.out.println(dia + " es fin de semana");
            }

        } catch(Exception e){
            System.out.println("El día de la semana ingresado no es válido");
        }

        //EJERCICIO 6
        Empleado empleadoFull = new EmpleadoTiempoCompleto(1500);
        System.out.println("Salario mensual del Empleado a tiempo completo: " + empleadoFull.calcularSalario());

        Empleado empleadoPartial = new EmpleadoTiempoParcial(15, 90);
        System.out.println("Salario del Empleado a tiempo parcial: " + empleadoPartial.calcularSalario());


        //EJERCICIO 7
        /*
        * Creo una instancia de RepositorioPersonas para poder acceder a los métodos de agregar,
        * eliminar y listar personas. Esta clase hereda
        * */

        RepositorioPersonas repositorio = new RepositorioPersonas();

        repositorio.agregaPersona(new Persona(1, "Jaime"));
        repositorio.agregaPersona(new Persona(2, "Pedro"));
        repositorio.agregaPersona(new Persona(3, "Luis"));
        repositorio.agregaPersona(new Persona(4, "Laura"));
        repositorio.agregaPersona(new Persona(5, "Iker"));

        repositorio.listadoPersonas();
        repositorio.eliminaPersona(3);
        repositorio.listadoPersonas();






>>>>>>> 38319196eeb5b41090e7144d49d9ce80d88e59d6
    }
}