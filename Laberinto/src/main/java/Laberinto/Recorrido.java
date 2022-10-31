package Laberinto;

public class Recorrido {
 
    private Casilla primero;
    private Casilla ultimo;
    private int size;

    public Recorrido() {
        primero = null;
        ultimo = null;
        size = 0;
    }

    public void add(Casilla casilla) {
        if (isEmpty()) {
            this.primero = casilla;
            this.ultimo = casilla;
        } else {
            this.ultimo.setSiguiente(casilla);
            this.ultimo = casilla;
        }
        this.size++;
    }

    public Casilla getPrimero() {
        return primero;
    }

    public void setPrimero(Casilla primero) {
        this.primero = primero;
    }

    public Casilla getUltimo() {
        return ultimo;
    }

    public void setUltimo(Casilla ultimo) {
        this.ultimo = ultimo;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void print(){
        int counter = 0;
        if (!this.isEmpty()){
            Casilla aux = this.primero;
            while (counter != this.size){
                counter++;
                System.out.println("Vecino: " + aux.getX() + " " + aux.getY());
                aux = aux.getSiguiente();
            }
        }
    }

    public boolean isEmpty(){
        return primero == null;
    }

    public Casilla getRandom() {
        
        int random = (int) (Math.random() * this.size);
        int counter = 0;
        Casilla aux = this.primero;
        while (counter != random){
            counter++;
            aux = aux.getSiguiente();
        }
        return aux;
    }

    public void removeLast() {
        if (this.size == 1){
            this.primero = null;
            this.ultimo = null;
        } else {
            Casilla aux = this.primero;
            while (aux.getSiguiente() != this.ultimo){
                aux = aux.getSiguiente();
            }
            aux.setSiguiente(null);
            this.ultimo = aux;
        }
        this.size--;
    }






}
