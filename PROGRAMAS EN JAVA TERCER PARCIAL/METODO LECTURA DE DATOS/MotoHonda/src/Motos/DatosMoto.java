package Motos;

public class DatosMoto {
    protected String marca;
    protected String modelo;
    protected int anio;
    public DatosMoto(){};//constructor//constructor
    public DatosMoto(String m, String md, int a){
    marca=m;
    modelo=md;
    anio=a;
    }
    public void mostrar(){
    System.out.println("Marca:    "+marca+"   Modelo:   "+modelo+"   Anio:   "+anio);
    } 
    public int getAnio(){
    return anio;
    }
    public String getMarca(){
    return marca; 
    }
}
