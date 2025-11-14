import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        //1. - Uso de IF Anidados (2)

        System.out.println("Introduce un número:");

        int numero= sc.nextInt();
        if (numero==1){
            System.out.println("El número es uno");
        } else {
            if (numero==2){
                System.out.println("El número es dos");
            } else {
                System.out.println("Es otro número distinto de 1 o de 2");
            }
        }

        //2. - Uso de IF Anidados (3)

        System.out.println("Introduce tu edad:");
        int miEdad=sc.nextInt();
        System.out.println("Introduce la edad de tu compañero:");
        int compEdad= sc.nextInt();

        if(miEdad<compEdad) {
            System.out.println("Soy más jóven que mi compañero");
        }else{
            if(compEdad<miEdad){
                System.out.println("Mi compañero es más jóven que yo");
            }else{
                if(miEdad==compEdad){
                    System.out.println("Tenemos la misma edad");
                }
            }
        }

        //3.
        System.out.println("Introduce la presión de la caldera:");
        float presion=sc.nextFloat();
        sc.nextLine();
        if(presion>2){
            System.out.println("Abrir válvula de seguridad");
            --presion;
            System.out.println("Disminuir la presion: " + presion);
        }

        if (presion<=2){
            System.out.println("Introduce tu nombre: ");
            String nombre=sc.nextLine();
            System.out.println("Todo está bien: "+nombre);
        }


        //4. IF anidado con funciones lógicas y puertas lógicas
        System.out.println("Introduce la temperatura de ayer: ");
        int tempAyer=sc.nextInt();
        System.out.println("Introduce la temperatura de hoy: ");
        int tempHoy=sc.nextInt();
        sc.nextLine();
        System.out.println("¿Hace sol? Introduce true or false");
        boolean sol= sc.nextBoolean();

        if ((tempHoy>20)&&(sol==false)){
            System.out.println("Hace calor pero esta lloviendo");
            System.out.println("Entre ayer y hoy la temperatura fue de: "+tempAyer+" y "+tempHoy);
            System.out.println("Mañana habrá "+(tempHoy+5)+" grados");
        } else {
            if ((tempHoy<=20)&&(sol==true)){
                System.out.println("Parece que ha llegado el otoño, pero luce el sol");
            } else {
                if ((tempHoy<=20)&&(sol==false));
                System.out.println("Parece que llega el otoño y llueve");
            }
        }
    }
}