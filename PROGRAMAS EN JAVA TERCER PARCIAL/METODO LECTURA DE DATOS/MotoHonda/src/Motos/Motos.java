package Motos;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Vector;

public class Motos {
    public static void main(String[] args)throws Exception {
    Vector Motores = new Vector();//crear vector
    int N;
    BufferedReader entrada;
    entrada= new BufferedReader(new InputStreamReader(System.in));
    do{
    System.out.println("Ingrese la dimension del vector");
    N=Integer.parseInt(entrada.readLine());
    }while((N<0)||(N>10));
    lecturadatos(Motores,N);
    System.out.println("LOS DATOS INGRESADOS SON");
    impresion(Motores,N);
    ordIntercambioA(Motores,N);
    System.out.println("DATOS ORDENADOS POR ANIO");
    impresion(Motores,N);
    ordIntercambioM(Motores,N);
    System.out.println("DATOS ORDENADOS POR MARCA");
    impresion(Motores,N);
    }  
    //++++++++++++++++++++++++
    //FUNCION LECTURA DATOS
    public static void lecturadatos(Vector Motores1,int NN )throws Exception{
    DatosMoto h;
    int i;
    BufferedReader entrada;
    entrada=new BufferedReader (new InputStreamReader(System.in));
    String aux_marca, aux_modelo;
    int aux_anio;
    int j=1;
    for(i=0;i<NN; i++){
    System.out.println("ingrese los datos de la moto:" +j );
    j++;
    System.out.println("Ingrese la marca: ");
    aux_marca=entrada.readLine();
    System.out.println("Ingrese modelo: ");
    aux_modelo=entrada.readLine();
    System.out.println("Ingrese el anio: ");
    aux_anio=Integer.parseInt(entrada.readLine());
    h= new DatosMoto (aux_marca, aux_modelo, aux_anio);
    Motores1.addElement(h);
    }}
    //+++++++++++++++++++++++++++++++++++++++++++++++++++++++++
    // FUNCION PARA IMPRIMIR LOS DATOS DEL VECTOR
    public static void impresion(Vector Motores1, int NN)throws Exception{
    DatosMoto h;
    int i;
    for(i=0;i<NN;i++){
    h=(DatosMoto)Motores1.elementAt(i);
    h.mostrar();
    }}
    //++++++++++++++++++++++++++++++++++++++++++++++
    //FUNCION PARA INTERCAMBIAR LOS DATOS DEL VECTOR
    public static void intercambiar(Vector Motores1, int ii, int jj){
    DatosMoto h,y;
    h=(DatosMoto)Motores1.elementAt(ii);
    y=(DatosMoto)Motores1.elementAt(jj);
    Motores1.removeElementAt(ii);
    Motores1.insertElementAt(y,ii);
    Motores1.removeElementAt(jj);
    Motores1.insertElementAt(h,jj);
    }
    //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
    //FUNCION PARA ORDENAR LOS DATOS CON EL METODO DEL INTERCAMBIO
    public static void ordIntercambioA(Vector Motores1, int NN){
    int i,j;
    DatosMoto h,y;
    for(i=0; i<NN-1;i++){
    for(j=i+1; j<NN; j++){
    h=(DatosMoto)Motores1.elementAt(i);
    y=(DatosMoto)Motores1.elementAt(j);
    if(h.getAnio()>y.getAnio()){
    intercambiar(Motores1,i,j);
    }}}}
    //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
    //FUNCION PARA ORDENAR LOS DATOS CON EL METODO DEL INTERCAMBIO
    public static void ordIntercambioM(Vector Motores1, int NN){
    int i,j;
    DatosMoto h,y;
    String h1,y1;
    for(i=0;i<NN;i++){
    for(j=i+1; j<NN; j++){
    h=(DatosMoto)Motores1.elementAt(i);
    y=(DatosMoto)Motores1.elementAt(j);
    h1=h.getMarca();
    y1=y.getMarca();
    if(h1.charAt(0)>y1.charAt(0)){
    intercambiar(Motores1,i,j);
    }}}}}
    
    

