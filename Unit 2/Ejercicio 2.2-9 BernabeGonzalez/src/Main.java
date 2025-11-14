import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num = 0;
        int numSuma = 0;
        boolean esCero = false;

        System.out.println("Introduce numeros enteros:");

        while (!esCero){
            if (sc.hasNextInt()){
                num = sc.nextInt(); sc.hasNextLine();
                if (num == 0){
                    System.out.println("El numero 0 no es válido");
                    System.out.println("La suma total es: "+numSuma);
                    esCero = true;
                }else{
                    System.out.println("Introduce numeros enteros:");
                    numSuma = (num+numSuma);
                    System.out.println("El resultado de la suma es: " +numSuma);
                }
            } else {
                System.out.println("El numero introducido no es entero");
                esCero = true;
            }
        }
    }
}