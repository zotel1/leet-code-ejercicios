package course_lambdas.clase01.comparators;

import course_lambdas.clase01.Persona;

import java.util.Comparator;

public class ComparadorPorLongitudDeNombre implements Comparator<Persona> {
    @Override
    public int compare(Persona o1, Persona o2) {
        int primero = o1.getNombre().length();
        int segundo = o2.getNombre().length();

        if (primero > segundo) {
            return 1;
        } else if (primero < segundo) {
            return -1;
        }  else {
            return 0;
        }
    }
}
