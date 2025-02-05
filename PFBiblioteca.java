import java.util.Scanner;
import java.util.ArrayList;

public class PFBiblioteca{
    public static void main(String[] args){

        //Variables
        String newUserRegist;               // registo de nuevos usuarios | variable acumulada en una lista
        String newBookRegist;                // registro de un nuevo ingreso de un libro 
        // Listas de géneros 
        ArrayList<String>Terror = new ArrayList<>(); 
        ArrayList<String>Novelas = new ArrayList<>();
        ArrayList<String>Ficcion = new ArrayList<>();
        ArrayList<String>Aventuras = new ArrayList<>();
        ArrayList<String>Clasicos = new ArrayList<>();
        ArrayList<String>Drama = new ArrayList<>();
        ArrayList<String>Mitologia = new ArrayList<>();
        ArrayList<String>Cuentos = new ArrayList<>();
        ArrayList<String>Romance = new ArrayList<>();
        //  Listas
        ArrayList<ArrayList<String>> booksOnStock = new ArrayList<>(); // lista de almacenamiento de libros en existencia | sub listas en base a géneros/autores
            booksOnStock.add(Terror);
            booksOnStock.add(Novelas);
            booksOnStock.add(Ficcion);
            booksOnStock.add(Aventuras);
            booksOnStock.add(Clasicos);
            booksOnStock.add(Drama);
            booksOnStock.add(Mitologia);
            booksOnStock.add(Cuentos);
            booksOnStock.add(Romance);

        ArrayList<String> Users = new ArrayList<>();
        // Interfaz de usuario
        /*
        *  Añadir funciones si hacen falta, de forma progresiva
        */
        System.out.println("Bienvenido a la biblioteca virtual en Java");
        System.out.println("¿Qué tarea desea realizar?");
        System.out.println();
        System.out.println("\n 1.- Buscar libro. \n 2.- Solicitar libros (max. 2).\n 3.- Registrar nuevo usuario.\n 4.- Registrar/devolver libro.\n 5.-  ");

    }
}