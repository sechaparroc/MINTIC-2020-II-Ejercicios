package heladeria;

public class Heladeria {
    /*
    Estas fueron unas ideas que quedaron en el aire... 
    (pueden tratar de completarlas)
    //Arreglo de clientes
    Cliente[] clientes ----> Arreglo , random

    Flujo del programa
    toma el pedido, paga y le dan las vueltas 
    //0 hay un cajero --> constructor 
    //1 cajero saludar -->  metodo (comportamiento del objeto cajero)
    //2 cajero mostrar helado -->  metodo (comportamiento del objeto cajero)
    //3 cliente escoge -->  metodo (comportamiento del objeto cliente)
    //4 cajero pide el dinero  --> metodo (comportamiento del objeto cajero)
    //5 cliente paga ---> metodo (comportamiento del objeto cliente)
    //6 cajero da las vueltas - factura --> metodo (comportamiento del objeto cajero) 
    //7 cajero entrega el helado
    */
    public static int generarNumeroAleatorio(int limite){ //Entre 0 y limite - 1
        return (int) (Math.random()*limite);
    }
    
    public static void imprimirHelados(Helado[] helados){
        int i = 0;
        while(i < helados.length){
            System.out.println(i + " " + helados[i]);
            i++;
        }
    }
    
    public static Helado[] generarHelados(){
        Helado[] helados = new Helado[7];
        helados[0] = new Helado("Chocolate", 1000);
        helados[1] = new Helado("Vainilla", 2000);
        helados[2] = new Helado("Mora", 3000);
        helados[3] = new Helado("Fresa", 5000);
        helados[4] = new Helado("Mango", 5000);
        helados[5] = new Helado("Ron con pasas", 5000);
        helados[6] = new Helado("Guanabana", 5000);
        return helados;
    }
    
    public static void main(String[] args) {
        //Generamos los helados
        Helado[] helados = generarHelados();
        imprimirHelados(helados);
        //0 hay un cliente --> crear un cliente --> constructor new Cliente(material) 
        int aleatorio = generarNumeroAleatorio(helados.length);
        String saborAleatorio = helados[aleatorio].sabor;
        Cliente cliente1 = new Cliente("Pepe", saborAleatorio);
        System.out.println("cliente 1 " + cliente1);
        System.out.println(cliente1.escoger(helados));
    }
}
