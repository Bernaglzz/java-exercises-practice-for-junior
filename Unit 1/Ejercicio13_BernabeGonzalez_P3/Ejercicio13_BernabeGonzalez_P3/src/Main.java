//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //Operadores Comparación

        int edadJuan = 6;
        int edadPedro = 6;
        int edadJulio = 21;
        int contador = 14;

        double hipotenusa = 206.73;
        double cateto1 = 13.2;
        double cateto2 = 5.7;

        //a)
        System.out.println("\n--->>>--->>>--->>>--->>>--->>>--->>>--->>>--->>>--->>>--->>>--->>>--->>>");
        System.out.println("\nEs true que Juan es menor de edad = " +(edadJuan<=17));

        //b)
        System.out.println("\nEs true que Juan tiene la misma edad que Pedro = "+(edadJuan==edadPedro));

        //c)
        System.out.println("\nEs true que Julio tiene más edad que Pedro = "+(edadJulio>edadPedro));

        //d)
        System.out.println("\nEs false que la hipotenusa al cuadrado es igual a la suma de sus catetos al cuadrado = "+((hipotenusa*hipotenusa)==(cateto1*cateto1+cateto2*cateto2)));

        //e)
        System.out.println("\nEs true que el cateto1 es mayor que el cateto2 = "+(cateto1>cateto2));

        //f)
        System.out.println("\nEs false que el contador es igual a 8 = "+(contador==8));

        //g)
        System.out.println("\nEs true que contador es distinto a 8 = "+(contador!=8));
        System.out.println("\n--->>>--->>>--->>>--->>>--->>>--->>>--->>>--->>>--->>>--->>>--->>>--->>>");

    }
}