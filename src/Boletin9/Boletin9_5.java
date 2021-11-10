
package Boletin9;


import javax.swing.*;

public class Boletin9_5 {


    public static void main(String[] args) {

        Soldo empresa = new Soldo();
        empresa.traballadoresSoldo();

    }

    public static class Soldo {

        private int i = 0;
        private int numT;
        private int mil = 0;
        private int xMil = 0;

        public Soldo () {}

        public void traballadoresSoldo(){

            numT = Integer.parseInt(JOptionPane.showInputDialog("Introduce el numero de trabajadores"));

            while (i<numT){

                int $ = Integer.parseInt(JOptionPane.showInputDialog("Introduce el numero del trabajador " + (i+1)));

                if ($>1000 && $<1750){mil++;}

                else if ($<1000){xMil++;}

                i++;

            }

            float menosMil = ((xMil*100)/numT);

            JOptionPane.showMessageDialog(null, "Hay " + mil + " trabajadores que cobran entre 1000€ y 1750€."
                    + "\nEl "+menosMil+"% de trabajadores no llega a los 1000€.");

        }

    }
}
