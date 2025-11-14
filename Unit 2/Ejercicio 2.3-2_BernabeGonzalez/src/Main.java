import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public  static double modenaSeleccionada(double numero, String cambio){
        double resultado = 0;
        switch (cambio){
            case "dolares":
                resultado=numero*1.11;
                break;
            case "yenes":
                resultado=numero*120.63;
                break;
            case "libras":
                resultado=numero*0.87;
                break;
        }
        return resultado;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double numero = 0;
        double resultado = 0;
        String monedaSeleccionada;
        String cambio = "";
        String finaliza = "";

        do {
            System.out.println("Introduce un numero: ");
            numero = sc.nextDouble(); sc.nextLine();
            System.out.println("Elige el cambio de la moneda: ");
            cambio = sc.nextLine();
            if (!cambio.equalsIgnoreCase("FIN")){
                resultado = modenaSeleccionada (numero, cambio);
            }
        } while (!finaliza.equals("FIN"));

    }
}