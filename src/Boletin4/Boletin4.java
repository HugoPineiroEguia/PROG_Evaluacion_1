package Boletin4;

import java.util.Scanner;

public class Boletin4 {

    public static void main(String[] args) {

        Libro li1 = new Libro("Elkletex", "Eladrian", 2020, (short) 810, 8.2f);
        li1.crearLibro();
        li1.amosar();

        Libro li2 = new Libro();
        li2.setAno(56);
        li2.amosar();

        Libro li3 = new Libro();
        li3.crearLibro();
        li3.amosar();


    }

    public static class Libro {

        private String titulo;
        private String autor;
        private int ano;
        private short numPaginas;
        private float valoracion;

        public Libro(){}

        public Libro(String _titulo, String _autor, int _ano, short _numPaginas, float _valoracion){

            titulo = _titulo;
            autor = _autor;
            ano = _ano;
            numPaginas = _numPaginas;
            valoracion = _valoracion;

        }

        public String getTitulo() {

            return titulo;

        }

        public void setTitulo(String titulo){

            this.titulo = titulo;

        }

        public String getAutor(){

            return autor;

        }

        public void setAutor(String autor){

            this.autor = autor;

        }

        public int getAno(){

            return ano;

        }

        public void setAno(int ano){

            this.ano = ano;

        }

        public short getNumPaginas(){

            return numPaginas;

        }

        public void setNumPaginas( short numPaginas){

            this.numPaginas = numPaginas;

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
            System.out.print("El autor del libro es: ");
            autor = sc.nextLine();
            System.out.print("Ano do libro: ");
            ano = sc.nextInt();
            System.out.print("Numero de paginas del libro: ");
            numPaginas = sc.nextShort();
            System.out.print("Valoracion del libro: ");
            valoracion = sc.nextFloat();
            System.out.println("---------------------------------");



        }

    }
}