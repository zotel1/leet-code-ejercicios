import course_lambdas.clase01.FakerUtils;
import course_lambdas.clase01.Persona;
import course_lambdas.clase01.comparators.ComparadorPorLongitudDeNombre;

import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.

       // System.out.printf("Hello and welcome!");

       // for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
         //   System.out.println("i = " + i);
        //}

        List<Persona> listaPersonas = generarPersonas(100);
        System.out.println("Antes del ordenamiento por longitud de nombre: ");
        System.out.println("Lista Personas: " + listaPersonas);
        System.out.println("Despues del ordenamiento: ");
        listaPersonas.sort(new ComparadorPorLongitudDeNombre());
        System.out.println("Lista Personas ordenadas por longitud de nombre: " + listaPersonas);
    }

    private static List<Persona> generarPersonas(int n) {
        List<Persona> personas = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String nombre = FakerUtils.generarNombre();
            String apellido = FakerUtils.generarApellido();
            personas.add(new Persona(nombre, apellido));
        }
        return personas;
    }
}