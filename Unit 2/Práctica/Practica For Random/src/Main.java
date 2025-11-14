//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int num = 0;
        int par = 0;
        int impar = 0;

        for (int veces = 1; veces <= 20; veces++) {
            num = (int) (Math.random() * 50) + 1;
            System.out.print(num + " ");

            if (num % 2 == 0) {
                par++;
            } else {
                impar++;
            }
        }
        System.out.println("\n\n# Numeros Pares # " + par + " #");
        System.out.println("# Numeros Impares # " + impar + " #");
    }
}
