package Boletin14;

public class Boletin14 {

    public static void main(String[] args) {

        Libros l1 = new Libros(false, 0001, "El achebe", 2021);
        l1.toString();

    }

    public static class Biblioteca {

        private int codigo;
        private String titulo;
        private int ano;

        public Biblioteca() {
        }

        public Biblioteca(int codigo, String titulo, int ano) {
            this.codigo = codigo;
            this.titulo = titulo;
            this.ano = ano;
        }

        public int getCodigo() {
            return codigo;
        }

        public int getAno() {
            return ano;
        }


        @Override
        public String toString() {
            return "Biblioteca{" + "codigo=" + codigo + ", titulo=" + titulo + ", ano=" + ano + '}';
        }



    }

    public static class Libros extends Biblioteca {

        private boolean prestado;

        public Libros() {
        }

        public Libros(boolean prestado, int codigo, String titulo, int ano) {
            super(codigo, titulo, ano);
            this.prestado = prestado;
        }

        public boolean isPrestado() {
            return prestado;
        }

        public void setPrestado(boolean prestado) {
            this.prestado = prestado;
        }

        @Override
        public String toString() {
            return "Libros{" + "prestado=" + prestado + '}';
        }




    }

    public static class Revistas extends Biblioteca {

        private int numero;

        public Revistas() {
        }

        public Revistas(int numero, int codigo, String titulo, int ano) {
            super(codigo, titulo, ano);
            this.numero = numero;
        }

        public int getNumero() {
            return numero;
        }

        public void setNumero(int numero) {
            this.numero = numero;
        }

        @Override
        public String toString() {
            return "Revistas{" + "numero=" + numero + '}';
        }



    }
}
