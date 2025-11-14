//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int num = 0;
        int contador = 0;
        int cnumerico = 0;
        boolean stop = false;


        System.out.println("---------------------------------------RANDOMIZADOR---------------------------------------\n");
        while (!stop) {
            num = (int) (Math.random() * 100) + 1;
            System.out.print(+num + " ");
            contador++;

            if (num == 99 || contador == 30) {
                stop = true;
            }

            if (num == 12) {
                cnumerico++;
            }
        }
        System.out.println("\nEl numero '12' ha salido " + cnumerico + " veces");
        System.out.println("\n---------------------------------------RANDOMIZADOR---------------------------------------\n");
    }
}