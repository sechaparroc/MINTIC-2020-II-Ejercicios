import java.util.Scanner;

class Main {
  public static double promedio(double a, double b, double c){
    System.out.print("Promedio: ");
    return (a+b+c)/3;
  }
  public static double mayor(double a, double b, double c){
    System.out.print("El número mayor es: "); //a = 5 b = 5 c = 3
    if(a>=b && a>=c){
        return a;
    }
    else if (b>=c && b>=a){
        return b;
    }
    else { 
        return c;
    }
  }
  public static double menor(double a, double b, double c){
    System.out.print("El número menor es: ");
    if(a<=b && a<=c){
        return a;
    }
    else if (b<=c && b<=a){
        return b;
    }
    else {
        return c;
    }
  }
  
  public static double calcularDefinitiva(String tipo, double n1, double n2, double n3){
      double nota = 0;
      if(tipo.equals("cuchilla")){
          System.out.println("entra al caso 1");
          nota = menor(n1, n2, n3);
      } else if(tipo.equals("justo")){
          System.out.println("entra al caso 2");
          nota = promedio(n1, n2, n3);
      } else {
          System.out.println("entra al caso 3");          
          nota = mayor(n1,n2,n3);              
      }
      return nota;
  }
  
  public static void procesarEstudiante(Scanner sc){
    System.out.print("numero 1: ");
    double n1 = Double.parseDouble(sc.nextLine());
    System.out.print("numero 2: ");
    double n2 = Double.parseDouble(sc.nextLine());
    System.out.print("numero 3: ");
    double n3 = Double.parseDouble(sc.nextLine());
    System.out.print("tipo de profe: ");
    String tipo_profe = sc.nextLine();
    double definitiva = calcularDefinitiva(tipo_profe, n1, n2, n3);
    System.out.println("la definitiva es: " + definitiva);
  }
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in); //Crear escaner para leer
    procesarEstudiante(sc); 
    procesarEstudiante(sc); 
    procesarEstudiante(sc); 
    
  }
}