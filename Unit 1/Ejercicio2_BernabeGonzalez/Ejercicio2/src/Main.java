//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //Parte 1
        int asturias=1_042_000;
        int madrid=6_464_000;
        long poblacionMundial=7_463_370_459L;

        int resultado=0;

        resultado=asturias+madrid;
        System.out.println("/////////////////////////////////////////////\n");
        System.out.println("El resultado de los operandos es = "+resultado);
        System.out.println("\nLa población mundial es = "+poblacionMundial);
        System.out.println("\n/////////////////////////////////////////////\n");

        //Parte 2
        float bollo=0.87f;
        float quesoPrecio=13.10f;
        int quesoUtilizado=150;
        int quesoDisponible=1000;

        float resultado1=0f;

        resultado1=((quesoPrecio*quesoUtilizado)/quesoDisponible)+bollo;
        System.out.println("Por el bocadillo, deberá pagar = "+resultado1);

        //Parte 2 "Hormigas"

        double hormigas=6E100;
        System.out.println("\nTenemos en clase una invasión de hormigas, concretamente = "+hormigas);
        System.out.println("\n/////////////////////////////////////////////\n");

        //Parte 3

        boolean sorpresa=true;
        boolean contrario=!sorpresa;

        System.out.println(contrario);
        System.out.println("\n/////////////////////////////////////////////\n");

        //Parte 4

        int edadJuan=20;
        int edadPedro=20;

        int resultado2=0;

        resultado2=(edadPedro+1)+edadJuan;
        System.out.println("La edad de Juan y Pedro suman = "+resultado2);

        //Parte 4 "Sueldos"

        int sueldoJuan=1980;
        int sueldoPedro=800;

        int resultado3=0;

        resultado2=sueldoJuan+sueldoPedro;
        System.out.println("\nEl sueldo de Juan y Pedro suman = "+resultado3);
        System.out.println("\n/////////////////////////////////////////////\n");

    }
}