package profesconclase;

public class Estudiante {
    public String nombre;
    double porcentajeDeAsistencia;
    double porcentajeDeParticipacion;
    boolean buenComportamiento;
    Nota notaDefinitiva;
    
    public Estudiante(String nom, boolean buenComport){
        this.nombre = nom;
        this.buenComportamiento = buenComport;
    }

    public boolean esDedicado(){
        return porcentajeDeAsistencia >= 0.8 && porcentajeDeParticipacion >= 0.5;
    }
    
    public String toString(){
        String estudianteTexto = " " + nombre + " es dedicado: " + esDedicado();
        estudianteTexto += " nota: " + notaDefinitiva;
        return estudianteTexto;
    }
    
}
