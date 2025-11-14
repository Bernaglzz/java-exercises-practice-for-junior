//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //El valor del radio es 6

        System.out.println("\nSuponiendo que el radio es 6:");

        int radio = 6;
        int diametro = 0;
        final float pi = 3.14f; //Final (No es posible modificar el valor)
        double perimetro = 0;
        double area = 0;

        /*
        Primeramente hago el calculo del perímetro y lo almaceno.
        Para calcular el perímetro hay que calcular el doble del radio (diámetro)
         */

        diametro=(radio*2);
        perimetro=pi*diametro;

        System.out.println("\n-------------------------------------------------------\n");
        System.out.println("El número "+diametro + " se corresponde al diámetro");
        System.out.println("El número "+perimetro + " se corresponde al perímetro");

        //A continuación, calculo el areá, multiplicando pi por el radio al cuadrado

        area=pi*(radio*radio);

        System.out.println("El número "+area + " se corresponde al área");
        System.out.println("\n-------------------------------------------------------\n");

    }
}