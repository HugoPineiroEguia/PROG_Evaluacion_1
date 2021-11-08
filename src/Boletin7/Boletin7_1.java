package Boletin7;

import java.util.Scanner;

public class Boletin7_1 {


    public static void main(String[] args) {

        Positivo num1 = new Positivo();
        num1.Positivo(0);
    }

    public static class Positivo {

        float num;

        public void Positivo(float num) {

            Scanner sc = new Scanner(System.in);

            System.out.print("Pon un numero: ");
            num = sc.nextInt();

            this.num = num;

            if (num < 0) {

                num = num * -1;
                System.out.println("El numero es: " + num + "y es positivo");

            } else {

                System.out.println("El numero es: " + num + " y es positivo");

            }

        }

    }
}
