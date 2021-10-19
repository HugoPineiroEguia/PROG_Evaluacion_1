package Boletin3;

import java.util.Scanner;

public class Boletin3_4 {


    public static void main(String[] args) {

        //Inicio del programa y variables:

        int billetes_100;
        int billetes_20;
        int billetes_5;
        int monedas_1;

        Scanner momo = new Scanner(System.in);
        System.out.print("¿Cuanto dinero tienes?: ");
        int dinero = momo.nextInt();

        //Conteo de billetes

        billetes_100 = (dinero/100);
        dinero = dinero - (100*billetes_100);

        if (dinero%100 == 0){

            System.out.println("Tienes "+billetes_100+" billetes de 100");

        }

        else{

            billetes_20 = (dinero/20);
            dinero = (dinero - 20*billetes_20);

            if (dinero%20 == 0){

                System.out.println("Tienes "+billetes_100+" billetes de 100 y "
                        +billetes_20+" billetes de 20");
            }

            else{

                billetes_5 = (dinero / 5);
                dinero = (dinero - 5*billetes_5);

                if (dinero%5 == 0){

                    System.out.println("Tienes "+billetes_100+" billetes de 100, "
                            +billetes_20+" billetes de 20,"+billetes_5+"billetes de 5");

                }

                else{

                    monedas_1 = (dinero/1);
                    System.out.println("Tienes "+billetes_100+" billetes de 100, "
                            +billetes_20+" billetes de 20, "+billetes_5+" billetes de 5 y "
                            +monedas_1+" monedas de 1");

                }

            }
        }

    }

}
