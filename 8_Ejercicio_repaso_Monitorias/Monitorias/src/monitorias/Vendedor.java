package monitorias;

import java.util.ArrayList;


public class Vendedor extends Persona{
    //Atributos
    public ArrayList<String> cosasQueVende; 
    
    //Constructor
    public Vendedor(String Nombre, int edad, boolean binario) {
        super(Nombre, edad, binario);
        this.cosasQueVende = new ArrayList<String>();
        this.cosasQueVende.add("Mazamorra dulce con leche panela y queso");
        this.cosasQueVende.add("Arroz con leche");
        this.cosasQueVende.add("Peto");
    }
    //Metodos
    public void gritar(){
        System.out.println("Vendo: ");
        for (int i=0;i<this.cosasQueVende.size();i++){
            System.out.println("\t" + cosasQueVende.get(i));
        }
    }
    
    
}
