import java.util.Scanner;
import java.util.ArrayList;
// <THIS>  hace alusion a si mismo, 
public class PFBiblioteca{

    public static void printStock(ArrayList<ArrayList<String>> booksOnStock){
        // Lista de nombres de generos (actualizable)
        ArrayList<String>genderNick = new ArrayList<>();
            genderNick.add("Terror");
            genderNick.add("Ficcion");
            genderNick.add("Romance");
            genderNick.add("Comedia");
            genderNick.add("Documentales");
            genderNick.add("Infantiles");

        for (int i = 0; i < genderNick.size(); i++) {
            System.out.println("Género: " + genderNick.get(i));
            for (String bookOnStock : booksOnStock.get(i)) {
                System.out.println("  - " + bookOnStock);
            }
            System.out.println(); 
        }
    }

    public static void main(String[] args){

        //Variables
        String newUserRegist;               // registo de nuevos usuarios | variable acumulada en una lista
        String newBookRegist;                // registro de un nuevo ingreso de un libro 
        // Listas de géneros 
        ArrayList<String> Terror = new ArrayList<>();
        ArrayList<String> Ficcion = new ArrayList<>();
        ArrayList<String> Romance = new ArrayList<>();
        ArrayList<String> Comedia = new ArrayList<>();
        ArrayList<String> Documentales = new ArrayList<>();
        ArrayList<String> Infantiles = new ArrayList<>();


        //  Listas 

            //  Lista de generos
        ArrayList<ArrayList<String>> booksOnStock = new ArrayList<>(); // lista de almacenamiento de libros en existencia | sub listas en base a géneros/autores
            booksOnStock.add(Terror);
            Terror.add("It");
            Terror.add("Dracula");
            Terror.add("Frankenstein");
            Terror.add("The Shinning");
            Terror.add("The Haunting of Hill House");
            booksOnStock.add(Ficcion);
            booksOnStock.add(Romance);
            booksOnStock.add(Comedia);
            booksOnStock.add(Documentales);
            booksOnStock.add(Infantiles);

        ArrayList<String> Users = new ArrayList<>();
        // Interfaz de usuario
        /*
        *  Añadir funciones si hacen falta, de forma progresiva
        */
        System.out.println("Bienvenido a la biblioteca virtual en Java");
        System.out.println("¿Qué tarea desea realizar?");
        System.out.println();
        System.out.println("\n 1.- Buscar libro. \n 2.- Solicitar libros (max. 2).\n 3.- Registrar nuevo usuario.\n 4.- Registrar/devolver libro.\n 5.-  ");
    
        printStock(booksOnStock);
    }
}