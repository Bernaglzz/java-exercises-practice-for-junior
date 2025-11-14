import java.util.*;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public  static int calcularNumero (int posicion){
        int resultado = 0;
        int valor1 = 0;
        int valor2 = 1;

        //Calcular Fibonacci
        if (posicion == 1){
            resultado = valor1;
        } else if (posicion == 2){
            resultado = valor2;
        } else {
            for (int i = 3; i<=posicion; i++){
                resultado=valor1+valor2;
                valor1 = valor2;
                valor2 = resultado;
            }
        }
        return resultado;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int posicion = 0;
        int resultado;
        boolean stop = false;

        do {
            System.out.println("Introduce una posición: ");
            posicion = sc.nextInt();
            sc.nextLine();
            if (posicion >= 0) {
                stop = true;
            } else {
                System.out.println("Introduce un valor positivo");
            }
        }while (!stop);

        resultado = calcularNumero(posicion);
        System.out.println("El numero de Fibonacci correspondiente es: " + resultado);
    }
}