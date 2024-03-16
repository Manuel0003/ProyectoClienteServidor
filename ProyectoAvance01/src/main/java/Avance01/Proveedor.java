
package Avance01;


public class Proveedor extends Persona {
    
    protected String direccion;
    protected String correoElectronico;

    public Proveedor(String direccion, String correoElectronico, String nombre, int id, int numTelefono, int edad) {
        super(nombre, id, numTelefono, edad);
        this.direccion = direccion;
        this.correoElectronico = correoElectronico;
    }
    
    @Override
    public String mostrarDatos(){
        return "0";
}
}
