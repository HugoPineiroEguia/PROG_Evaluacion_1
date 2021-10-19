package Boletin5;


import java.util.Scanner;

public class Boletin5 {


    public static void main(String[] args) {

        Consumo gastos = new Consumo();
        gastos.mostrarGastos();

    }

    public static class Consumo {

        int tiempo;
        float consumoMedio;
        float consumoEuros;
        float km;
        float litros;
        float vMed;
        float pGas;

        public Consumo (int getTiempo, float consumoMedio, float consumoEuros, float setKms, float setLitros, float setvMed, float setPGas){



        }

        public Consumo(){

            Scanner sc = new Scanner(System.in);
            System.out.print("Tiempo en horas: "); tiempo = sc.nextInt();
            System.out.print("Consumo medio del vehiculo: "); consumoMedio = sc.nextFloat();
            System.out.print("Consumo medio en € por cada 100km: "); consumoEuros = sc.nextFloat();
            System.out.print("Distancia en Km: "); km = sc.nextFloat();
            System.out.print("Litros de combustible consumido: "); litros = sc.nextFloat();
            System.out.print("Velocidad media: "); vMed = sc.nextFloat();
            System.out.print("Precio del gas: "); pGas = sc.nextFloat();

        }

        public void mostrarGastos(){


            float gastoFinal;



            System.out.print("El precio total es: ");

        }


    }
}
