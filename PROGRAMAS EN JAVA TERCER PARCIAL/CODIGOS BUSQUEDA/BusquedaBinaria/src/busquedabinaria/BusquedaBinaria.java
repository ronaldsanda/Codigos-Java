package busquedabinaria;
import java.util.Scanner;
public class BusquedaBinaria {
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("PROGRAMA QUE BUSBA UN NUMERO POR BUSQUEDA BINARIA");
System.out.println("Ingrese la dimencion de los elementos:");
int n=sc.nextInt();
int[] a=new int[n];
Ingreso(a);
System.out.println("El vector inicial es:");
imprimir(a);
System.out.println("El vector ordenado es:");
ordInter(a,n);
imprimir(a);
System.out.println("Ingrese un entero para La busqueda de un elemento:");
int cla=sc.nextInt();
int i=busquedaBin(a,cla);
if(i!=-1){
System.out.println("El resultado es "+a[i]+" En la posicion "+i);
}
else{
System.out.println("El Valor ingresado no existe");
}}
//++++++++++++++++++++++++++++++++++++++++++++++
// FUNCION PARA INGRESAR LOS ELEMENTOS AL VECTOR
static void Ingreso(int[]a){
int i,j=1,n;
Scanner sc=new Scanner(System.in);
for(i=0;i<a.length;i++){
System.out.println("Ingrese el elemento "+j);
a[i]=sc.nextInt();
j++;
}} 
//+++++++++++++++++++++++++++++++++++++++
// FUNCION PARA LA IMPREION DE LOS DATOS
static void imprimir(int[]a){
for(int i=0;i<a.length;i++){
System.out.print(a[i]+" ");
}
System.out.println("");
}
//++++++++++++++++++++++++++++++
// FUNCION DE BUSQUEDA BINARIA
//++++++++++++++++++++++++++++++
public static int busquedaBin(int a[],int clave){
int central, bajo, alto;
int valorCentral;
bajo = 0;
alto = a.length - 1;
while (bajo <= alto){
central = (bajo + alto)/2;
valorCentral = a[central];
if (clave == valorCentral)
return central; 
else if (clave < valorCentral)
alto = central -1; 
else
bajo = central + 1;
}
return -1; 
}
//++++++++++++++++++++++++++++++++++++++++++++++
// FUNCION QUE ORDENA LOS DATOS POR INTERCAMBIO
public static void ordInter(int[] aa,int NN){
int i, j;
for (i=0;i<NN-1;i++){
for (j=i+1;j<NN;j++){
if (aa[i]>aa[j]){
intercambiar(aa,i,j);
}}}}
//++++++++++++++++++++++++
// FUNCION INTERCAMBIAR 
public static void intercambiar(int[] aa,int i, int j){ 
int aux = aa[i];
aa[i] = aa[j];
aa[j]= aux ;  
}
}
