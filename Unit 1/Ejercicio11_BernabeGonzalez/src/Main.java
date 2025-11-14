//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.println("\n--------------------------------------------\n");

        /*
        Declara una variable edad de tipo entero y una variable lógica esAdulto.
        Asigna a la variable esAdulto una expresión booleana que devuelva true si
        la edad corresponde a una persona mayor de edad.
         */

        int edad = 13;
        boolean esAdulto = true;
        boolean noEsAdulto = !esAdulto;

        System.out.println("Si la edad de Pablo es "+edad);

        if (edad > 18) {
            System.out.println("¿Es mayor de edad?: " +esAdulto);
        } else {
            System.out.println("¿Es mayor de edad?: " +noEsAdulto);
        }

        System.out.println("\n");

        /*
        Declara una variable teclaPulsada de tipo carácter y una variable lógica teclaCorrecta.
        Asigna a la variable teclaCorrecta el valor de una expresión lógica que se evalúe
        a true si la tecla pulsada es correcta, es decir, si es una ‘S’ o una ‘s’ o una ‘N’
        o una ‘n’.
         */

        char teclaPulsada = 's';
        boolean teclaCorrecta = true;
        boolean telcaIncorrecta = !teclaCorrecta;

        System.out.println("Si pulso la tecla "+teclaPulsada);

        if (teclaPulsada == 'S' || teclaPulsada == 's' || teclaPulsada == 'N' || teclaPulsada == 'n')  {
            System.out.println("¿Es la tecla pulsada la correcta?: "+teclaCorrecta);
        } else {
            System.out.println("¿Es la tecla pulsada la correcta?: "+telcaIncorrecta);
        }

        System.out.println("\n--------------------------------------------\n");
        System.out.println("Los valores de la variable son:");

    }
}