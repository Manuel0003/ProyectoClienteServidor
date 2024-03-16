 
package Avance01;


public abstract class Transaccion {
    protected int FechaHora;
    protected String tipoTransa;
    protected int monto;
    
   public abstract String registrarTransa();
   public abstract String definirTransa();
   
}
