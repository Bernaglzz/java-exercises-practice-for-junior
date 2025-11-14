//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //¿Cuál es el valor de la variable z al ejecutar esta sentencia de código?

        int z = 5;

        /* -- EXPLICACIÓN --
        6 > 5 or 6 > 6
        true or false
        true por lo tanto el valor será 7 (al ser true en la primera instancia el resto ya no se realiza,
        y se le suma 1 por z++ se encuentra fuera)
        */

        if (++z > 5 || ++z > 6) z++;
        System.out.println("El valor será true, por tanto el valor será 7");

        /* -- EXPLICACIÓN --
        6 > 5 or 7 > 6
        true or true
        al ser un único or se van cumpliendo las condiciones y no depende solo de la misma instacia, vale 8
        debido a que las sumas se van agrupando
        */

        if (++z > 5 | ++z > 6) z++;
        System.out.println("El valor será 8");

    }
}