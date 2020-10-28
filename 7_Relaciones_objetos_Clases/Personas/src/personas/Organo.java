/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personas;

public class Organo {
    public String nombre;
    public boolean funcionaBien;
    
    public Organo(String nombre, String estado){  //"Si" - "No"     
        this.nombre = nombre;
        if (estado.equalsIgnoreCase("Si")){
           this.funcionaBien = true;
        } else{
           this.funcionaBien = false;
        }        
    }
    
    public String funcionar(){
        String info = "Soy " + nombre;
        if(funcionaBien){
            info += " y estoy funcionando bien";
        } else{
            info += " estoy en la inmunda";
        }
        return info;
    }
    
}
