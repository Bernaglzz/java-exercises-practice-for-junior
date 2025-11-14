import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num1 = 0;
        int num2 = 0;
        int contador = 0;
        boolean esEntero = false;

        System.out.println("\nIntroduce un numero: \n");

        if(sc.hasNextInt()){
            num1 = sc.nextInt(); sc.nextLine();
            System.out.println("\nIntroduce otro numero: \n");
            if (sc.hasNextInt()){
                num2 = sc.nextInt(); sc.nextLine();
                esEntero = true;
            } else {
                System.out.println("\nEl segundo valor no es entero\n");
                esEntero = false;
            }
        } else {
            System.out.println("\nEl primer valor no es entero\n");
            esEntero = false;
        }

        System.out.println("-----------------RANGO DE NUMEROS-----------------\n");

        while (esEntero && (num1 <= num2)){
            System.out.print(num1 + " ");
            num1++;
            contador++;
            if (contador == 3){
                System.out.println(" ");
                contador = 0;
            }
        }

        System.out.println("\n-----------------RANGO DE NUMEROS-----------------\n");


    }
}