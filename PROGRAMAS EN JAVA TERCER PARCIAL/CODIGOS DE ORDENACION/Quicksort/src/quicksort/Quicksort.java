package quicksort;
import java.io.*;
public class Quicksort {
static int vuelta=1;
public static void main(String[] args)throws Exception {
    int [] a= new int[10];
    int N;
    System.out.println("PROGRAMA QUE ORDENA LOS DATOS DE UN VECTOR POR QUICKSORT");
    BufferedReader entrada;
    entrada=new BufferedReader(new InputStreamReader(System.in));
    do{
    System.out.println("Ingrese la dimension del vector:");
    N=Integer.parseInt(entrada.readLine());
    }while((N<0)||(N>10));
    lecturadatos(a,N);
    System.out.println("El vector original es");
    impresiondatos(a,N);
    ordenacionQuickSort(a,N);
    System.out.println("el vector ordenado es:");
    impresiondatos(a,N);    
    }
    //+++++++++++++++++++++++++
    // FUNCION LECTURA DE DATOS
    public static void lecturadatos(int [] aa, int NN)throws Exception{
    int i;
    BufferedReader dato;
    dato=new BufferedReader(new InputStreamReader(System.in));
    for(i=0; i<NN; i++){
    System.out.println("Ingrese el elemento en la posicion:"+(i+1));
    aa[i]=Integer.parseInt(dato.readLine());
    }}
    //++++++++++++++++++++++++
    // FUNCION IMPRESION DATOS
    public static void impresiondatos(int [] aa, int NN){
    int i;
    for(i=0; i<NN; i++){
    System.out.print(aa[i] +" ");
    }
    System.out.println();
    }
    //+++++++++++++++++++++++++++++++++++++++++++++++
    // FUNCION PARA INTERCAMBIAR LOS DATOS DEL VECTOR
    public static void intercambiar(int [] aa, int ii, int jj){
    int aux= aa[ii];
    aa[ii]=aa[jj];
    aa[jj]=aux;
    }
    public static void ordenacionQuickSort(int [] aa, int NN){
    ordenacionQuickSort(aa,0,NN-1); 
    }
    //++++++++++++++++++++++++++++++++++++++++++
    //FUNCION QUE ORDENA LOS DATOS POR QUICKSORT
    public static void ordenacionQuickSort(int [] aa, int primero,int ultimo){
    int i,j,central,pivote;
    central=(primero + ultimo)/2;
    pivote= aa[central];
    i=primero;
    j=ultimo;
    do{
    //System.out.println("111111111111111111111111111111111111111111111111111111");
    //System.out.println("***********El vector con central: " + central + " pivote: " + pivote + " i: " + i + " y j: " + j + "*******");
    //System.out.println("***********primero: " + primero + " ultimo: " + ultimo + "**********vuelta: " + vuelta);
    //impresiondatos(aa,5);
    while (aa[i]<pivote)i++;
    while (aa[j]>pivote)j--;
    if(i<=j){
    //intercambiar(aa,i,j);
    //System.out.println("222222222222222222222222222222222222222222222222222222222222222222222222");
    //System.out.println("***********El vector con central: " + central + " pivote: " + pivote + " i: " + i + " y j: " + j + "*******");
    //System.out.println("***********primero: " + primero + " ultimo: " + ultimo + "**********vuelta: " + vuelta );
    impresiondatos(aa,5);
    i++;j--;
    }
    }while(i<=j);
    vuelta++;
    if(primero<j)ordenacionQuickSort(aa,primero,j);
    if(i<ultimo)ordenacionQuickSort(aa,i,ultimo);
    }}


