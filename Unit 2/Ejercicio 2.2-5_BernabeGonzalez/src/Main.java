import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Ejercicio 1.

        System.out.println("---------------Introduce una letra---------------\n");
        char letra = sc.next() .charAt(0);

        switch (letra){
            case 'y':
            case 'Y':
                System.out.println("\nAfirmativo");
                break;
            case 'n':
            case 'N':
                System.out.println("\nNegativo");
                break;
            default:
                System.out.println("\nEntrada Incorrecta");
                break;
        }

        //Ejercicio 2.

        System.out.println("\n---------------Introduce el primer valor---------------\n");

        boolean sonEnteros=true;
        int valor1 = 0;
        int valor2 = 0;

        if (sc.hasNextInt()) {
            valor1 = sc.nextInt();
            sc.nextLine();
            System.out.println("\nEl numero es entero");
        }else{
            sonEnteros=false;
                System.out.println("\nLectura Incorrecta");
            }


        if (sonEnteros == true) {
            if (sc.hasNextInt()) {
                System.out.println("\n---------------Introduce el segundo valor---------------\n");
                valor2 = sc.nextInt();
                sc.nextLine();
                System.out.println("\nEl numero es entero");
            } else {
                sonEnteros = false;
                System.out.println("\nLectura Incorrecta");
            }
        }

        if (sonEnteros==true){
            System.out.println("\n---------------Introduce una letra---------------\n");
            char letra2 = sc.next() .charAt(0);
            switch (letra2) {
                case 's':
                case 'S':
                    System.out.println("\n" + (valor1 + valor2) + " es la suma de los enteros.");
                    break;
                case 'r':
                case 'R':
                    System.out.println("\n" + (valor1 - valor2) + " es la resta de los enteros.");
                    break;
                case 'm':
                case 'M':
                    System.out.println("\n" + (valor1 * valor2) + " es la multiplicación de los enteros.");
                    break;
                case 'd':
                case 'D':
                    float division = (valor1 / valor2);
                    if (valor2 == 0) {
                        System.out.println("\nNo se puede dividir entre 0");
                    } else {
                        System.out.println("\n" + division + " es la división de los enteros.");
                    }
                    break;
                default:
                    System.out.println("\nOperación no encontrada");
            }
        }else {
            System.out.println("\nEntrada Incorrecta");
        }
    }
}