import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //PRIMERA PARTE

        int numero1 = 0;
        int numero2 = 0;

        System.out.println("Introduce un numero: ");

        while (!sc.hasNextInt()){
            System.out.println("El numero no es entero. Introduce otro numero");
            sc.nextLine();
        }
        numero1 = sc.nextInt(); sc.nextLine();

        System.out.println("Introduce el segundo numero: ");
        while (!sc.hasNextInt()){
            System.out.println("El numero no es entero. Introduce otro numero");
        }
        numero2 = sc.nextInt(); sc.nextLine();

        while (numero1 > numero2){
            System.out.println("El primer número es mayor que el segundo");
            sc.nextLine();
        }

        //PRIMERA PARTE

        //SEGUNDA PARTE

        int contador = 0;

        while (numero1 <= numero2){
            System.out.print(numero1 + "    ");
            numero1++;
            contador++;

            if (contador == 3){
                System.out.println(" ");
                contador = 0;
            }
        }

    }
}