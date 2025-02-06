import java.util.Scanner;
import java.util.ArrayList;
// <THIS>  hace alusion a si mismo, 
public class PFBiblioteca{

    public static void printMenu(Scanner scanner){
        System.out.println("Bienvenido a la biblioteca virtual en Java");
        System.out.println("¿Qué tarea desea realizar?");
        System.out.println();
        System.out.println("\n 1.- Buscar libro. \n 2.- Solicitar libros (max. 2).\n 3.- Registrar nuevo usuario.\n 4.- Registrar/devolver libro.\n 5.-  ");
    }

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
    public static void imprimirTodoLibros(ArrayList<ArrayList<String>> booksOnStock){
        for(int i = 0; i < booksOnStock.size(); i++)
            System.out.println(booksOnStock.get(i));
    }    
    public static void buscarLibro(ArrayList<ArrayList<String>> booksOnStock, Scanner scanner){
        String busqueda = scanner.nextLine();
        System.out.println("Resultados:");
        for(int i = 0; i < booksOnStock.size(); i++){
            for(int j = 0; j < booksOnStock.get(i).size(); j++){
                //System.out.println(booksOnStock.get(i).get(j));
                if(booksOnStock.get(i).get(j).contains(busqueda)){
                    System.out.println(booksOnStock.get(i).get(j));
                }else{
                    continue;
                }






            }
            
        }
    }

    
    public static void main(String[] args){

        //Variables
        //String newUserRegist;               // registo de nuevos usuarios | variable acumulada en una lista
        //String newBookRegist;                // registro de un nuevo ingreso de un libro 
        Scanner scanner = new Scanner(System.in);
        
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
            Ficcion.add("Alicia en el pais de las maravillas");
            booksOnStock.add(Romance);
            Romance.add("Titanic");
            booksOnStock.add(Comedia);
            Comedia.add("La mama de la mama");
            booksOnStock.add(Documentales);
            Documentales.add("Los perros en la jungla");
            booksOnStock.add(Infantiles);
            Infantiles.add("Doki");

        //ArrayList<String> Users = new ArrayList<>();
        // Interfaz de usuario
        /*
        *  Añadir funciones si hacen falta, de forma progresiva
        */
        printMenu(scanner);
        int userChoise = scanner.nextInt();

        switch (userChoise) {
            case 1:
                    //  Buscar libro
                    scanner.nextLine(); //limpiar buffer
                    System.out.println("Registro de todos los libros (prueba):");
                    imprimirTodoLibros(booksOnStock);
                    System.out.println("Busque el nombre del libro por el título:");
                    buscarLibro(booksOnStock, scanner);

                break;
            case 2:
                    //  Prestar libros
                    System.out.println("Aguanta");
                break;
            case 3: 
                    // Registrar nuevo usuario
                    System.out.println("Aguanta");
                break;
            case 4: 
                    //  Registrar nuevo libro / devolver 
                    System.out.println("Aguanta");
                break;
        
            default:
                System.out.println("Opción no válida, intentelo de nuevo.");
                printMenu(scanner);
        }
    





//        printStock(booksOnStock);
//        Libro libro1 = new Libro("It", "Stephen King", "Terror", 5);
//        libro1.mostrarInfo();
    }
}