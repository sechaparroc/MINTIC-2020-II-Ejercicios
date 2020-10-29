package monitorias;

public class Estudiante extends Persona{
    
    public String fraseTipica;
    
    public Estudiante(String Nombre, int edad, boolean binario, String frase) {
        super(Nombre, edad, binario);
        this.fraseTipica = frase;
    }
    
    
    public void preguntar(Tema tema){
        System.out.println("\t" + this.nombre + " No entendi " + tema.nombre + " me repites? ");
    }
    
    public void exigirAsistencia(Monitor monitor){
        /*
        El monitor solo toma asistencia cuando el estudiante 
        se lo exige y si no ha tomado asistencia con anterioridad
        */
        //monitor asistencia
        if(monitor.siTomoAsistencia == false){
            monitor.tomarAsistencia();
        }
    }
}
