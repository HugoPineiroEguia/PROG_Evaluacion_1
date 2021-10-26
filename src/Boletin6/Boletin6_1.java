
package Boletin6;


public class Boletin6_1 {


    public static void main(String[] args) {

        Coche car = new Coche();
        car.acelerar(56);
        System.out.println("Velocidad: "+car.getVelocidade()+"Km/h");
        car.frenar(14);
        System.out.println("Velocidad: "+car.getVelocidade()+"Km/h");

    }

    public static class Coche {

        private int velocidade;

        public Coche(){

            velocidade = 0;

        }

        public int getVelocidade() {

            return velocidade;

        }

        public void acelerar (int aceleracion){

            velocidade = velocidade + aceleracion;

        }

        public void frenar (int freno) {

            velocidade = velocidade + freno;

        }


    }
}
