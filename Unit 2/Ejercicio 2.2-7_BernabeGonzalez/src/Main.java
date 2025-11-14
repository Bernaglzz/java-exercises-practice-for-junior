import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numero = 0;

        System.out.println("Introduce un numero");

        while (!sc.hasNextInt()){
            System.out.println("No es un entero. Introduce un numero");
            sc.nextLine();
        }

        numero = sc.nextInt(); sc.nextLine();

        int contador = 1;
        while(contador <= 10){
            System.out.println("" + contador + " * " + numero + " = " + (contador++*numero));
        }

        /*
        int numero = 0;
        int contador = 1;
        boolean esEntero = true;

        System.out.println("Introduce un numero entero:");

        if (sc.hasNextInt()){
            numero = sc.nextInt(); sc.nextLine();
            esEntero = true;
        } else {
            esEntero = false; sc.nextLine();
        }

        while (esEntero == false) {
            System.out.println("Entrada Incorrecta");
            System.out.println("Introduce un numero entero:");
            numero = sc.nextInt(); sc.nextLine();
            if (sc.hasNextInt()){
                esEntero = true;
            } else {
                esEntero = false; sc.nextLine();
            }
        }

        while (esEntero == true && contador <=10){
            System.out.println("" + contador + " * " + numero + " = " + (contador++*numero));
        }*/
    }
}