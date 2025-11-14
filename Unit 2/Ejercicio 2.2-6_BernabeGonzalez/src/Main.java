import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numero1 = 0;
        int numero2 = 0;
        boolean esMayorElPrimero = false;

        System.out.println("----------------------ESCRIBE UN RANGO DE NUMEROS----------------------\n");
        System.out.println("Introduce el primer número");
        numero1 = sc.nextInt();
        sc.nextLine();
        System.out.println("Introduce el segundo número");
        numero2 = sc.nextInt();
        sc.nextLine();


        //Comprobamos que el primer numero no sea igual que el segundo
        if (numero1 >= numero2){
            esMayorElPrimero = true;
        } else {
            esMayorElPrimero = false;
        }

        while (esMayorElPrimero){
            System.out.println("----------------------RANGO DE NUMEROS INCORRECTOS----------------------\n");
            System.out.println("* El primer numero es mayor o igual que el segundo");
            System.out.println("* Vuelve a introducir los valores");

            System.out.println("Introduce el primer número");
            numero1 = sc.nextInt();
            sc.nextLine();
            System.out.println("Introduce el segundo número");
            numero2 = sc.nextInt();
            sc.nextLine();

            if (numero1 <= numero2){
                esMayorElPrimero = false; //El momento en el que el 1 deja de ser mayor que 2 se reestablece la booleana y continua
            }
        }

        System.out.println("----------------------RANGO DE NUMEROS GENERADO----------------------\n");
        System.out.println("Los numeros pertenecientes al rango son: ");
        while (numero1<=numero2) {
            System.out.println(+numero1);
            numero1++;
        }
    }
}