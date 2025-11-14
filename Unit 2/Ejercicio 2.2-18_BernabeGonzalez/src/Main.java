import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //Parte 1

        int piezas = 0;
        int veces = 0;
        int contador = 0;
        float longitud = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("-> Introduce el numero de piezas: ");
        piezas = sc.nextInt(); sc.nextLine();

        for (veces = 1; veces <= piezas; veces++){
            System.out.println("\n# La pieza " + veces + " mide: ");
            longitud = sc.nextFloat(); sc.nextLine();
            if ((longitud >= 1.20) && (longitud <= 1.30)){
                contador++;
            }
        }
        System.out.println("! Número de piezas válidas en lote: " +contador);

        //Parte 2

        int numero = 0;
        int veces1 = 0;
        boolean stop = false;

        for (veces1 = 1; !stop; veces1++){
            System.out.println("\n-> Introduce un numero: ");
            numero = sc.nextInt(); sc.nextLine();
            System.out.println("\n# El numero es: "+numero);

            if (numero == 0){
                stop = true;
                break;
            }

            if (numero >= 8){
                System.out.println("\n# Su doble: " +numero*2);
            } else {
                System.out.println("\n# Su triple: " +numero*3);
            }
        }
        System.out.println("! FIN");
    }
}