/*
El diagrama de clases de este ejemplo lo pueden consultar en:
    https://drive.google.com/file/d/1Sp3_knVKxS9zyBZ4OD_-9u_54mHW-nZM/view?usp=sharing
 */
package personas;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author usuario
 */
public class Personas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Pelota 
        Cosa cosa1 = new Cosa("Pelota", "Sirve para jugar"); 
        Cosa cosa2 = new Cosa("Cuaderno"); 
        cosa2.descripcion = "Sirve para escribir";
        //Persona
        ArrayList<Persona> personas= new ArrayList<Persona>();
        personas.add(new Persona("Fulanito", 25, 'M'));
        personas.add(new Persona("Fulanita", 52, 'F'));
        
        //la primera persona adquiere un cuaderno
        personas.get(0).adquirirCosa(cosa2);
        //...
        //la segunda persona Fuma 
        personas.get(1).siFuma("Si");
        //la segunda persona adquiere una Pelota y un cuaderno
        personas.get(1).adquirirCosa(cosa1);
        personas.get(1).adquirirCosa(cosa2);
        
        //imprimiendo toda la lista
        //System.out.println("Personas " + personas);
        
        //imprimiendo elemento por elemento
        for(int i = 0; i < personas.size(); i++){
            System.out.println("---------------------------------------------------------");
            System.out.println(personas.get(i));
            System.out.println("---------------------------------------------------------");
        }
        System.out.println("---------------------------------------------------------");
        // la segunda persona perdio sus cosas
        System.out.println(personas.get(1).nombre + " pierde todo :/");
        personas.get(1).perderTodo();
        System.out.println(personas.get(1));
        System.out.println("---------------------------------------------------------");
    }
}
