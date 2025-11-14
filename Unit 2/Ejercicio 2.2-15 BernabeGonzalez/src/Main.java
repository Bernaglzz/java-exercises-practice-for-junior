//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int numero = 0;
        int contadorMax = 0;
        int contadorMin = 0;
        float notaMedia = 0f;
        float notaMax = 0f;
        float notaMin = 10f;

        System.out.println("------------------------------NOTAS------------------------------\n");

        for (int veces = 1; veces <= 30; veces++) {
            numero = (int) (Math.random() * 10) + 1;
            System.out.print(numero + " ");
            notaMedia += numero;

            if (numero > notaMax) {
                notaMax = numero;
                contadorMax = 1;
            }else if (numero == notaMax){
                contadorMax++;
            }

            if (numero < notaMin) {
                notaMin = numero;
                contadorMin = 1;
            }else if (numero == notaMin){
                contadorMin++;
            }
        }

        System.out.println("\n\nLa nota media es = " + notaMedia / 30);
        System.out.println("\nLa nota maxima es = " + notaMax + " y sale = "+contadorMax);
        System.out.println("\nLa nota minima es = " + notaMin + " y sale = "+contadorMin);
        System.out.println("\n------------------------------NOTAS------------------------------\n");

    }
}