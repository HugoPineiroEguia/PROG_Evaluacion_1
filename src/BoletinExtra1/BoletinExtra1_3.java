
package BoletinExtra1;


public class BoletinExtra1_3 {


    public static void main(String[] args) {

        float precio = 90;
        float descuento = 25;
        float precio_final;

        precio_final = precio-(descuento*precio/100);

        System.out.println("El precio final es de: "+precio_final);
    }

}