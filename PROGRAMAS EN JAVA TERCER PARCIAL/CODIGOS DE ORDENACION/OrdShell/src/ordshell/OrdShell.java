package ordshell;
import java.io.*;
public class OrdShell {
public static void main(String[] args)throws IOException {
    int [] a= new int [10];
    int N;
    System.out.println("PROGRAMA QUE ORDENA LOS DATOS DE UN VECTOR POR SHELL");
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
    ordenacionShell(a,N);
    System.out.println("El vector ordenado es:");
    impresiondatos(a,N);}
    //++++++++++++++++++++++++++++
    //FUNCIÓN DE LECTURA DE DATOS
public static void lecturadatos(int [] aa,int NN)throws IOException{
    int i,j=0;
    BufferedReader dato;
    dato=new BufferedReader(new InputStreamReader(System.in));
    for(i=0; i<NN; i++){
    System.out.println("Ingrese el elemento de la posicion:"+j);
    j++;
    aa[i]= Integer.parseInt(dato.readLine());
    }}
    //++++++++++++++++++++++++++++
    //FUNCION DE IMPRESION DE DATOS
public static void impresiondatos(int []aa,int NN){
    int i;
    for(i=0; i<NN; i++){
    System.out.print(" "+aa[i]);}
    System.out.println(); }
    //+++++++++++++++++++++++
    //FUNCION DE NTERCAMBIAR
public static void intercambiar(int [] a, int i, int j) {
    int aux=a[i];
    a[i]= a[j];
    a[j]=aux;}
    //++++++++++++++++++++++++++++++++++++++++++
    //FUNCION PARA ORDENAR EL VECTOR POR SHELL
public static void ordenacionShell(int a[], int NN){
    int intervalo, i, j, k; 
    intervalo = NN/ 2; 
    while (intervalo > 0){
    for (i = intervalo; i < NN; i++){
    j = i - intervalo;
    while (j >= 0){
    k = j + intervalo;
    if (a[j] <= a[k]){
    j = -1;
    }
    else{
    intercambiar(a, j, j+1);
    j -= intervalo;
    }}}
    intervalo = intervalo / 2;
    }}}





