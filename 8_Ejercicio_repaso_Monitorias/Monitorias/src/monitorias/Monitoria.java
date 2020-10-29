package monitorias;

import java.util.ArrayList;

public class Monitoria {
    public ArrayList<Estudiante> estudiantes;
    public Monitor monitor;
    public ArrayList<Tema> temas;
    public ArrayList<Vendedor> vendedores;
    
    public Monitoria(Monitor monitor, ArrayList<Tema> temas){
        this.monitor = monitor;
        this.temas = temas;
    }
    
    public void registrarEstudiante(Estudiante estudiante){
        this.estudiantes.add(estudiante);
    }
    
    public void agregarVendedor(Vendedor vendedor){
        this.vendedores.add(vendedor);    
    }
    
    public void realizarMonitoria(){
        for(int i = 0; i < temas.size(); i++){
            //El monitor explica
            monitor.explicar(temas.get(i));
            //Personas preguntan
            todosPreguntan(temas.get(i));
        }
    }

    
    public void todosPreguntan(Tema tema){
        for(int i = 0; i < estudiantes.size(); i++){
            Estudiante estudiante = estudiantes.get(i);
            estudiante.preguntar(tema);
        }
    }
}
