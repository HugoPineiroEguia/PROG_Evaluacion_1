
package Boletin11;


import javax.swing.*;

public class Boletin11_2 {


    public static void main(String[] args) {

        Random juego = new Random();
        juego.juego();


    }

    public static class Random {

        int vidas = 10;


        public void juego() {


            int numRandom = (int) (Math.random() * 50);
            int numJugador;
            int distancia;

            while (vidas != 0) {

                //System.out.println(numRandom);

                numJugador = Integer.parseInt(JOptionPane.showInputDialog("Introduce un numero del 1 al 50"));

                distancia = (numJugador - numRandom);
                if (distancia<0){distancia = distancia*-1;}

                if (distancia>20 && distancia!=0) {

                    vidas--;
                    JOptionPane.showMessageDialog(null, "MOI LONXE, TE QUEDAN " + vidas + " VIDAS");
                }


                if (distancia<20 && distancia>10 && distancia!=0) {

                    vidas--;
                    JOptionPane.showMessageDialog(null, "LONXE, TE QUEDAN " + vidas + " VIDAS");
                }

                if (distancia<10 && distancia>5 && distancia!=0) {

                    vidas--;
                    JOptionPane.showMessageDialog(null, "PRETO, TE QUEDAN " + vidas + " VIDAS");
                }

                if (distancia<=5 && distancia!=0) {

                    vidas--;
                    JOptionPane.showMessageDialog(null, "MOI PRETO, TE QUEDAN " + vidas + " VIDAS");
                }

                if (numJugador == numRandom) {

                    JOptionPane.showMessageDialog(null, "ACERTASTE EL NUMERO, TE SOBRARON " + vidas + " VIDAS");
                    vidas = 0;



                }
            }
        }
    }
}
