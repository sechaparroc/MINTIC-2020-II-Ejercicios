
package monitorias;

public class Persona {
    public String nombre; 
    public int edad;
    public boolean binario; 

    public Persona(String nombre, int edad, boolean binario) {
        this.nombre = nombre;
        this.edad = edad;
        this.binario = binario;
    }

    public void existir(){
        System.out.println("Hey estoy existiendo..");    
    }
    
    public void existir(String frase){
        System.out.println("Hey estoy existiendo.. " + frase);    
    }


}
