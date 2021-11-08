package Boletin7;


import java.util.Scanner;

public class Boletin7_4 {


    public static void main(String[] args) {

        Peso persona1 = new Peso();
        Peso persona2 = new Peso();

        persona1.Peso(); persona1.setNom(""); persona1.setPeso(0);
        persona2.Peso(); persona2.setNom(""); persona2.setPeso(0);

        persona1.Gordo(persona1, persona2);
    }

    public static class Peso {

        private String nom;
        private float peso;
        Scanner sc = new Scanner(System.in);

        public void Peso(){}




        public void setNom (String nom){

            System.out.print("Nombre: ");
            nom = sc.nextLine();
            this.nom = nom;

        }

        public String getNom(){

            return nom;

        }


        public void setPeso (float peso){

            System.out.print("Peso: ");
            peso = sc.nextFloat();
            this.peso = peso;

        }

        public float getPeso(){

            return peso;

        }


        public void Gordo(Peso gordo1, Peso gordo2){

            if (gordo1.getPeso() > gordo2.getPeso()){

                float restaPeso = (gordo1.getPeso()-gordo2.getPeso());
                System.out.println(gordo1.getNom() + " pesa " + restaPeso + " kilos mas que "+ gordo2.getNom());

            }

            else {

                float restaPeso = (gordo2.getPeso()-gordo1.getPeso());
                System.out.println(gordo2.getNom() + " pesa " + restaPeso + " kilos mas que "+ gordo1.getNom());

            }
        }
    }
}
