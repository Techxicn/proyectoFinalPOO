import java.util.ArrayList;

public class Libro {
        // Atributos
        String titulo;
        String autor;
        String genero;
        int estado;   
    
        // Constructor
        public Libro(String titulo, String autor, String genero, int estado) {
            this.titulo = titulo;
            this.autor = autor;
            this.genero = genero;
            this.estado = estado;
        }

        public String toString(){
            return "Título: " + titulo + "\n Autor: " + autor + "\n Género: " + genero + "\n Stock: " + estado + "\n";
        }
    
        // Método para mostrar información del libro
        public void mostrarInfo() {
            System.out.println("Título: " + titulo);
            System.out.println("Autor: " + autor);
            System.out.println("Gènero " + genero);
            if(estado>0){
                System.out.println("En stock: " + estado);
            }else{
                System.out.println("Sin stock: " + estado);
            }
        }

    }
