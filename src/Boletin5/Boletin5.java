package Boletin5;

import java.util.Scanner;

public class Boletin5 {

    public static void main(String[] args) {

        Consumo gastos = new Consumo();
        System.out.println("----------------------------------");
        gastos.mostrarGastos();

        Consumo gastos2 = new Consumo(13, 100f, 60f, 57f, 1.57f);
        System.out.println("----------------------------------");
        gastos2.mostrarGastos();
    }


    public static class Consumo {

        float km;
        float litros;
        float vMed;
        float pGas;

        public Consumo(int getTiempo, float setKms, float setLitros, float setvMed, float setPGas) {

            km = setKms;
            litros = setLitros;
            vMed = setvMed;
            pGas = setPGas;

        }

        public Consumo() {

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

        public void mostrarGastos() {

            float gastosEuros = (pGas * litros);
            float consumoMedio = (litros / (km));
            float consumoEuros = (gastosEuros);

            System.out.println("El consumo medio es: " + consumoMedio + " litros.");
            System.out.println("El consumo total es: " + consumoEuros + " €.");
            System.out.println("La velocidad media es: " + vMed + " Km/h");

        }



    }
}
