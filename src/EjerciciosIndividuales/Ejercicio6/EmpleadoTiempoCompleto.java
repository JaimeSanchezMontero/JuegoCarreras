package EjerciciosIndividuales.Ejercicio6;

public class EmpleadoTiempoCompleto extends Empleado {

    private double salarioMensual;

    public EmpleadoTiempoCompleto(double salarioMensual) {
        this.salarioMensual = salarioMensual;
    }

    @Override
    public double calcularSalario(){
        return salarioMensual;
    }
}
