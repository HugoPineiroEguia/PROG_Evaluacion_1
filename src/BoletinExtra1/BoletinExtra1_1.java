
package BoletinExtra1;

import java.util.Scanner;

public class BoletinExtra1_1 {


public static void main(String[] args) {

        Scanner momo = new Scanner(System.in);
        System.out.print("¿Cual es tu nombre?: ");
        String nombre_completo = momo.nextLine();
        System.out.print("¿La fecha de tu nacimiento? ");
        String fecha_nacimiento = momo.nextLine();
        System.out.println("------------------------------\n"
                +nombre_completo+" nacio el "+fecha_nacimiento);
    }

}
