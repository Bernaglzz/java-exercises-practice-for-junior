import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numero = 0;
        int rango;
        int esMayor = 0;
        int esMenor = 100;

        System.out.println("* Introduce un numero: ");
        rango = sc.nextInt(); sc.nextLine();

        System.out.println("\n--------------------SECUENCIA DE NUMEROS--------------------\n");

        for (int veces = 1; veces <= rango; veces++){
            numero = (int)  (Math.random()* 100) + 1;
            System.out.print(numero+ " ");

            if (numero >= esMayor){
                esMayor = numero;
            }
            if (numero <= esMenor){
                esMenor = numero;
            }
        }

        System.out.println("\n\n--------------------SECUENCIA DE NUMEROS--------------------");
        System.out.println("\nEl máximo valor es: " + esMayor);
        System.out.println("\nEl menor valor es: " + esMenor);
    }
}