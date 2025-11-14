//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //Operadores Aritméticos

        //Parte a)
        double impuesto = 0;
        impuesto=(2.2*1.0)+5.0;

        System.out.println("a) Resultado del impuesto: "+impuesto +" €\n");

        //Parte b)
        int impuesto2 = 0;
        impuesto2=(12/2)-8;

        System.out.println("b) Resultado del impuesto 2: "+impuesto2 +" €\n");

        //Parte c)
        int cociente = 0;
        int resto = 0;
        float cociente_decimal = 16/3f;
        cociente=(16/3);
        resto=(16%3);

        System.out.println("c) Resultado del cociente es: "+cociente_decimal +"\nc) Resultado del resto " +
                "es: "+ resto+ "\n");

        //Parte d)
        int nueve = 9;
        int postIncremento = nueve ++; //Muestra nueve pero vale 10

        System.out.println("d) Resultado de la variable 'nueve': " +nueve);
        System.out.println("d) Resultado de postIncremento: "+postIncremento +"\n");

        //Parte e)
        int preIncremento = ++ nueve; //Como su valor es 10 se suma 1 y es 11

        System.out.println("e) Resultado de la variable 'nueve': "+nueve);
        System.out.println("e) Resultado de la variable preIncremento: "+preIncremento +"\n");

        //Parte f)
        int postDecremento = nueve --; //Aparece 10 pero su valor es 9

        System.out.println("f) Resultado de la variable 'nueve': "+nueve );
        System.out.println("f) Resultado de la variable postDecremento: "+postDecremento +"\n");

        //Parte g)
        int preDecremento = -- nueve;

        System.out.println("g) Resultado de la variable 'nueve': "+nueve);
        System.out.println("g) Resultado de la variable preDecremento: "+preDecremento);

    }
}
