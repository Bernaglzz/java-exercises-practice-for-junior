//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        double valorCompra=0;
        double ivaCompra=0;
        double totalFactura=0;

        valorCompra=653.36;
        ivaCompra=(valorCompra*0.16);
        totalFactura=ivaCompra+valorCompra;


        System.out.println("\nEl valor de la compra es "+valorCompra +" euros sin iva\n");
        System.out.println("El IVA es del 16%. A esta factura se le aplica: "+ivaCompra +"\n");
        System.out.println("------------------------------------------------------------\n");
        System.out.println("La factura asciende a "+totalFactura +" euros");

    }
}