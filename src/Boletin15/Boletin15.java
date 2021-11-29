package Boletin15;


public class Boletin15 {


    public static void main(String[] args) {

    }

    public static class Multimedia {

        private String titulo;
        private String autor;
        private String formato;
        private String duracion;

        public Multimedia() {
        }

        public Multimedia(String titulo, String autor, String formato, String duracion) {
            this.titulo = titulo;
            this.autor = autor;
            this.formato = formato;
            this.duracion = duracion;
        }

        public String getTitulo() {
            return titulo;
        }

        public String getAutor() {
            return autor;
        }

        public String getFormato() {
            return formato;
        }

        public String getDuracion() {
            return duracion;
        }

        @Override
        public String toString() {
            return "Multimedia{" + "titulo=" + titulo + ", autor=" + autor + ", formato=" + formato + ", duracion=" + duracion + '}';
        }



    }

    public static class Pelicula extends Multimedia {

        private String actor;
        private String actriz;

        public Pelicula() {
        }

        public Pelicula(String actor, String actriz, String titulo, String autor, String formato, String duracion) {
            super(titulo, autor, formato, duracion);
            this.actor = actor;
            this.actriz = actriz;
        }

        public String getActor() {
            return actor;
        }

        public String getActriz() {
            return actriz;
        }

        @Override
        public String toString() {
            return "Pelicula{" + "actor=" + actor + ", actriz=" + actriz + '}';
        }



    }

    public static class Disco extends Multimedia {

        private String xenero;

        public Disco() {
        }

        public Disco(String xenero, String titulo, String autor, String formato, String duracion) {
            super(titulo, autor, formato, duracion);
            this.xenero = xenero;
        }

        public String getXenero() {
            return xenero;
        }

        @Override
        public String toString() {
            return "Disco{" + "xenero=" + xenero + '}';
        }



    }
}
