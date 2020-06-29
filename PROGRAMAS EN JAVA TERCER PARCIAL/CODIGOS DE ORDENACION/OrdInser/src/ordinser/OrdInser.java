package ordinser;
import java.io.*;
public class OrdInser {
    public static void main(String[] args)throws IOException {
    int [] a= new int[10];
    int N;
    System.out.println("PROGRAMA QUE ORDENA LOS DATOS DE UN VECTOR POR INSERCION");
    BufferedReader entrada;
    entrada=new BufferedReader(new InputStreamReader(System.in));
    do{
    System.out.println("Ingrese la dimencion del vector");
    N= Integer.parseInt(entrada.readLine());
    }
    while((N<0)||(N>10));
    lecturadatos(a,N);
    System.out.println("El vector original es:");
    impresiondatos(a,N);
    ordInsercion(a,N);
    System.out.println("El vector ordenado es:");
    impresiondatos(a,N);
    }
    //++++++++++++++++++++++++++++++++++
    //FUNCIÓN DE LECTURA DE DATOS
    //++++++++++++++++++++++++++++++++++
    public static void lecturadatos(int[] aa,int NN)throws IOException{
    int i;
    BufferedReader dato;
    dato=new BufferedReader(new InputStreamReader(System.in));
    int j=0;
    for(i=0; i<NN; i++){
    System.out.println("Ingrese el elemento de la posicion: " +j);
    j++;
    aa[i]= Integer.parseInt(dato.readLine());
    }
    }
    //+++++++++++++++++++++++++++++++++++++++++++++
    //FUNCION DE IMPRESION DE DATOS
    //+++++++++++++++++++++++++++++++++++++++++++++
public static void impresiondatos(int []aa,int NN){
    int i;
    for(i=0; i<NN; i++){
    System.out.print(" "+aa[i]);
    }
    System.out.println();
    }
    //++++++++++++++++++++++++++++++++++++++++++++++
    //ALGORITMO PARA ORDENAR EL VECTOR POR INSERCION
    //++++++++++++++++++++++++++++++++++++++++++++++
public static void ordInsercion(int []aa,int NN){
   int aux,i,j;
   for(i=1; i<NN;i++){
   j=i;
   aux=aa[i];
   while(j>0&&aux<aa[j-1]){
   aa[j]=aa[j-1];
   j--;
   }
   aa[j]=aux;
   }    
   }
   }