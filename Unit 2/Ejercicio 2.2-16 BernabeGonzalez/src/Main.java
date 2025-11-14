import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("-----------ADIVINA EL NUMERO-----------\n");

        int numero;
        do {
            System.out.println("Introduce un numero: \n");
            numero = sc.nextInt(); sc.hasNextLine();
        } while ((numero > 10) || (numero < 1));

        System.out.println("\nEl numero introducido es: \n"+numero);
        System.out.println("\n-----------ADIVINA EL NUMERO-----------");

    }
}