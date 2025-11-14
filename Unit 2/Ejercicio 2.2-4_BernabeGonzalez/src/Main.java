import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Creo la variable de mes que va a ser el número que utilizaremos para determinar los casos

        int mes = 0;

        /*
        Para que distinga los nombres de los meses como una variable creamos DOS variables:
        1. nombreMes (Se encargará de identificar según el valor del mes su nombre correspodiente y asignarlo posterior
                      -mente como variable en el System.out.println FINAL)
        2. meses (Se crea una lista con los nombres para que el programa sepa de donde escoger)('Enero' Cuenta como el
                  valor 0)
        */

        String nombreMes;
        String [] meses = {
                "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre",
                "Octubre", "Noviembre", "Diciembre"
        };

        //Creamos las variables de mes, año y año bisiesto para determinar los datos que se piden

        int diasMes = 0;
        int anio = 0;
        int anioBisiesto = 0;

        //Le pedimos al cliente los datos que vamos a utilizar en el switch

        System.out.println("--------------------ANALIZA TU MES--------------------\n");
        System.out.println("Introduce el número del mes:");
        mes = sc.nextInt(); sc.nextLine();
        System.out.println("Introduce el número del año:");
        anio = sc.nextInt(); sc.nextLine();
        System.out.println("\n-------------------------------------------------------\n");

        /*Metemos el switch dentro del if para que este lo condicione de forma que tengas que escoger un número (1 - 12)
        Una vez lo condiciona, tenemos que asignar a la variable que determina el nombre del mes "nombreMes"
        la tabla de "meses" (los valores se empiezan asignar en el 0; por lo tanto Enero=0 en la tabla).
        Para que sea '1' el mes de Enero, tenemos que restarle (-1) al valor del mes que estamos metiendo.
        */

        if (mes >= 1 || mes <= 12){
            nombreMes = meses[mes - 1];
            switch (mes) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    diasMes = 31;
                    System.out.println("El mes " + mes + " es " + nombreMes + " y tiene " + diasMes + " días. ✓");
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    diasMes = 30;
                    System.out.println("El mes " + mes + " es " + nombreMes + " y tiene " + diasMes + " días. ✓");
                    break;
                case 2:
                    anioBisiesto = (anio % 4 == 0) ? 29 : 28; //Si es multiplo de 4 es 29 si no 28
                    System.out.println("El mes " + mes + " es " + nombreMes + " y tiene " + anioBisiesto + " días. ✓");
                    break;
                default:
                    System.out.println("Tu valor del mes esta fuera del rango permitido (1-12)");
                    break;
            }
        }
        System.out.println("\n-------------------------------------------------------\n");
        //El programa da error si te sales del rango 1-12 por el condicionante if
    }
}