import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static double calcularPrecio (double precio){
        double resultado = 0;
        double iva = 0.21;
        resultado = precio + (precio*iva);
        return resultado;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double precio = 0;
        double resultado = 0;

        System.out.println("Introduce el precio del producto: ");
        precio = sc.nextDouble(); sc.nextLine();
        resultado = calcularPrecio(precio);
        System.out.println("\nEl precio del producto sin IVA es: "+precio+ " €");
        System.out.println("El precio del producto con IVA es: "+resultado+ " €");



    }
}