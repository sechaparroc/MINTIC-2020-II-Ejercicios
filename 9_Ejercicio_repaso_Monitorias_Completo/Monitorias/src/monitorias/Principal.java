package monitorias;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
    
    /*
        En la clase Principal realizaremos las asociaciones entre nuestros objetos.
        Diagrama de clases: https://drive.google.com/file/d/1kxnc3oPq3xL2oBx33_dmH8IeGxz0XNFA/view?usp=sharing
        PDTA: Cuando estén revisando los errores imprimiendo la información de las variables, no se les olvide borrar dichos mensajes
    */
    public static void main(String[] args) {
        //Para crear una monitoria necesito un monitor y unos temas
        //1ro Crear al monitor
        Monitor monitor = new Monitor("Fulanito", 30, true); 
        //2do Crear una lista de Temas
        ArrayList<Tema> temas = new ArrayList<Tema>();
        temas.add(new Tema("Herencia", "Lo que se hereda no se hurta"));        
        temas.add(new Tema("Polimorfismo", "Aunque la mona se vista se seda mona se queda"));        
        temas.add(new Tema("Composicion", "Relacion que es necesaria para la clase que tiene la composicion"));        
        
        Scanner scanner = new Scanner( System.in, "ISO-8859-1" );
        //nuestra funcion
        Monitoria monitoria = new Monitoria(monitor, temas);
        
        
        boolean salir = false;
        while(salir == false){
            System.out.println("Ingrese el comando: ");
            //1 Se pide la entrada
            String info = scanner.nextLine(); //"1-ana-28-false-algo"
            //2 Se hace un split                    0     1     2      3        4 
            String[] comando = info.split("-"); //["1", "ana", "28", "false", "algo"]
            if(comando[0].equals("3")){
                salir = true;
            } else if (comando[0].equals("1")){
                //1 Crear estudiante --> String Nombre, int edad, boolean binario, String frase
                // 1-nombre-edad-true/false-frase
                //agregarEstudiante(comando[1]...comando[i])
                String nombre = comando[1];
                int edad = Integer.parseInt(comando[2]);
                boolean esBinario = Boolean.parseBoolean(comando[3]);
                String frase = comando[4];
                Estudiante estudiante = new Estudiante(nombre,edad,esBinario,frase);
                monitoria.registrarEstudiante(estudiante);
            } else if (comando[0].equals("2")){
                //2 Crear Vendedor ---> String Nombre, int edad, boolean binario 
                //2-nombre-edad-true/false
                String nombre = comando[1];
                int edad = Integer.parseInt(comando[2]);
                boolean esBinario = Boolean.parseBoolean(comando[3]);
                Vendedor vendedor = new Vendedor(nombre, edad, esBinario);
                //Estudiante estudiante = new Estudiante(nombre,edad,esBinario,frase);
                monitoria.agregarVendedor(vendedor);
            }
        }

        //Datos para Probar:
        //1-José Manuel-5-true-Saludos!
        //2-Uriel-50-false
        //2-Doña María-65-true
        //1-Ana-29-true-Algo!
        
        //3ro Creo un estudiante de ejemplo
        //Estudiante estudiante = new Estudiante("José Manuel", 5, true, "Saludos!");
        //4to Creo un vendedor
        //Vendedor vendedor = new Vendedor("Uriel", 50, false);
        //Vendedor vendedora = new Vendedor("Doña María", 65, true);
        //vendedora.agregarProducto("chicha");
        //vendedora.agregarProducto("Maiz pira");
        //monitoria.registrarEstudiante(estudiante);
        //monitoria.agregarVendedor(vendedor);
        //monitoria.agregarVendedor(vendedora);
        monitoria.realizarMonitoria();
    }
}
