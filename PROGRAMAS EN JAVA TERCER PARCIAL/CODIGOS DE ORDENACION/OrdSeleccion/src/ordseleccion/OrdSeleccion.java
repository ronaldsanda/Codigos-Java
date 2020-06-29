package ordseleccion;
import java.util.*;
import java.io.*;
public class OrdSeleccion{
public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
   System.out.println("PROGRAMA QUE ORDENA LOS DATOS DE UN VECTOR POR SELECCION");
   System.out.println("Ingrese el tamaño del vector");
   int c= sc.nextInt();
   int [] n= new int[c];
   int j=0;
   for(int i=0; i<c; i++){
   System.out.println("Ingrese el elemento de la posicion:" +j);
   j++;
   n[i]=sc.nextInt();}
   ordSeleccion(n);
   System.out.println();}
//++++++++++++++++++++++++++++++++++++++++++++
//FUNCION QUE ORDENA LOS DATOS POR SELECCION
public static void ordSeleccion (int []a){
    int indiceMenor, i, j, n;
    n = a.length;
    for (i = 0; i < n-1; i++){
    indiceMenor = i;
    for (j = i+1; j < n; j++)
    if (a[j] < a[indiceMenor]) 
    indiceMenor = j;
    intercambiar(a, i, indiceMenor);}
    System.out.println(" Elementos ordenados son:");
    for( i = 0 ; i < a.length; i++){
    System.out.print(" "+a[i]);
    }}
//++++++++++++++++++++++++++
//FUNCION INTERCAMBIAR
public static void intercambiar(int[] a, int i, int j){
    int aux=a[i];
    a[i]= a[j];
    a[j]=aux;
    }}
