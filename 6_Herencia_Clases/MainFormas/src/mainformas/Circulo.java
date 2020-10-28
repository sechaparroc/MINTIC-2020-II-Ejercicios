package mainformas;

public class Circulo extends Figura{
    public double radio;
    
    public Circulo(String nombre, String apellido, String apodo) {
        super(nombre, apellido, apodo);
    }
    
    public Circulo(String nombre, String apellido, String apodo, double radio){
        super(nombre, apellido, apodo);
        this.radio=radio;
    }    
    
    public void imprimeArea(){
        System.out.println("area: " + area());
    }
    
    @Override
    public  double perimetro(){
        return 2 * Math.PI * this.radio; 
    }
    @Override
    public double area() {
        return Math.PI * Math.pow(this.radio, 2);
    }
    @Override
    public String toString(){
        String info = super.toString();
        info += " Circulo: " + this.nombre + " " + this.apellido + " " + this.apodo + " radio : " + this.radio;
        return info;
    }
    
}
