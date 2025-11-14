import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num1 = 0;
        int num2 = 0;
        boolean mayor = false;

        System.out.println("------------RANGO DE NUMEROS------------\n");

        System.out.println("Introduce el numero inicial:");
        num1 = sc.nextInt();
        sc.nextLine();
        System.out.println("Introduce el numero final:");
        num2 = sc.nextInt();
        sc.nextLine();

        if (num1 < num2){
            mayor = true;
        } else {
            mayor = false;
        }

        while (mayor && (num1 <= num2)) {
            System.out.print(" "+num1);
            num1++;
        }
    }
}