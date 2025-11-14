import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //Parte 1 (Multiples casos misma respuesta sin condiciones)

        char letra;

        System.out.println("# Introduce una letra: \n");
        letra = sc.next().charAt(0);
        sc.nextLine();

        switch (letra) {
            case 'Y':
            case 'y':
                System.out.println("\n # Afirmativo");
                break;
            case 'N':
            case 'n':
                System.out.println("\n # Negativo");
                break;
            default:
                System.out.println("\n # Entrada Incorrecta");
                break;
        }

        //Parte 2

        int num1 = 0;
        int num2 = 0;
        char caracter;
        boolean esEntero = false;


        System.out.println("Introduce un numero entero: ");


        if (sc.hasNextInt()) {
            num1 = sc.nextInt();
            sc.nextLine();

            System.out.println("Introduce otro numero entero: ");

            if (sc.hasNextInt()) {
                num2 = sc.nextInt();
                sc.nextLine();
                esEntero = true;
            }

        } else {
            System.out.println("Los numeros no son enteros");
        }

        if (esEntero == true) {
            System.out.println("Introduce un caracter: ");
            caracter = sc.next() .charAt(0);

            switch (caracter){
                case 's':
                case 'S':
                    System.out.println("Suma = "+(num1+num2) + " (suma valores introducidos)");
                    break;
                case 'r':
                case 'R':
                    System.out.println("Resta = "+(num1-num2) + " (resta valores introducidos)");
                    break;
                case 'm':
                case'M':
                    System.out.println("Multiplicación = "+(num1*num2) + " (multiplicación valores introducidos)");
                    break;
                case 'd':
                case 'D':
                    if (num2 == 0){
                        System.out.println("No se puede dividir entre 0");
                    } else {
                        System.out.println("División = "+(num1%num2) + " (división de valores introducidos)");
                    }
                    break;
                default:
                    System.out.println("Operación no encontrada");
            }
        }
    }
}