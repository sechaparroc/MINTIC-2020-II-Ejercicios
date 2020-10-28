package mainformas;

import java.util.Scanner;

public class MainFormas {

    public static void main(String[] args) {
        Scanner scanner = new Scanner( System.in );
        Figura[] figuras = new Figura[10];
        //Las 5 primeras figuras con circulos
        for(int i = 0; i < 5; i++){
            figuras[i] = new Circulo("Pepe" + i,"Perez" + i,"PePe " + i, i);
        }
        //Las 5 siguientes son cuadrados
        for(int i = 5; i < figuras.length; i++){
            figuras[i] = new Cuadrado("Fulanita" + i,"Perez" + i,"Fulana" + i, i);
        }
        
        //Como son Figuras podemos preguntar por su area y su perímetro
        for(int i = 0; i < figuras.length; i++){
            System.out.println(figuras[i]);
            //La informacion del area y el perimetro la pudimos dejar en el metodo toString...
            System.out.println("    Area: " + figuras[i].area());
            System.out.println("    Perimetro: " + figuras[i].perimetro());
        }        
    }
}
