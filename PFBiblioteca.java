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

    public static void printStock(ArrayList<ArrayList<Libro>> booksStock){
        // Lista de nombres de generos (actualizable)
        ArrayList<String>genderNick = new ArrayList<>();
            genderNick.add("Terror");
            genderNick.add("Ficcion");
            genderNick.add("Romance");
            genderNick.add("Comedia");
            genderNick.add("Documentales");
            genderNick.add("Infantiles");

        for (int i = 0; i < genderNick.size(); i++) {
            System.out.println("***Género: " + genderNick.get(i)+ "***\n");
            for (Libro stock : booksStock.get(i)){
                System.out.println(" " + stock);
            }
            System.out.println(); 
        }
        
    }
    public static void imprimirTodoLibros(ArrayList<ArrayList<Libro>> booksStock){
        for(int i = 0; i < booksStock.size(); i++){
            for(int j = 0; j < booksStock.get(i).size(); j++){
                System.out.println(booksStock.get(i).get(i));
            
            }
        }
    }  
    /*  
    public static void buscarLibro(ArrayList<ArrayList<Libro>> booksStock, Scanner scanner){
        String busqueda = scanner.nextLine();
        System.out.println("Resultados:");
        for(int i = 0; i < booksStock.size(); i++){
            for(int j = 0; j < booksStock.get(i).size(); j++){
                //System.out.println(booksStock.get(i).get(j));
                if(booksStock.get(i).get(j).contains(busqueda)){
                    System.out.println(booksStock.get(i).get(j));
                }else{
                    continue;
                }
            }
        }
    }
        */

    public static void main(String[] args){

        //Variables
        String newUserRegist;               // registo de nuevos usuarios | variable acumulada en una lista
        String newBookRegist;                // registro de un nuevo ingreso de un libro 
        Scanner scanner = new Scanner(System.in);
        
        

        //  Listas 
            // Listas de géneros 
        ArrayList<Libro> Terror = new ArrayList<>();
        ArrayList<Libro> Ficcion = new ArrayList<>();
        ArrayList<Libro> Romance = new ArrayList<>();
        ArrayList<Libro> Comedia = new ArrayList<>();
        ArrayList<Libro> Documentales = new ArrayList<>();
        ArrayList<Libro> Infantiles = new ArrayList<>();

            //  Lista de stock
        ArrayList<ArrayList<Libro>> booksStock = new ArrayList<>(); // lista de almacenamiento de libros en existencia | sub listas en base a géneros/autores
            booksStock.add(Terror);
                Terror.add(new Libro("It", "Stephen King", "Terror", 5));
                Terror.add(new Libro("Dracula", "Bram Stoker", "Terror", 5));
                Terror.add(new Libro("Frankenstein", "Mary Shelley", "Terror", 5));
                Terror.add(new Libro("The Shinnign", "Stephen King", "Terror", 5));
                Terror.add(new Libro("The Haunting of Hill House", "Shirley Jackson", "Terror", 5));
            booksStock.add(Ficcion);
                Ficcion.add(new Libro("1984", "George Orwell", "Ficción", 5));
                Ficcion.add(new Libro("Brave New World", "Aldous Huxley", "Ficción", 5));
                Ficcion.add(new Libro("Fahrenheit 451", "Ray Bradbury", "Ficción", 5));
                Ficcion.add(new Libro("The Great Gatsby", "F. Scott Fitzgerald", "Ficción", 5));
                Ficcion.add(new Libro("To Kill a Mockingbird", "Harper Lee", "Ficción", 5));
            booksStock.add(Romance);
                Romance.add(new Libro("Pride and Prejudice", "Jane Austen", "Romance", 5));
                Romance.add(new Libro("Wuthering Heights", "Emily Brontë", "Romance", 5));
                Romance.add(new Libro("Jane Eyre", "Charlotte Brontë", "Romance", 5));
                Romance.add(new Libro("Gone with the Wind", "Margaret Mitchell", "Romance", 5));
                Romance.add(new Libro("The Notebook", "Nicholas Sparks", "Romance", 5));
            booksStock.add(Comedia);
                Comedia.add(new Libro("La Conjura de los Necios", "John Kennedy Toole", "Comedia", 5));
                Comedia.add(new Libro("Sin noticias de Gurb", "Eduardo Mendoza", "Comedia", 5));
                Comedia.add(new Libro("Buenos Presagios", "Nel Gaiman & Terry Pratchett", "Comedia", 5));
                Comedia.add(new Libro("Wilt", "Tom Sharpe", "Comedia", 5));
                Comedia.add(new Libro("Los Asquerosos", "Santiago Lorenzo", "Comedia", 5));
            booksStock.add(Documentales);
                Documentales.add(new Libro("Sapiens: de animales a dioses", "Yuval Noah Harari", "Documentales", 5));
                Documentales.add(new Libro("El Diario de Ana Frank", "Ana Frank", "Documentales", 5));
                Documentales.add(new Libro("Educated", "Tara Westover", "Documentales", 5));
                Documentales.add(new Libro("Hiroshima", "John Hersey", "Documentales", 5));
                Documentales.add(new Libro("Breve Historia del Tiempo", "Stephen Hawking", "Documentales", 5));
            booksStock.add(Infantiles);
                Infantiles.add(new Libro("Charlie y la Fábrica de Chocolaete", "Roald Dahl", "Infantiles", 5));
                Infantiles.add(new Libro("El Principito", "Antoine de Saint-Exupéry", "Infantiles", 5));
                Infantiles.add(new Libro("Matilda", "Roald Dahl", "Infantiles", 5));
                Infantiles.add(new Libro("Donde Viven los Monstruos", "Maurice Sendak", "Infantiles", 5));
                Infantiles.add(new Libro("Alicia en el País de las Maravillas", "Lewis Carroll", "Infantiles", 5));

        printMenu(scanner);

        System.out.println();

        //printStock(booksStock);

        System.out.println(booksStock.get(1).get(1));

        //imprimirTodoLibros(booksStock);

        System.out.println();       

//        int userChoise = scanner.nextInt();
/*  
        switch (userChoise) {          
            case 1:
                    //  Buscar libro
                    scanner.nextLine(); //limpiar buffer
                    System.out.println("Registro de todos los libros (prueba):");
                    //imprimirTodoLibros(booksStock);
                    System.out.println("Busque el nombre del libro por el título:");
                    buscarLibro(booksStock, scanner);

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
*/
    }  
}