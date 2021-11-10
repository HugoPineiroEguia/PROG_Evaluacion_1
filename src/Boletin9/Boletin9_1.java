
package Boletin9;


import javax.swing.*;

public class Boletin9_1 {


    public static void main(String[] args) {

        BucleSignos bucle = new BucleSignos();
        bucle.diezNums();

    }

    public static class BucleSignos {

        private int i = 0;
        private int num = 0;
        private int n = 0;
        private int p = 0;
        private int c0 = 0;

        public BucleSignos(){}

        public void diezNums() {

            while (i<10){

                num = Integer.parseInt(JOptionPane.showInputDialog("Introduce un numero"));

                if (num==0){c0++;}
                if (num>0){p++;}
                if (num<0){n++;}

                i++;

            }

            JOptionPane.showMessageDialog(null, "Tienes " +  p + " positivos, " + n + " negaticos y " + c0 + " ceros");

        }



    }
}