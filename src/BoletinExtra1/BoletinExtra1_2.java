
package BoletinExtra1;

import java.util.Scanner;

public class BoletinExtra1_2 {

    public static void main(String[] args) {

        Scanner momo = new Scanner(System.in);
        String modulo;
        float nota_1;
        float nota_2;


        System.out.println("¿De que materia quieres calcular tu media?");
        modulo = momo.nextLine();
        System.out.print("¿Que nota sacaste en tu primer parcial?\n1. ");
        nota_1 = momo.nextFloat();
        System.out.print("¿Y en el segundo?\n2. ");
        nota_2 = momo.nextFloat();
        float media_final = (nota_1 + nota_2)/2;
        System.out.println("------------------------------\n"
                + "Nota final "+modulo+": "+media_final);


    }

}