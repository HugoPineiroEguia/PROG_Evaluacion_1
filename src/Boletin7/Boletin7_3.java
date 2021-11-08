
package boletin7_3;


import java.util.Scanner;

public class Boletin7_3 {


    public static void main(String[] args) {

        Signo num = new Signo();
        num.Signo(0f);


    }

    public static class Signo {

        public void Signo (float num){

            Scanner sc = new Scanner(System.in);

            System.out.print("Teclea un numero: ");
            num = sc.nextFloat();


            if (num == 0){System.out.println("VALOR 0");}
            else if (num < 0){System.out.println("VALOR -");}
            else {System.out.println("VALOR +");}


        }

    }
}
