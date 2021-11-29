package Boletin12;


import javax.swing.*;

public class Boletin12_1 {


    public static void main(String[] args) {

        Garaxe car = new Garaxe();

        car.setMatricula();
        car.sitio();
        car.factura();



    }

    public static class Garaxe {

        int numeroCoches;
        String matricula;

        public void setNumeroCoches() {
            numeroCoches = Integer.parseInt(JOptionPane.showInputDialog("Numero de coches"));
        }

        public void setMatricula() {
            matricula = JOptionPane.showInputDialog("Numero de coches");
        }

        public int getNumeroCoches() {
            return numeroCoches;
        }

        public String getMatricula() {
            return matricula;
        }

        public void sitio() {

            if (numeroCoches < 5) {
                JOptionPane.showMessageDialog(null, "PLAZAS DISOPNIBLES");
            } else {
                JOptionPane.showMessageDialog(null, "COMPLETO");
            }
        }

        public void factura() {

            float precio = 0;

            int tiempo = Integer.parseInt(JOptionPane.showInputDialog("¿Cuantas horas estará aparcado el coche?"));

            if (tiempo < 3) {
                precio = tiempo * 0.50f;
            }
            if (tiempo >= 3) {
                tiempo = tiempo - 3;
                precio = 1.5f + tiempo * 0.20f;
            }




            int cartosRecibidos = Integer.parseInt(JOptionPane.showInputDialog("El coste del garaje es de "+precio+"€\nPago"));
            float cartosDevoltos =  cartosRecibidos - precio ;


            JOptionPane.showMessageDialog(null, "FACTURA\nMATRICULA DO COCHE: "+ matricula+"\nTEMPO: "+tiempo+"\nPRECIO: "+precio+"\nCARTOS RECIBIDOS: "+cartosRecibidos+"\nCARTOS DEOVLTOS: "+cartosDevoltos   );


        }

    }
}
