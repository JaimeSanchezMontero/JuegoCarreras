package EjerciciosIndividuales.Ejercicio4;

public class Coche implements Vehiculo {

    @Override
    public void acelerar(){
        System.out.println("El coche está acelerando");
    }

    @Override
    public void frenar(){
        System.out.println("El coche está frenando");
    }
}
