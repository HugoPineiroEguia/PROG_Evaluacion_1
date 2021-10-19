package Boletin3;

import java.util.Scanner;

public class Boletin3_2 {


    public static void main(String[] args) {

        Scanner momo = new Scanner(System.in);
        System.out.print("Grados C: ");


        float gradosC = momo.nextFloat();

        float gradosK = gradosC + 273;
        float gradosF = (float)(gradosC * 1.8 + 32);

        System.out.println("Grados K: "+gradosK+"º\nGrados F: "+gradosF+"º");
    }

}
