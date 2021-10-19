package Boletin2;

import java.util.Scanner;

public class Boletin2_3 {

    public static void main(String[] args) {

        Scanner momo = new Scanner(System.in);
        float euros;
        float valor_dolar;
        float dolar;

        System.out.print("Introduce los euros: ");
        euros = momo.nextFloat();
        System.out.print("Introduce el valor del dolar: ");
        valor_dolar = momo.nextFloat();

        dolar = euros*valor_dolar;
        System.out.println("Los dolares correspondiendçtes son: "+dolar+"$.");


    }

}
