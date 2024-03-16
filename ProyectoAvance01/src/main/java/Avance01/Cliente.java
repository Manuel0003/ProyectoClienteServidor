
package Avance01;


public class Cliente extends Persona {

    protected int productosComprados;

    public Cliente(String nombre, int id, int numTelefono, int edad) {
        super(nombre, id, numTelefono, edad);
    }

    public int getProductosComprados() {
        return productosComprados;
    }

    public void setProductosComprados(int productosComprados) {
        this.productosComprados = productosComprados;
    }

    

    

    

    
    
    
    

    
    
    
    public void historialCompras(){
        
    }

    @Override
    public String mostrarDatos() {
        return "0";
    }
}
