package EjerciciosIndividuales.Ejercicio6;

public class EmpleadoTiempoParcial extends Empleado{

    private double salarioHora;
    private int horasTrabajadas;

    public EmpleadoTiempoParcial(double salarioHora, int horasTrabajadas) {
        this.salarioHora = salarioHora;
        this.horasTrabajadas = horasTrabajadas;
    }

    @Override
    public double calcularSalario(){
        return salarioHora * horasTrabajadas;
    }
}
