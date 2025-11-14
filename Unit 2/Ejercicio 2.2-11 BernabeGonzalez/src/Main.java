import javax.swing.*;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numero = 0;
        int contador = 6;
        int inicio = 1;

        System.out.println("Introduce un numero: ");
        numero = sc.nextInt(); sc.nextLine();

        while (inicio <= numero){
            System.out.println("");
            while (contador > 0){
                System.out.print(+inicio + " ");
                contador--;
            }
            contador = 6;
            inicio++;
        }
    }
}