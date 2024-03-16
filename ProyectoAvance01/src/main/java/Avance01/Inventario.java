
package Avance01;


public abstract class Inventario {
    protected int cantProduc;
    protected String tipo;
    public abstract int add();
    public abstract int remover();
    public abstract int actualizar();
    public abstract String buscar();

    public Inventario(int cantProduc, String tipo) {
        this.cantProduc = cantProduc;
        this.tipo = tipo;
    }

    public int getCantProduc() {
        return cantProduc;
    }

    public void setCantProduc(int cantProduc) {
        this.cantProduc = cantProduc;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    
}
