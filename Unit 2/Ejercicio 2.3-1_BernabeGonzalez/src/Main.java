import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.


public class Main {

    public static int comprobarNumero (int numero){
        if (numero >= 8){
             return visualizarDoble(numero);
        } else {
            return visualizarTriple(numero);
        }
    }

    public static int visualizarDoble (int numero){
        return numero*2;
    }

    public static int visualizarTriple (int numero){
        return numero*3;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numero = 0;
        int veces1 = 0;
        int resultado;
        boolean stop = false;

        for (veces1 = 1; !stop; veces1++){
            System.out.println("\n-> Introduce un numero: ");
            numero = sc.nextInt(); sc.nextLine();
            System.out.println("\n# El numero es: "+numero);

            if (numero == 0){
                stop = true;
                break;
            }

            resultado=comprobarNumero(numero);
            System.out.println("El resultado es: " +resultado);
        }
        System.out.println("! FIN");
    }
}