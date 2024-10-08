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
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

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






    }
}