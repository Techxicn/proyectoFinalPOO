public class Usuario {
     // Atributos
    String nombre;
    int edad;
    int dataMembresia;
    String StatusMembresia;
    
     // Constructor
    public Usuario(String nombre, int edad, int dataMembresia, String StatusMembresia) {
            this.nombre = nombre;
            this.edad = edad;
            this.dataMembresia = dataMembresia;
            this.StatusMembresia = StatusMembresia;
        }

    
    public void dataUser() {
        System.out.println("Nombre de usuario: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Id membresía: " + dataMembresia);


    }
}
