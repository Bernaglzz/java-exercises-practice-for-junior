import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num1 = 0;
        int num2 = 1;
        int resultado = 0;

        System.out.println("Introduce un numero: ");

        while (!sc.hasNextInt()){
            System.out.println("### Entrada Incorrecta ###. Introduce un numero: ");
            num1 = sc.nextInt(); sc.nextLine();
        }

        num1 = sc.nextInt();sc.nextLine();

        System.out.println("\n--------------TABLA DE MULTIPLICAR--------------\n");
        while ((num2 <= 10)){
            resultado = (num1*num2);
            System.out.println(num2 + " * " + num1 + " = " + " "+resultado);
            num2++;
        }
        System.out.println("\n--------------TABLA DE MULTIPLICAR--------------\n");

    }
}