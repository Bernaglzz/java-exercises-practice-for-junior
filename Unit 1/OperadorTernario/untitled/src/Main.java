//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //Dependiendo de los valores de A y B y su comparación, tendremos un resultado u otro.

        int a = 28;
        int b = 4;

        String aux1="";
        if (a>b){
            aux1="A es mayor que B";
        }else{
            aux1="B es mayor que A";
        }

        //La variable de aux se encarga de comparar y si no se cumple A, se pone B

        String aux="";
        aux=(a>b)?"A es mayor que B":"B es mayor que A";
        System.out.println(aux);
    }
}