import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num = 0;
        int contador = 1;
        int filas = 0;
        boolean stop = false;

        System.out.println("Introduce un numero: ");
        num = sc.nextInt(); sc.nextLine();

        while (!stop){
            System.out.print(contador + " ");
            filas++;
            if (filas == num){
                System.out.println("");
                filas = 0;
                contador++;
            }
            if (contador > num){
                stop = true;
            }
        }
    }
}