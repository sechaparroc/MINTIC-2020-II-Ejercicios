/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personas;

/**
 *
 * @author usuario
 */
public class Cosa {
    public String nombre;
    public String descripcion;
    
    public Cosa(String nombre){
        this.nombre = nombre;
    }

    public Cosa(String nombre, String descripcion){
        this.nombre = nombre;
        this.descripcion = descripcion;
    }
    
    public void mostrarDescripcion(){
        System.out.println(descripcion);
    }
    
    public String toString(){
        String info = "nombre: " + nombre + " descripcion: " + descripcion;
        return info;
    }
    
}
