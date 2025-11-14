import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int numero = 0;
        int contador = 0;
        int repetidos = 0;
        boolean num99 = false;

        System.out.println("--------------NUMEROS ALEATORIOS--------------");
        while (!num99) {

            numero = (int)  (Math.random() * 100) + 1;
            contador++;
            System.out.println("El numero es: " +numero);

            if ((numero == 99) || (contador == 30)) {
                num99 = true;
            }

            if (numero == 12)
                repetidos++;
        }
        System.out.println("El numero doce se ha repetido: " + repetidos);
    }
}