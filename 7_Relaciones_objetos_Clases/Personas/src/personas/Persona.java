/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personas;

import java.util.ArrayList;

/**
 *
 * @author usuario
 */
public class Persona {
    public String nombre;
    public int edad;
    public char sexo;
    public double dinero;
    public Organo[] organos; //composicion --- Se necesitan
    public ArrayList<Cosa> pertenencias; //agregacion --- No son necesarias
    
    public Persona(String nombre, int edad, char sexo){
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        //Dentro del constructor de una clase podemos construir otros objetos
        this.organos = new Organo[4];     
        organos[0] = new Organo("cerebro", "si");
        organos[1] = new Organo("pulmones", "si");
        organos[2] = new Organo("corazon", "si");
        organos[3] = new Organo("riñones", "si");
        pertenencias = new ArrayList<Cosa>();
    }
    
    public void existir(){
        System.out.println("Soy " + nombre + " y estoy existiendo...");
    }
    
    public void siFuma(String fumar){
        if (fumar.equals("Si")){
            organos[1].funcionaBien = false;
        }
    }    
    
    public void adquirirCosa(Cosa cosa){
        this.pertenencias.add(cosa);
    }
    
    public void perderTodo(){
        this.pertenencias.clear();
    }
    
    public String toString(){
        String info = "Persona: \n";
        info += "\tnombre: " + nombre + "\n";
        info += "\tedad: " + edad + "\n";
        info += "\tsexo: " + sexo + "\n";
        //Solo mostrar organos que no funcionan
        info += "\tobservaciones sobre su salud: \n";
        boolean todoFuncionaBien = true;
        for(int i = 0; i < organos.length; i++){
            //esta comparacion: organos[i] != null evita que aparezca el error nulo
            if(organos[i] != null && organos[i].funcionaBien == false){
                todoFuncionaBien = false;
                info += "\t(*)el organo " + organos[i].nombre + " no funciona bien \n";    
            }
        }
        if(todoFuncionaBien){
            info += "\t(*)Está super bien de salud :) \n";
        }
        
        info += "\tPertenencias de la persona: \n";
        //mostrar las pertenencias
        for(int i = 0; i < pertenencias.size(); i++){
            info += "\t(*)" + pertenencias.get(i) + "\n";
        }
        return info;
    }
}
