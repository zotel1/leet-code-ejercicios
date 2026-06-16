package course_lambdas.clase01;

import com.github.javafaker.Faker;

public class FakerUtils {

    private static  final Faker faker = new Faker();

    public static String generarNombre() {
        return faker.name().firstName();
    }

    public static String generarApellido() {
        return faker.name().lastName();
    }
}
