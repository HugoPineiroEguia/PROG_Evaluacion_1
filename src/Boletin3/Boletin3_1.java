package Boletin3;

import java.util.Scanner;

public class Boletin3_1 {


    public static void main(String[] args) {

        Scanner momo = new Scanner(System.in);
        System.out.print("¿Cuanto vale el producto?: ");
        float productoTarifa = momo.nextFloat();
        System.out.print("¿Cuanto has pagado?: ");
        float productoPagado = momo.nextFloat();

        float descuento = (productoPagado/productoTarifa*100);

        System.out.println("Al final se aplico un "+descuento+"% de descuento.");

    }

}