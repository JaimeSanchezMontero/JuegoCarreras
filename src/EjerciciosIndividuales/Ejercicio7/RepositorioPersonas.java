package EjerciciosIndividuales.Ejercicio7;
import java.util.List;
import java.util.ArrayList;

public class RepositorioPersonas {

    private List<Persona> personas; //Lista para almacenar personas

    public RepositorioPersonas() {
        this.personas = new ArrayList<>();
    }

    public void agregaPersona(Persona persona) {
        personas.add(persona);
        System.out.println("Se agregó una nueva persona: " + persona.getNombre());
    }

    public boolean eliminaPersona(int id) {

        for (Persona persona : personas) {
            if (persona.getId() == id) {
                personas.remove(persona);
                System.out.println("Se eliminó a: " + persona.getNombre());
                return true;
            }
        }
        System.out.println("No se encontró a la persona con el id " + id);
        return false;
    }

    public void listadoPersonas(){
        for (Persona persona : personas) {
            System.out.println(persona);
        }
    }
}
