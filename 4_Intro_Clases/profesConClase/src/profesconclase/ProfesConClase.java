/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package profesconclase;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class ProfesConClase {

    static public void calificarEstudiante(Scanner scanner, Estudiante estudiante){
        //El profesor esta generando los informes
        //el profesor le va a colocar una nota al estudiante1
        System.out.println("Cual es el porcentaje de asistencia de " + estudiante.nombre + "? ");
        estudiante.porcentajeDeAsistencia = Double.parseDouble(scanner.nextLine());
        System.out.println("Cual es el porcentaje de participacion de " + estudiante.nombre + "? ");
        estudiante.porcentajeDeParticipacion = Double.parseDouble(scanner.nextLine());
        //ya podemos saber si es dedicado
        boolean esDedicado = estudiante.esDedicado();
        //Pidamosle al profesor la nota
        System.out.println("Cual fue la nota de " + estudiante.nombre + "?");
        double nota = Double.parseDouble(scanner.nextLine());
        if(esDedicado){
            nota += 0.5;
        }
        if(nota > 5.0){
            nota = 5.0;
        }
        Nota notaDefinitiva = new Nota(nota);
        estudiante.notaDefinitiva = notaDefinitiva;
        System.out.println("Estudiante " + estudiante);
    }
    

    
    
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner( System.in );
        Estudiante estudiante1 = new Estudiante("Pepe", true);
        Estudiante estudiante2 = new Estudiante("Juana", false);
        Estudiante estudiante3 = new Estudiante("Ana", true);
        
        //... despues de mucho tiempo
        //El profe lo califica que falta por hacer --- dejar los estudiantes en un arreglo
        calificarEstudiante(scanner, estudiante1);
        calificarEstudiante(scanner, estudiante2);
        calificarEstudiante(scanner, estudiante3);
        
        //primera prueba
        /* 
        Nota notaPepe = new Nota(3.0);
        Nota notaJuana = new Nota(5.0);
        Nota notaAna = new Nota(2.9);
        
        System.out.println("nota pepe: " + notaPepe.valorNumerico + ", " + notaPepe.valorLetras + ", " + notaPepe.valorBooleano);
        System.out.println("nota juana: " + notaJuana);
        System.out.println("nota ana: " + notaAna);
        */
    }
    
}
