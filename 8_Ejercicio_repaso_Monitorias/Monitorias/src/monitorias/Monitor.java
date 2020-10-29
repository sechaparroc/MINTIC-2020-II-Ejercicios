package monitorias;

public class Monitor extends Persona{
    public boolean siTomoAsistencia = false;
    
    public Monitor(String Nombre, int edad, boolean binario) {
        super(Nombre, edad, binario);
    }
    public void explicar(Tema tema){
        System.out.println("EL tema de hoy es " + tema.nombre);
        System.out.println("consiste en " + tema.descripcion);
        System.out.println("blablabla....");
    }
    public void tomarAsistencia(){
        System.out.println("Tome asistencia....");
        siTomoAsistencia = true;
    }
}
