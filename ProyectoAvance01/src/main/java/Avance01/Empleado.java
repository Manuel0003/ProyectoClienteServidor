
package Avance01;


public class Empleado extends Persona {
    
    protected int salario;

    public Empleado(int salario, String nombre, int id, int numTelefono, int edad) {
        super(nombre, id, numTelefono, edad);
        this.salario = salario;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }
    
    
    
    @Override
    public String mostrarDatos(){
        return "0";
    }
    
}
