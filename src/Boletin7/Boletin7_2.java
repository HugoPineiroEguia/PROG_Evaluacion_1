
package Boletin7;


import java.util.Scanner;

public class Boletin7_2 {


    public static void main(String[] args) {

        Operacion op = new Operacion();
        op.Operacion((short) 0, (short) 0);


    }

    public static class Operacion {

        short numA;
        short numB;

        public void Operacion (short numA, short numB){

            Scanner sc = new Scanner(System.in);

            System.out.print("Introduce el primer numero: ");
            numA = sc.nextShort(); this.numA = numA;

            System.out.print("Introduce el segundo numero: ");
            numB = sc.nextShort(); this.numB = numB;

            if (numA >= numB){

                System.out.println("La resta de ambos numeros es: "+ (numA-numB) +"\nLa suma de ambos numeros es: " + (numA+numB));

            }

            else {

                System.out.println("La suma de ambos numeros es: " + (numA+numB));

            }




        }





    }
}