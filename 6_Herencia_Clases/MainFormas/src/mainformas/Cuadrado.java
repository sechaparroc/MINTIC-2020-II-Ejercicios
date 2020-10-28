
package mainformas;

public class Cuadrado extends Figura{

    double lado;
    
    public Cuadrado(String nombre, String apellido, String apodo, double lado) {
        super(nombre, apellido, apodo);
        this.lado = lado;
    }
    

    @Override
    public double perimetro() {
        return this.lado * 4;
    }

    @Override
    public double area() {
        return this.lado * this.lado;
    }
    
    @Override
    public String toString(){
        //Aquí pudimos llamar a la funcion toString del padre (como en el caso del Circulo)
        return "Hey soy un cuadrado " + this.nombre + " " + this.apellido + " " + this.apodo + " " + this.lado;
    }
}
