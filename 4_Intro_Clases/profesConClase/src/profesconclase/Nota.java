package profesconclase;

public class Nota {
    //Atributos
    public double valorNumerico;
    public char valorLetras; // 'I' 'D' 'A' 'S' 'E' 
    public boolean valorBooleano; //Pasa o no pasa
    //Constructor
    public Nota(double valor){
        this.valorNumerico = valor;
        this.valorLetras = convertirNumericoALetras();
        convertirNumericoABooleano();

    }
    
    //Metodos (comportamientos o acciones)
    public char convertirNumericoALetras(){
        char notaLetras;
        if(valorNumerico < 2){
            notaLetras = 'D';
        } else if(valorNumerico >= 2 && valorNumerico < 3){
            notaLetras = 'I';
        } else if(valorNumerico >= 3 && valorNumerico < 4){
            notaLetras = 'A';
        } else if(valorNumerico >= 4 && valorNumerico < 5){
            notaLetras = 'S';
        } else if(valorNumerico == 5){
            notaLetras = 'E';
        } else {
            notaLetras = '-';
        }
        return notaLetras;
    }
    
    public void convertirNumericoABooleano() {
        this.valorBooleano = valorNumerico >= 3;
    }
    
    public String toString(){
        String notaTexto = valorNumerico + ", " + valorLetras + ", Paso: " + valorBooleano;
        return notaTexto;
    }
}
