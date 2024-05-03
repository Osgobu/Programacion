public class Nodo {
 
    private Nodo izq;
    private Nodo der;
     
    public Nodo(Nodo izq, Nodo der) {
        super();
        this.izq = izq;
        this.der = der;
    }
 
 //Quiero que me devuelva los valores de la izquierda y de la derecha
    public Nodo izq getIzq() {
        return izq;
    }
 
    public void setIzq(Nodo izq) {
        this.izq = izq;
    }
 
    public Nodo der getDer() {
        return der;
    }
 
    public void setDer(Nodo der) {
        this.der = der;
    }
}