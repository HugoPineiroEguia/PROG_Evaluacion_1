package Boletin3;

import java.util.Scanner;

public class Boletin3_5 {


    public static void main(String[] args) {

        Scanner momo = new Scanner(System.in);
        float sueldo;
        float comision;
        float ventas; //5% d las ventas
        float kilometros; //2€ por Km
        int dietas; //30€ por dia de desplazamiento
        int irpf = 18; //18% descuento del sueldo total
        final int RETENCION = 36; //36€ a descontar
        float sueldo_bruto;
        float sueldo_liquido;

        System.out.print("Sueldo: ");
        sueldo = momo.nextFloat();
        System.out.print("Dinero de las ventas: ");
        ventas = momo.nextFloat();
        System.out.print("Quilometros: ");
        kilometros = momo.nextFloat();
        System.out.print("Dias de desplazamiento: ");
        dietas = momo.nextInt();

        sueldo_bruto = (sueldo + ((ventas * 5)/100) + (kilometros*2) + (dietas*30));
        System.out.println("-----------------------------\n"
                + "Sueldo bruto: "+sueldo_bruto);

        sueldo_liquido = (sueldo_bruto - ((sueldo_bruto * 18)/100) - RETENCION);
        System.out.println("Sueldo liquido: "+sueldo_liquido);


    }

}
