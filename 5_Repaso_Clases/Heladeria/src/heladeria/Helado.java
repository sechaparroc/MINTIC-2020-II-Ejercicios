package heladeria;

public class Helado {
    public String sabor;
    public double costo;
    
    public Helado(String s, double c){
        this.sabor = s;
        this.costo = c;
    }
    
    public String toString(){
        String info = "Sabor: " + this.sabor + " Precio: " + this.costo;
        return info;
    }
}
