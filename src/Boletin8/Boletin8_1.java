
package Boletin8;


import java.util.Scanner;

public class Boletin8_1 {


    public static void main(String[] args) {

        Producto art = new Producto(null, 0);
        art.Consumo();

    }

    public static class Producto {

        private String nom;
        private float ventas;
        Scanner sc = new Scanner(System.in);

        public Producto(){}

        public Producto(String nom, float ventas){

            System.out.print("Nombre del producto: ");
            nom = sc.nextLine();

            System.out.print("Numero de ventas: ");
            ventas = sc.nextFloat();

            this.nom = nom;
            this.ventas = ventas;

        }

        public void Consumo(){

            if (ventas <= 100){System.out.println(nom + " es un producto de bajo consumo");}
            if (ventas > 100 && ventas <= 500){System.out.println(nom + " es un producto de consumo medio");}
            if (ventas > 500 && ventas <= 1000){System.out.println(nom + " es un producto de alto consumo");}
            if (ventas > 1000){System.out.println(nom + " es un producto de primera necesidad");}

        }

    }
}
