import javax.swing.*;

public class ÁrbolBinarioDeBúsqueda {
    private Nodo raíz;
    private Nodo aux;

    public void crearÁrbol() {
        int infoDeLaRaíz = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la raíz del árbol: "));
        raíz = new Nodo(infoDeLaRaíz);

        int opcion = JOptionPane.showConfirmDialog(null, "¿Desea ingresar más nodos?");
        while (opcion == JOptionPane.YES_OPTION) {
            int infoNuevoNodo = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la info del nuevo nodo "));
            agregarNodosAlÁrbolBB(raíz, new Nodo(infoNuevoNodo));
            opcion = JOptionPane.showConfirmDialog(null, "¿Desea ingresar más nodos?");
        }
    }

    public void agregarNodosAlÁrbolBB(Nodo nodoInicial, Nodo nodoAAgregar) {
        if (nodoAAgregar.getInfo() < nodoInicial.getInfo()) {
            if (nodoInicial.getNodoIzquierdo() == null) {
                nodoInicial.setNodoIzquierdo(nodoAAgregar);
            } else {
                agregarNodosAlÁrbolBB(nodoInicial.getNodoIzquierdo(), nodoAAgregar);
            }
        } else if (nodoAAgregar.getInfo() > nodoInicial.getInfo()) {
            if (nodoInicial.getNodoDerecho() == null) {
                nodoInicial.setNodoDerecho(nodoAAgregar);
            } else {
                agregarNodosAlÁrbolBB(nodoInicial.getNodoDerecho(), nodoAAgregar);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Ese elemento ya existe en el árbol binario");
        }
    }


    public void agregarNodosAlÁrbolBB() { // Aquí aplicamos otro principio de la programación el POLIMORFISMO
        int opcion;
        do {
            int infoNuevoNodo = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la info del nuevo nodo "));
            agregarNodosAlÁrbolBB(raíz, new Nodo(infoNuevoNodo));
            opcion = JOptionPane.showConfirmDialog(null, "¿Desea ingresar más nodos?");
        } while (opcion == JOptionPane.YES_OPTION);
    }


    public void buscarNodoDentroDelÁrbol(Nodo nodoInicial, int infoABuscar){ //En realidad se busca una información dentro de un nodo xd
        if (nodoInicial == null){
            JOptionPane.showMessageDialog(null, "El elemento no se encuentra dentro del árbol");
        }else
        if (infoABuscar == nodoInicial.getInfo()){
            JOptionPane.showMessageDialog(null, "El elemento " + infoABuscar + " fue encontrado con éxito." + nodoInicial);
        }else
        if (infoABuscar < nodoInicial.getInfo()){
            buscarNodoDentroDelÁrbol(nodoInicial.getNodoIzquierdo(), infoABuscar);
        }else
            buscarNodoDentroDelÁrbol(nodoInicial.getNodoDerecho(), infoABuscar);
    }

    public Nodo ayudanteBuscar(Nodo nod, int clave) {
        if (nod.getInfo() == clave) {
            JOptionPane.showMessageDialog(null, "Clave encontrada, sus datos son: " + nod.getInfo());
            this.aux = nod;
        } else {
            if (clave < nod.getInfo()) {
                if (nod.getNodoIzquierdo() != null) {
                    ayudanteBuscar(nod.getNodoIzquierdo(), clave);
                } else {
                    JOptionPane.showMessageDialog(null, "La clave no fue encontrada");
                }
            } else {
                if (clave > nod.getInfo()) {
                    if (nod.getNodoDerecho() != null) {
                        ayudanteBuscar(nod.getNodoDerecho(), clave);
                    } else {
                        JOptionPane.showMessageDialog(null, "La clave no fue encontrada");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "La clave no ha sido encontrada");
                }
            }
        }
        return this.aux;
    }

    public void borrarABB(int clave) {
        Nodo nodBorrar = ayudanteBuscar(this.raíz, clave);
        if (nodBorrar != null) {
            if (nodBorrar.getNodoIzquierdo() == null && nodBorrar.getNodoDerecho() == null) {
                this.aux = null;
                Nodo padre = buscarPadre(this.raíz, nodBorrar);
                if (padre.getNodoIzquierdo() != null) {
                    if (padre.getNodoIzquierdo().getInfo() == nodBorrar.getInfo()) {
                        padre.setNodoIzquierdo(null);
                    }
                }
                if (padre.getNodoDerecho() != null) {
                    if (padre.getNodoDerecho().getInfo() == nodBorrar.getInfo()) {
                        padre.setNodoDerecho(null);
                    }
                }

                System.out.println("\n  Se ha borrado la clave: " + clave);
            }
            if (nodBorrar.getNodoIzquierdo() == null && nodBorrar.getNodoDerecho() != null) {
                this.aux = null;
                Nodo padre = buscarPadre(this.raíz, nodBorrar);
                if (padre.getNodoIzquierdo() != null) {
                    if (padre.getNodoIzquierdo().getInfo() == nodBorrar.getInfo()) {
                        padre.setNodoIzquierdo(nodBorrar.getNodoDerecho());
                    }
                }
                if (padre.getNodoDerecho() != null) {
                    if (padre.getNodoDerecho().getInfo() == nodBorrar.getInfo()) {
                        padre.setNodoDerecho(nodBorrar.getNodoDerecho());
                    }
                }

                System.out.println("\n  Se ha borrado la clave: " + clave);
            }
            if (nodBorrar.getNodoIzquierdo() != null && nodBorrar.getNodoDerecho() == null) {
                this.aux = null;
                Nodo padre = buscarPadre(this.raíz, nodBorrar);
                if (padre.getNodoIzquierdo().getInfo() == nodBorrar.getInfo()) {
                    padre.setNodoIzquierdo(nodBorrar.getNodoIzquierdo());
                }

                if (padre.getNodoDerecho().getInfo() == nodBorrar.getInfo()) {
                    padre.setNodoDerecho(nodBorrar.getNodoIzquierdo());
                }

                System.out.println("\n  Se ha borrado la clave: " + clave);
            }
            if (nodBorrar.getNodoIzquierdo() != null && nodBorrar.getNodoDerecho() != null) {
                this.aux = null;
                Nodo sucesor = buscarSucesor(nodBorrar.getNodoDerecho());
                this.aux = null;
                borrarABB(sucesor.getInfo());
                borrarNodoCaso3(this.raíz, nodBorrar, sucesor.getInfo());
                System.out.println("\n Se ha borrado la clave: " + clave);
            }
        }
    }
    private void borrarNodoCaso3(Nodo raiz, Nodo nodBorrar, int sucesor) {
        if (raiz.getInfo() == nodBorrar.getInfo()) {
            raiz.setInfo(sucesor);
        } else {
            if (nodBorrar.getInfo() < raiz.getInfo()) {
                borrarNodoCaso3(raiz.getNodoIzquierdo(), nodBorrar, sucesor);
            }
            if (nodBorrar.getInfo() > raiz.getInfo()) {
                borrarNodoCaso3(raiz.getNodoDerecho(), nodBorrar, sucesor);
            }
        }

    }
    private Nodo buscarSucesor(Nodo sucesor) {
        if (sucesor.getNodoIzquierdo() != null) {
            buscarSucesor(sucesor.getNodoIzquierdo());
        } else {
            this.aux = sucesor;
        }
        return this.aux;
    }





    public Nodo buscarPadre(Nodo raíz, Nodo clave) {
        if (this.raíz.getInfo() == clave.getInfo()) {
            this.aux = this.raíz;
        } else {
            if (clave.getInfo() < raíz.getInfo()) {
                if (raíz.getNodoIzquierdo().getInfo() == clave.getInfo()) {
                    this.aux = raíz;
                } else {
                    buscarPadre(raíz.getNodoIzquierdo(), clave);
                }
            } else {
                if (raíz.getNodoDerecho().getInfo() == clave.getInfo()) {
                    this.aux = raíz;
                } else {
                    buscarPadre(raíz.getNodoDerecho(), clave);
                }
            }
        }
        return this.aux;
    }


    @Override
    public String toString() {
        StringBuilder arbol = new StringBuilder();
        imprimirÁrbolAux(raíz, 0, arbol);
        return arbol.toString();
    }

    private void imprimirÁrbolAux(Nodo nodo, int nivel, StringBuilder arbol) {
        if (nodo != null) {
            imprimirÁrbolAux(nodo.getNodoDerecho(), nivel + 1, arbol);
            for (int i = 0; i < nivel; i++) {
                arbol.append("                 ");
            }
            arbol.append(nodo.getInfo()).append("\n");
            imprimirÁrbolAux(nodo.getNodoIzquierdo(), nivel + 1, arbol);
        }
    }

    public Nodo getRaíz() {
        return raíz;
    }
}