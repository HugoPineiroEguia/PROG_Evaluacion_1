
package Boletin11;


import javax.swing.*;

public class Boletin11_1 {


    public static void main(String[] args) {

        JuegoRandom juego = new JuegoRandom();
        juego.juego();

    }

    public static class JuegoRandom {

        int vidas = 5;

        public void juego() {


            int numJugador_1 = Integer.parseInt(JOptionPane.showInputDialog("Introduce el numero a adivinar"));
            int numJugador_2;

            while (vidas != 0) {

                numJugador_2 = Integer.parseInt(JOptionPane.showInputDialog("Introduce el numero a acertar"));

                if (numJugador_1 < numJugador_2){

                    vidas--;
                    JOptionPane.showMessageDialog(null, "Tu numero es mayor, te quedan " + vidas + " vidas");

                }

                if (numJugador_1 > numJugador_2){

                    vidas--;
                    JOptionPane.showMessageDialog(null, "Tu numero es mayor, te quedan " + vidas + " vidas");

                }

                if (numJugador_1 == numJugador_2){


                    JOptionPane.showMessageDialog(null, "Acertaste el numero, te sobraron " + vidas + " vidas");
                    vidas = 0;
                }

            }
        }
    }
}
