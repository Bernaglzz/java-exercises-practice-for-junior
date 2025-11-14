import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int num = 0;
        int num1 = 0;
        int random = 0;

        Scanner sc = new Scanner (System.in);

        System.out.println("Introduce un numero: ");
        num = sc.nextInt(); sc.nextLine();

        System.out.println("Introduce otro numero: ");
        num1 = sc.nextInt(); sc.nextLine();

        for (int veces = num; num <= num1; veces = num++){
            random = (int) (Math.random() * 100) + 1;
            System.out.print(random  + " ");
        }
    }
}