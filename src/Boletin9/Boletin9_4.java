package Boletin9;


import java.util.Scanner;

public class Boletin9_4 {


    public static void main(String[] args) {

        Tabla table = new Tabla();
        table.tabla(table);

    }

    public static class Tabla {

        private int i = 0;
        private int e = 0;
        private int producto = 1;
        Scanner sc = new Scanner(System.in);

        public Tabla() {
        }

        public void tabla(Tabla table) {

            i = 0;

            System.out.print("Introduce un numero: "); e = sc.nextInt(); System.out.println("--------------------"); //Estos guiones los uso para separar las líneas en la terminal y que sea más fácil distinguir unas sentencias de otras.

            if (e == 0) {System.exit(0);}

            while (i < 11) {

                producto = e * i;

                System.out.println(e + " x " + i + " = " + producto);

                i++;
            }
            System.out.println("--------------------");
            table.tabla(table);

        }

    }
}
