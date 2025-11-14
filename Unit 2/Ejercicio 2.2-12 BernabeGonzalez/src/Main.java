import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num = 0;
        int fila = 1;
        int columna = 1;

        System.out.println("Introduce un numero:");
        num = sc.nextInt(); sc.nextLine();

        /*
        Si meto un numero "n" n, en la primera fila tiene que ser 1.
        El primer while tiene que acabar cuando las filas son iguales a las columnas.
        El primer while tiene que ir aumentando a nivel que las columnas.
        En el segundo while, se tiene que repetir el numero de forma incremnental, sin pasarse
        del numero escrito
         */

        while (fila <= num){

            while (columna <= fila){
                System.out.print(fila + " ");
                columna++;
            }
            System.out.print("\n");
            columna = 1;
            fila++;
        }

    }
}