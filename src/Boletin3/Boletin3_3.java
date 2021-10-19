package Boletin3;

import java.util.Scanner;

public class Boletin3_3 {


    public static void main(String[] args) {

        Scanner momo = new Scanner(System.in);
        System.out.print("¿Cuantos billetes de 100€ tienes?: ");
        int billete_100 = momo.nextInt();
        System.out.print("¿Cuantos billetes de 20€ tienes?: ");
        int billete_20 = momo.nextInt();
        System.out.print("¿Cuantos billetes de 5€ tienes?: ");
        int billete_5 = momo.nextInt();
        System.out.print("¿Cuantas monedas de 1€ tienes?: ");
        int moneda_1 = momo.nextInt();

        int total = 100*billete_100+20*billete_20+5*billete_5+1*moneda_1;

        System.out.println("Tienes "+total+"€");
    }

}
