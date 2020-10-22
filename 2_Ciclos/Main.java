import java.util.Scanner;

class Main {
    public static String validarRespuesta(Scanner scanner){
        String respuesta;
        do{
            System.out.print("Quiere seguir (Si/No)");
            respuesta = scanner.nextLine();
        } while(!respuesta.toLowerCase().equals("si") && !respuesta.toLowerCase().equals("no"));
        //retorno
        return respuesta;
    }
    
    public static double calcularPromedioWhile(Scanner sc, int cantidadNotas){
        //contadora - inicializacion
        int contadora = 0;
        double acumuladora = 0;
        
        while(contadora < cantidadNotas){
            //Que voy a hacer
            //pido notas
            double nota;
            System.out.print("Nota: ");
            nota = Double.parseDouble(sc.nextLine());
            //acumularla
            acumuladora = acumuladora + nota;
            //actualizacion
            contadora++;//contadora += 1; contadora = contadora + 1;
        }
        //retorno  
        return acumuladora / cantidadNotas; 
    }
    
    public static double calcularPromedioFor(Scanner sc, int cantidadNotas){
        //contadora - inicializacion
        double acumuladora = 0;
        for(int contadora = 0; contadora < cantidadNotas; contadora++){
            double nota;
            System.out.print("Nota: ");
            nota = Double.parseDouble(sc.nextLine());
            //acumularla
            acumuladora = acumuladora + nota;
        }
        //retorno  
        return acumuladora / cantidadNotas; 
    }    
    
    public static double calcularMinimaNota(Scanner sc, int cantidadNotas){
        double masPequenio = 9999;
        //iniciar       condicion       actualizacion
        for(int i = 0; i < cantidadNotas; i++){
            //instrucciones a repetir
            double nota;
            System.out.print("Nota: ");
            nota = Double.parseDouble(sc.nextLine());
            if (nota < masPequenio){
                masPequenio = nota;
            }        
        }
        return masPequenio;
    }
    
    
    public static void estudiantesForma1(Scanner scanner){
        System.out.print("Cuantos estudiantes?");
        int cuantos = Integer.parseInt(scanner.nextLine());
        System.out.println("Cuantas notas: ");
        int cantidadNotas = Integer.parseInt(scanner.nextLine());
        int i = 0;
        while(i < cuantos){
            double definitiva = calcularPromedioWhile(scanner, cantidadNotas);
            System.out.println("Definitiva: " + definitiva);
            i++;
        }
    }
    
    public static void estudiantesForma2(Scanner scanner){
        System.out.println("Cuantas notas: ");
        int cantidadNotas = Integer.parseInt(scanner.nextLine());
        boolean salir = false;
        do{
            double definitiva = calcularMinimaNota(scanner, cantidadNotas);
            System.out.println("Definitiva: " + definitiva);
            //actualizacion
            System.out.println("Que otro estudiante?: (Si/No)");
            //toLowerCase()
            String respuesta = validarRespuesta(scanner);
            
            if("no".equals(respuesta.toLowerCase())){
                salir = true;
            }
        } while(salir == false);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        estudiantesForma1(scanner);
        estudiantesForma2(scanner);
    }
}