import java.util.ArrayList;

public class Libro {
    // Atributos
    private String titulo;
    private String autor;
    private String genero;
    private int estado;   

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

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String nom) {
        this.titulo = nom;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }
        




    }
