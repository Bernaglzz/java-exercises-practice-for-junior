import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static double meterCateto (){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el valor del cateto: ");
        double cateto;
        cateto = sc.nextDouble(); sc.nextLine();
        return cateto;
    }

    public static double calcularHipotenusa (double cateto, double cateto1){
        double hipotenusa = 0;
        double resultado = 0;
        hipotenusa = (cateto*cateto)+(cateto1*cateto1);
        resultado = Math.sqrt(hipotenusa);
        return resultado;
    }

    public static void main(String[] args) {

        double cateto = meterCateto();
        double cateto1 = meterCateto();
        double resultado = calcularHipotenusa(cateto, cateto1);
        System.out.println("El valor de la hipotenusa es: "+resultado);

    }
}