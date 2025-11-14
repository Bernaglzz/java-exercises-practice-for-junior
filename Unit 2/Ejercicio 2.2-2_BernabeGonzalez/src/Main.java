import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Creo una variable que traduce boolean a int
        //También se puede hacer como String esPar=(numero%2==0)?"Par":"Impar"

        System.out.println("Introduce un número:");
        int numero = sc.nextInt();
        sc.nextLine();

        boolean esPar = (numero % 2 == 0);
        int esParInt = 0;

        if (esPar == true){
            esParInt=1;
        } else {
            esParInt=2;
        }

        //Decide si el entero es true o false basado en la booleana

        switch (esParInt)
        {
            case 1:
            System.out.println("El "+numero+" es par");
            break;

            case 2:
            System.out.println("El "+numero+" es impar");
            break;
        }

        /*
        Forma resumida:

        String esPar (numero % 2 == 0)?"Par":"Impar";

        switch (esPar)
        {
            case "Par":
            System.out.println("El "+numero+" es par");

            case "Impar":
            System.out.println("El "+numero+" es par");
        }
        */
    }
}