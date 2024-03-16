
package Avance01;


public abstract class Producto {
    protected String nombre;
    protected int precio;
    protected String marca;
    private String fechaingreso;

    

    public Producto(String nombre, int precio, String marca, String fechaingreso) {
        this.nombre = nombre;
        this.precio = precio;
        this.marca = marca;
        this.fechaingreso = fechaingreso;
    }

    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getFechaingreso() {
        return fechaingreso;
    }

    public void setFechaingreso(String fechaingreso) {
        this.fechaingreso = fechaingreso;
    }
    
    public abstract String Organizar();

}
