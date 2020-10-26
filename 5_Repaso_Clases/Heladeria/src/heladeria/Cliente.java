/*
    Cliente
        escoger(lista de helados)
        pagar(helado)

*/
package heladeria;

public class Cliente {
    public String nombre;
    public String saborFavorito;
    
    public Cliente(String nombre, String sabor){
        this.nombre = nombre;
        this.saborFavorito = sabor;
    }
    
    public Helado escoger(Helado[] helados){
        //el cliente escoge el helado que mas le gusta
        Helado miHelado = null;
        for(int i = 0; i < helados.length; i++){
            Helado actual = helados[i];
            if(actual.sabor.equals(saborFavorito)){
                miHelado = actual;
            }
        }
        return miHelado;
    }
    
    public double pagar(Helado helado){
        return helado.costo;
    }
    
    public String toString(){
        String info = "Nombre: " + this.nombre + " Favorito: " + this.saborFavorito;
        return info;
    }
}
