package Boletin5;

import java.util.Scanner;

public class Boletin5 {

    public static void main(String[] args) {

        Consumo gastos = new Consumo();
        System.out.println("----------------------------------");
        gastos.setvMed(18f);
        gastos.setKm(100f);
        gastos.setPGas(84f);
        gastos.setLitros(50f);
        System.out.println("Velocidad media: "+gastos.getVMed());
        System.out.println("El tiempo empleado en realizar el trayecto ha sido de: "+ gastos.getTiempo());

        Consumo gastos2 = new Consumo(100f, 60f, 50f, 1.57f);
        System.out.println("----------------------------------");
        gastos2.mostrarConsumo();

        Consumo gastos3 = new Consumo();
        System.out.println("----------------------------------");
        gastos3.crearConsumo();
        System.out.println("----------------------------------");
        gastos3.mostrarConsumo();

    }

    public static class Consumo {

        private float km;
        private float litros;
        private float vMed;
        private float pGas;

        public Consumo(float kms, float litros, float vMed, float pGas) {

            this.km = kms;
            this.litros = litros;
            this.vMed = vMed;
            this.pGas = pGas;

        }

        public Consumo() {

        }

        public void setvMed(float vMed) {

            this.vMed = vMed;

        }

        public void setKm(float km) {

            this.km = km;

        }

        public void setLitros(float litros) {

            this.litros = litros;

        }

        public void setPGas(float pGas) {

            this.pGas = pGas;

        }

        public float getVMed(){

            return vMed;

        }

        public float getTiempo(){

            float tiempo = (km/vMed);
            return tiempo;

        }


        public void mostrarConsumo() {

            float gastosEuros = (pGas * litros);
            float consumoMedio = (litros / (km));
            float consumoEuros = (gastosEuros);

            System.out.println("El consumo medio es: " + consumoMedio + " litros.");
            System.out.println("El consumo total es: " + consumoEuros + " €.");
            System.out.println("La velocidad media es: " + vMed + " Km/h");

        }


        public void crearConsumo(){

            Scanner sc = new Scanner(System.in);
            System.out.print("Distancia en Km: ");
            km = sc.nextFloat();
            System.out.print("Litros de combustible consumido: ");
            litros = sc.nextFloat();
            System.out.print("Velocidad media: ");
            vMed = sc.nextFloat();
            System.out.print("Precio del gas: ");
            pGas = sc.nextFloat();
        }


    }
}