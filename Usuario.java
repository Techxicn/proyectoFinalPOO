public class Usuario {
    // Atributos
    private String nombre;
    private int edad;
    private int dataMembresia;
    private String StatusMembresia;

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

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getDataMembresia() {
        return dataMembresia;
    }

    public void setDataMembresia(int dataMembresia) {
        this.dataMembresia = dataMembresia;
    }

    public String getStatusMembresia() {
        return StatusMembresia;
    }

    public void setStatusMembresia(String statusMembresia) {
        StatusMembresia = statusMembresia;
    }

    


}
