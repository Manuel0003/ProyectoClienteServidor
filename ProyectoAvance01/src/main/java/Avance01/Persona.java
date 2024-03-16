
package Avance01;

public abstract class Persona {
    protected String nombre;
    protected int id;
    protected int numTelefono;
    protected int edad;

    public Persona(String nombre, int id, int numTelefono, int edad) {
        this.nombre = nombre;
        this.id = id;
        this.numTelefono = numTelefono;
        this.edad = edad;
    }

    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumTelefono() {
        return numTelefono;
    }

    public void setNumTelefono(int numTelefono) {
        this.numTelefono = numTelefono;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    
    
    public abstract String mostrarDatos();
}
