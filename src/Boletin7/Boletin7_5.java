
package Boletin7;


import java.util.Scanner;

public class Boletin7_5 {


    public static void main(String[] args) {

        Orden numeros = new Orden();
        numeros.setNumA(0); numeros.setNumB(0); numeros.setNumC(0);

        System.out.println("------------------------");
        numeros.Ordenar();

    }

    public static class Orden {

        Scanner sc = new Scanner(System.in);

        private int numA;
        private int numB;
        private int numC;
        //System.out.print("Introduce el primer numero");

        public Orden (){}

        public void setNumA (int numA){System.out.print("Introduce el primer numero: "); numA = sc.nextInt(); this.numA = numA;} public int getNumA(){return numA;}
        public void setNumB (int numB){System.out.print("Introduce el segundo numero: ");numB = sc.nextInt(); this.numB = numB;} public int getNumB(){return numB;}
        public void setNumC (int numC){System.out.print("Introduce el tercer numero: ");numC = sc.nextInt(); this.numC = numC;} public int getNumC(){return numC;}

        public void Ordenar(){

            if (numA > numB && numA > numC){
                System.out.println(numA+" es el mayor de los tres.");
            }

            if (numB > numA && numB > numC){
                System.out.println(numB + " es el mayor de los tres.");
            }

            if (numC > numA && numC > numB){
                System.out.println(numC + " es el mayor de los tres.");
            }



        }



    }
}
