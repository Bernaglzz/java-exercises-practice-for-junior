import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        //Pedir nombre
        System.out.println("Introduce el nombre del alumno:");
        String nombre= sc.nextLine();

        //Pedir apellidos
        System.out.println("Introduce los apellidos del alumno:");
        String apellidos=sc.nextLine();

        //Pedir edad
        System.out.println("Introduce la edad del alumno:");
        int edad=sc.nextInt();

        //Pedir nota programación
        System.out.println("Introduce la nota de Programación:");
        double notaProg=sc.nextDouble();

        //Pedir nota base de datos
        System.out.println("Introduce la nota de Base de Datos:");
        double notaBase=sc.nextDouble();

        //Pedir nota entornos de desarrollo
        System.out.println("Introduce la nota de Entornos de Desarrollo:");
        double notaEnt=sc.nextDouble();

        //Muestra final
        double notaMedia=(notaProg+notaBase+notaEnt)/3;
        System.out.println("El alumno cuyo nombre es "+nombre+ " y apellidos " +
                "son "+apellidos+" tiene una nota media de: "+notaMedia);
    }
}