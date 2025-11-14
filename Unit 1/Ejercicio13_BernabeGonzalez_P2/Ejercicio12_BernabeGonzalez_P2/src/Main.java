//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //Operadores Lógicos

        //Frío
        boolean frio=false;
        System.out.println("---///---///---///---///---///---///---///---///---");
        System.out.println("\nLa variable frío resulta en = "+(!frio));

        //Oportunidad
        boolean bueno=false;
        boolean bonito=false;
        boolean barato=false;
        boolean oportunidad= bueno && bonito && barato;

        System.out.println("\nLa combinación de bueno, bonito y barato es = " +oportunidad);
        System.out.println("\n---///---///---///---///---///---///---///---///---");
    }
}