import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //Solicitamos la asignatura desde la consola.
        System.out.println("-------------------- COMO INTRODUCIR LOS DATOS --------------------\n");
        System.out.println("1. Introducir las dos primeras palabras que compone la asignatura.\n");
        System.out.println("2. Escribir 'de' no cuenta como palabra.\n");
        System.out.println("3. Introducir datos con espacios y mayúsculas correspiendotes (Sín tildes).\n");
        System.out.println("--------------------------------------------------------------------\n");
        System.out.println("Introduce el nombre de la asignatura: \n");
        Scanner sc = new Scanner(System.in);
        String asignatura=sc.nextLine();
        System.out.println("\n--------------------------------------------------------------------\n");


        //Creamos las variables que puede obtener el usuario.

        switch (asignatura){
            case "Sostenibilidad aplicada":
                System.out.println("Tu profesor es Luis Javier");
                break;
            case "Proyecto intermodular":
                System.out.println("Tu profesor es Gonzalo");
                break;
            case "Digitalizacion aplicada":
                System.out.println("Tu profesor es Gonzalo");
                break;
            case "Apoyo de programacion":
                System.out.println("Tu profesor es Luis Javier");
                break;
            case "Programacion":
                System.out.println("Tu profesor es David");
                break;
            case "Ingles profesional":
                System.out.println("Tu profesor es Elena");
                break;
            case "Sistemas informaticos":
                System.out.println("Tu profesor es Eduardo Miguel");
                break;
            case "Itinerario personal":
                System.out.println("Tu profesor es Verónica");
                break;
            case "Entornos de desarrollo":
                System.out.println("Tu profesor es Luis Javier");
                break;
            case "Lenguaje de marcas":
                System.out.println("Tu profesor es Luis Javier");
                break;
            case "Bases de datos":
                System.out.println("Tu profesor es David");
                break;
            default:
                System.out.println("La asignatura no existe o no pertenece a tu ciclo formativo");
        }
        System.out.println("\n--------------------------------------------------------------------\n");
    }
}