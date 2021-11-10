
package Boletin9;


import javax.swing.*;

public class Boletin9_2 {


    public static void main(String[] args) {

        Operaciones operacion1 = new Operaciones();
        operacion1.SumaProducto();


    }

    public static class Operaciones {

        private int i = 10;
        private int suma = 0;
        private double producto = 1;

        public Operaciones(){}

        public void SumaProducto(){


            while (i<90){

                suma = suma + i;
                producto = (producto*i);

                i++;

            }

            JOptionPane.showMessageDialog(null, "La suma de numeros del 10 al 90 es: " + suma + ". Y el producto: " + producto);

        }

    }
}
