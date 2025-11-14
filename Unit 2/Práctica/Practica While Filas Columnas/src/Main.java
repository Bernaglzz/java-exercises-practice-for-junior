import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);

        int num = 0;
        int contador = 1;
        int fila = 1;
        int columna = 0;
        boolean stop = false;

        System.out.println("Introduce un numero: ");
        num = sc.nextInt(); sc.nextLine();

        while (!stop){
            System.out.print(contador+ " ");
            columna++;

            if (columna >= num){
                stop = true;
            }

            if (columna == fila){
                ++contador; ++fila;
                System.out.print("\n");
                columna = 0;

            }
        }


    }
}