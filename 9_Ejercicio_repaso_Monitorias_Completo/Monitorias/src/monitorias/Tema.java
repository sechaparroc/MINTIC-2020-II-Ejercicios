/*
El tema de la monitoria consistira sencillamente en un nombre y una breve descripcion
 */
package monitorias;

public class Tema {
    public String nombre;
    public String descripcion;
    
    public Tema(String nombre, String descripcion){
        this.nombre = nombre;
        this.descripcion = descripcion;
    }
    public String toString(){
        String info = "Nombre: "+nombre+" Descripcion:" + descripcion;
        return info;
    }
}
