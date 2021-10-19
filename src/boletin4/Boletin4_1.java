package boletin4;

import java.util.Scanner;

public class Boletin4_1 {

    public static void main(String[] args) {

        Libro li = new Libro("Elkletex", "Eladrian", 2020, (short) 810, 8.2f);

        li.crearLibro();
        li.amosar();

    }

    public static class Libro {

        String titulo;
        String autor;
        int ano;
        short numPaginas;
        float valoracion;

        public Libro(String _titulo, String _autor, int _ano, short _numPaginas, float _valoracion){

            titulo = _titulo;
            autor = _autor;
            ano = _ano;
            numPaginas = _numPaginas;
            valoracion = _valoracion;

        }

        public void amosar(){

            System.out.println("Titulo: " + titulo);
            System.out.println("Autor: " + autor);
            System.out.println("Ano: " + ano);
            System.out.println("Numero de paginas: " + numPaginas);
            System.out.println("Valoracion: " + valoracion);

        }

        public void crearLibro(){

            Scanner sc = new Scanner(System.in);

            System.out.print("El titulo del libro: ");
            titulo = sc.nextLine();
            System.out.print("El autor es: ");
            autor = sc.nextLine();
            System.out.print("Ano do libro: ");
            ano = sc.nextInt();
            System.out.print("Numero de paginas: ");
            numPaginas = sc.nextShort();
            System.out.print("Valoracion: ");
            valoracion = sc.nextFloat();



        }

    }
}
