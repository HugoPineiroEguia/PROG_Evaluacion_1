package Boletin6;

import java.util.Scanner;

public class Boletin6_3 {

    public static void main(String[] args) {

        Circulo c1 = new Circulo();
        c1.setRadio(87.4);
        c1.calcularArea();
        c1.calcularLonxitude();

        System.out.println("-------------------------");

        Circulo c2 = new Circulo(67.8);
        c2.calcularArea();
        c2.calcularLonxitude();

    }

    public static class Circulo {

        double radio;
        final double Pi = 3.14;

        public Circulo() {
        }

        public Circulo(double radio) {

            Scanner sc = new Scanner(System.in);
            System.out.print("Radio de la circunferencia: ");
            radio = sc.nextDouble();
            this.radio = radio;

        }

        public void setRadio(double radio) {
            this.radio = radio;
        }

        public double getRadio() {
            return radio;
        }

        public void calcularArea() {

            System.out.println("El area de la circunferencia es: " + (Math.pow(radio, 2)) * Pi);

        }

        public void calcularLonxitude() {

            System.out.println("La longitud de la circunferencia es: " + 2 * Pi * radio);

        }

    }
}