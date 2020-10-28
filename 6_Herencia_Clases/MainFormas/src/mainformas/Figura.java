package mainformas;

public abstract class Figura {
    //atributos
    public String nombre;
    public String apellido;
    public String apodo;
    
    public Figura(String nombre, String apellido, String apodo){
        this.nombre = nombre;
        this.apellido = apellido;
        this.apodo = apodo;
    }
    
    public abstract double perimetro();
    public abstract double area();
    public String toString(){
        String info = "Hey soy una figura";
        return info;
    }
    
    public void saludar(){
        System.out.println("Hola como esta..." + " soy " + this.apodo);    
    }
    
}
