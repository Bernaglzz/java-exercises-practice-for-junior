import java.util.Scanner;
import java.util.WeakHashMap;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num1 = 0;
        int resultado = 0;
        boolean esCero = false;

        while (!esCero){
            System.out.println("Introduce un numero: ");
            if (sc.hasNextInt()){
                num1 = sc.nextInt(); sc.nextLine();
                if (num1 == 0){
                    System.out.println("La suma de los numeros es: " + resultado);
                    esCero = true;
                } else {
                    resultado = num1 + resultado;
                    System.out.println("La suma de los numeros es: " + resultado);
                }
            } else {
                System.out.println("Los valores introducidos no son enteros");
            }
        }
    }
}