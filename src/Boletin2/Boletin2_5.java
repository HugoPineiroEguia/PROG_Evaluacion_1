package Boletin2;

import java.util.Scanner;

public class Boletin2_5 {


    public static void main(String[] args) {
        Scanner momo = new Scanner(System.in);


        float millas;
        final float equivalencia = 1852;
        System.out.print("Introduce las millas que quieres pasar a metros: ");
        millas = momo.nextFloat();

        float metros = millas*equivalencia;

        System.out.println("Los metros correspondientes a "+millas+" "
                + "millas son: "+metros);
    }


}
