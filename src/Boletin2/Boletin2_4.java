package Boletin2;

import java.util.Scanner;

public class Boletin2_4 {

    public static void main(String[] args) {

        Scanner momo = new Scanner(System.in);
        float numero_a;
        float numero_b;

        System.out.print("Introduce el primer numero: ");
        numero_a = momo.nextFloat();
        System.out.print("Introduce el segundo numero: ");
        numero_b = momo.nextFloat();


        float suma = numero_a+numero_b;
        float resta_1= numero_a-numero_b;
        float resta_2= numero_b-numero_a;
        float producto= numero_a*numero_b;
        float cociente_1= numero_a/numero_b;
        float cociente_2= numero_b/numero_a;

        System.out.println("La suma de ambos numeros es: "+suma);
        System.out.println("Las diferencias de ambos numeros son: Resta 1 = "+resta_1+"\t Resta 2 = "+resta_2);
        System.out.println("El producto de ambos numeros es: "+producto);
        System.out.println("Los cocientes de ambos numeros son: Cociente 1 = "+cociente_1+"\t Cociente 2 = "+cociente_2);

    }

}
