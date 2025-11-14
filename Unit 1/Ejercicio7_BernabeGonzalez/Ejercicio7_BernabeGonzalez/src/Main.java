//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int x=7;

        System.out.println((true) && (3 > 4)); //Dará false
        System.out.println("\n////////////////////////////////////\n");

        System.out.println((true) && (x > 4)); //Dará true
        System.out.println("\n////////////////////////////////////\n");

        System.out.println(x!= 3); //Dará true
        System.out.println("\n////////////////////////////////////\n");

        System.out.println((x > 0) || (x < 0)); //Dará true
        System.out.println("\n////////////////////////////////////\n");

        System.out.println(25 > 20 && 13 > 5); //Dará true
        System.out.println("\n////////////////////////////////////\n");

        System.out.println(10 + 4 < 15 - 3 || 2 * 5 + 1 > 14 - 2 * 2); //Dará true
        System.out.println("\n////////////////////////////////////\n");

        System.out.println(4 * 2 <= 8 || 2 * 2 < 5 && 4 > 3 + 1); //Dará true
        System.out.println("\n////////////////////////////////////\n");
    }
}