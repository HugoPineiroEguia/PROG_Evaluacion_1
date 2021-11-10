
package Boletin9;

import javax.swing.*;

public class Boletin9_3 {

    public static void main(String[] args) {

        Area a1 = new Area();
        a1.areatriangulo();

    }

    public static class Area {

        private boolean positivo = false;
        private int b;
        private int h;

        public Area(){}

        public void areatriangulo(){

            do {

                b = Integer.parseInt(JOptionPane.showInputDialog("Introduce la base"));
                h = Integer.parseInt(JOptionPane.showInputDialog("Introduce la altura"));

                if (b<=0 || h<=0){JOptionPane.showMessageDialog(null, "Introduce un valor positivo");}

                if (b>0 && h>0) { positivo = true;}
            }
            while (positivo == false);

            float area = (float) (b*h)/2;

            JOptionPane.showMessageDialog(null, "Area del triangulo: " + area);

        }


    }
}
