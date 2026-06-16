import course_lambdas.clase01.FakerUtils;
import course_lambdas.clase01.Persona;
import course_lambdas.clase02.Ventana;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        new Ventana("Aprendiendo lambdas!");

        /** Clase 01
        List<Persona> listaPersonas = generarPersonas(100);
        System.out.println("Antes del ordenamiento por longitud de nombre: ");
        System.out.println("Lista Personas: " + listaPersonas);
        System.out.println("Despues del ordenamiento: ");
        listaPersonas.sort(( o1, o2) -> Integer.compare(o1.getNombre().length(), o2.getNombre().length()));
        System.out.println("Lista Personas ordenadas por longitud de nombre: " + listaPersonas); **/
    }

    /**Clase01
     * private static List<Persona> generarPersonas(int n) {
        List<Persona> personas = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String nombre = FakerUtils.generarNombre();
            String apellido = FakerUtils.generarApellido();
            personas.add(new Persona(nombre, apellido));
        }
        return personas;
    } **/
}