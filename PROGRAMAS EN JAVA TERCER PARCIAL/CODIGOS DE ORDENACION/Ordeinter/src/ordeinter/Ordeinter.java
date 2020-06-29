package ordeinter;
import java.util.*;
import java.io.*;
public class Ordeinter {
public static void main(String[] args) throws IOException{
int [] a= new int[10];
int N;
System.out.println("PROGRAMA QUE ORDENA LOS DATOS DE UN VECTOR");
BufferedReader entrada;
entrada=new BufferedReader(new InputStreamReader(System.in));
    do{
    System.out.println("Ingrese la dimencion del vector:");
    N= Integer.parseInt(entrada.readLine());
    }
    while((N<0)||(N>10));
    lecturadatos(a,N);
    System.out.println("El vector original es:");
    impresiondatos(a,N);
    ordIntercambio(a,N);
    System.out.println("El vector ordenado es:");
    impresiondatos(a,N);
    }
    //++++++++++++++++++++++++++
    //FUNCION LECTURA DE DATOS
    public static void lecturadatos(int[] aa,int NN)throws IOException{
    int i;
    BufferedReader dato;
    dato=new BufferedReader(new InputStreamReader(System.in));
    int j=0;
    for(i=0; i<NN; i++){
    System.out.println("Ingrese el elemento de la posicion:" +j);
    j++;
    aa[i]= Integer.parseInt(dato.readLine());
     }}
    //++++++++++++++++++++++++++
    //FUNCION IMPRESION DE DATOS
    public static void impresiondatos(int []aa,int NN){
    int i;
    for(i=0; i<NN; i++){
    System.out.print(" "+aa[i]);
    }
    System.out.println();
    }
    //++++++++++++++++++++++++++
    //FUNCION INTERCAMBIAR
    public static void intercambiar(int []aa, int ii, int jj){
    int aux=aa[ii];
    aa[ii]= aa[jj];
    aa[jj]=aux;
    }
    //++++++++++++++++++++++++++++++++++++++++++++
    //FUNCION QUE ORDENA LOS DATOS POR INTERCAMBIO
    public static void ordIntercambio(int [] aa, int NN){
    int i,j;
    for(i=0; i<NN-1; i++){
    for(j=i+1; j<NN; j++){
    if(aa[i]> aa[j]){
    intercambiar(aa,i,j);
    }}}}} 







   