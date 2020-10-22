import java.util.Scanner;

class Main {
    public static String[] agregarEstudiantesForma1(Scanner scanner){
        System.out.print("Cuantos estudiantes: ");        
        int n = Integer.parseInt(scanner.nextLine()); //lei la cantidad
        String[] nombres = new String[n];
        int i = 0; 
        while(i < n){
            System.out.print("nombre: ");
            nombres[i] = scanner.nextLine();
            i++;
        }
        return nombres;
    }
    
    public static String[] agregarEstudiantesForma2(Scanner scanner){
        System.out.println("Ingrese a sus estudiantes separado por espacios: ");
        String nombresEnCadena = scanner.nextLine();
        String[] nombresEnArreglo = nombresEnCadena.split(" ");
        return nombresEnArreglo;
    }
    
    public static double[] agregarNotasForma1(Scanner scanner, int cantidad){
        double[] notas = new double[cantidad]; // 3 [0] [1] [2]
        for(int i = 0; i < cantidad; i++){
            System.out.print("Ingrese la nota del estudiante " + (i+1) + ": "); 
            notas[i] = Double.parseDouble(scanner.nextLine());
        }
        return notas;
    }
    
    
    //1.0 2.3 4.8 3.9
    public static double[] agregarNotasForma2(Scanner scanner, int cantidad){
        double[] notas = new double[cantidad];
        String datosUnidos = scanner.nextLine();                  // "3.0 2.5 5 1.8 4"
        String[] datosArregloCaracteres = datosUnidos.split(" "); // ["3.0" , "2.5" , "5", "1.8", "4"]
        for(int i = 0; i < cantidad; i++){
            notas[i] =  Double.parseDouble(datosArregloCaracteres[i]);
        }
        return notas;
    }
    
    public static void mostrarNotas(String[] nombres, double[] notas){
        int cantidad = notas.length;
        System.out.println("Reporte de notas");
        for(int i = 0; i < cantidad; i++){
            //i representa la posicion de la persona 
            System.out.println(nombres[i] + " " + notas[i]);
        }        
    }
    
    // 'I' 'D' 'A' 'S' 'E' ---- > 1 2 3 4 5 
    //[I , A , D , S , I , E, .... ]
    //                     *
    public static double[] convertirLetrasANumeros(char[] notasLetras){
        double[] notas = new double[notasLetras.length];    
        for(int i = 0; i < notas.length; i++){ //i posicion de notasLetras como de notas
            char notaActual = notasLetras[i]; // A
            switch (notaActual) { //
                case 'E':{
                    notas[i] = 5;     
                    break;
                } 
                case 'S':{
                    notas[i] = 4;     
                    break;
                } 
                case 'A':{
                    notas[i] = 3;     
                    break;
                } 
                case 'D':{
                    notas[i] = 2;     
                    break;
                } 
                case 'I':{
                    notas[i] = 1;     
                    break;
                } 
                default:{
                    notas[i] = -1;
                }
            }
            //Esto es lo mismo con condicionales if
            /*
            if(notaActual == 'E'){
                notas[i] = 5;     
            } else if(notaActual == 'S'){
                notas[i] = 4;     
            } else if(notaActual == 'A'){
                notas[i] = 3;     
            } else if(notaActual == 'D'){
                notas[i] = 2;     
            } else if(notaActual == 'I'){
                notas[i] = 1;     
            } else{
                notas[i] = -1;
            }
            */
        }
        return notas;
    }
    
    
    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in );
        //String[] nombres = agregarEstudiantesForma1(sc);
        //System.out.println(Arrays.toString(nombres));
        
        String[] nombres = agregarEstudiantesForma2(sc);
        double[] notas = agregarNotasForma2(sc, nombres.length);
        mostrarNotas(nombres, notas);
        
        //double[] notas = agregarNotasForma1(sc, nombres.length);
        //recibir como letras
        //char[] notasLetras = agregarNotasLetras(sc, nombres.length);
        //System.out.println(Arrays.toString(notasLetras));
        //transformamos
        //double[] notasEnteros = convertirLetrasANumeros(notasLetras);
        //System.out.println(Arrays.toString(notasEnteros));
        //mostrarNotas(nombres, notasEnteros);
    }
}