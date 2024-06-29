public class Nodo {
    private int info;
    private Nodo nodoDerecho;
    private Nodo nodoIzquierdo;

    public Nodo() {
        nodoDerecho = null;
        nodoIzquierdo = null;
        info = 0;
    }

    public Nodo(int infoNuevoNodo) {
        nodoDerecho = null;
        nodoIzquierdo = null;
        info = infoNuevoNodo;
    }


    public void setInfo(int info) {
        this.info = info;
    }

    public int getInfo() {
        return info;
    }

    public Nodo getNodoIzquierdo() {
        return nodoIzquierdo;
    }

    public Nodo getNodoDerecho() {
        return nodoDerecho;
    }

    public void setNodoIzquierdo(Nodo nodoIzquierdo) {
        this.nodoIzquierdo = nodoIzquierdo;
    }
    public void setNodoDerecho(Nodo nodoDerecho) {
        this.nodoDerecho = nodoDerecho;
    }

    @Override
    public String toString() {
        return " \n\n\n Info del nodo: " + info + "\n nodos hijos: \n Nodo derecho: " + nodoDerecho + " Nodo Izquierdo: " + nodoIzquierdo;
    }
}
