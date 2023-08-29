
/*Importamos el java.util.Scanner */
import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {

        /* Definimos la variable scanner de tipo Scanner */
        Scanner scanner = new Scanner(System.in);

        /*
         * Cuerpo del ejercicio con título e Instrucción para mediante un "sout" pedir
         * al usuario ingresar la edad de Juan
         */
        System.out.println("Ejercicio #1");
        System.out.print("Ingrese la edad de Juan: ");
        /*
         * Definimos una variable entrada de tipo String que almacenará el dato de
         * entrada, en este caso la edad de Juan
         */
        String entrada = scanner.nextLine();

        /*
         * Convertimos nuestra variable entrada de tipo String a int para realizar las
         * operaciones aritméticas
         */
        int edad_juan = Integer.parseInt(entrada);

        /* Presentamos al usuario las edades con sus respectivos cálculos aritméticos */
        System.out.println("LAS EDADES SON: ALBERTO = " + (edad_juan * 2 / 3) + " JUAN = " + (edad_juan) + " ANA = "
                + (edad_juan * 4 / 3) + " MAMA = " + ((edad_juan * 2 / 3) + (edad_juan) + (edad_juan * 4 / 3)));

        /*
         * Planteé otra posible forma de presentar los datos (Quitar comentario para
         * revisar)
         * System.out.println("La edad de Alberto es: " + (edad_juan * 2 / 3));
         * System.out.println("La edad de Juan es: " + edad_juan);
         * System.out.println("La edad de Ana es: " + (edad_juan * 4 / 3));
         * System.out.println("La edad de la mamá es:" + ((edad_juan * 2 / 3) +
         * (edad_juan) + (edad_juan * 4 / 3)));
         */
    }

}
