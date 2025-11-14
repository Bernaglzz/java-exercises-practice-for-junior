
public class Main {
    public static void main(String[] args) {

        int numero = 0;
        int esPar = 0;
        int esImpar = 0;

        System.out.println("--------------NUMEROS ALEATORIOS--------------\n");

        for (int veces = 1; veces <= 20; veces++ ){

            numero = (int)  (Math.random()* 50) + 1;
            System.out.print(numero + "  ");

            if (numero % 2 == 0){
                esPar++;
            } else {
                esImpar++;
            }
        }

        System.out.println("\n\nHay "+ esPar +" numeros pares y "+ esImpar +" numeros impares.");

    }
}