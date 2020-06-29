package tra_matrices;
import java.io.*;
import java.util.Scanner;
public class matriz {
private int[][] mat;
public matriz(int ff, int cc){
mat= new int[ff][cc];
}
//+++++++++++++++++++++++++
//FUNCION LECTURA DE DATOS
public void lectura(){
Scanner teclado= new Scanner(System.in);
int i,j,fila=0;
System.out.println("INGRESE LOS DATOS DE LA MATRIZ");
for(i=0; i<mat.length; i++){
System.out.println("Fila: "+fila++);
for(j=0; j<mat[i].length;j++){
mat[i][j]=teclado.nextInt();
}}}
//+++++++++++++++++++++++++
//FUNCION VISULIZAR
public void visualizar(){
int i,j;
System.out.println("LA MATRIZ INGRESADA ES: ");
for(i=0;i<mat.length;i++){
for(j=0;j<mat[i].length;j++){
System.out.print(mat[i][j] + "   ");
}
System.out.println();
}}
//++++++++++++++++++++++++++
//FUNCION PARA SUMAR LA MATRIZ
public int sumaEM(){
int i,j,suma=0;
for(i=0;i<mat.length;i++){
for(j=0;j<mat[i].length;j++){
suma=suma+mat[i][j];
}}
return suma;
}
//+++++++++++++++++++++++++++++
//FUNCION PROMEDIO DE LA MATRIZ
public float promedioEM(){
int numelem;
float pro;
numelem = mat.length*mat[0].length;
pro = sumaEM()/numelem;
return pro;
}
//+++++++++++++++++++++++++++++
//FUNCION PARA SUMAR FILAS
public void sumaF(){   
int sumf=0;
for (int i = 0; i <mat.length; i++) {
for (int j = 0; j <mat[i].length; j++) {
if(j==0){
for ( j = 0; j <mat[i].length; j++){
sumf=sumf+mat[i][j];
}       
System.out.print("la suma de la fila: " + i + " es :  " + sumf);
sumf=0;
}
System.out.println();
}}}
//++++++++++++++++++++++++++++++++
//FUNCION PARA SUMAR LAS COLUMNAS
public void sumaC(){
int  sumC=0;
for (int i = 0; i <mat.length; i++) {
for (int j = 0; j <mat[i].length; j++){
if(i==0){
for (int k= 0; k<mat.length; k++){
sumC=sumC+mat[k][j];
}   
System.out.print("la suma de la columna: " + j + " es :  " + sumC);
sumC=0;
}
System.out.println();
}}}
//+++++++++++++++++++++++++++++++++
//FUNCION PARA CONVERTIR A VECTOR
public int[] Convertirv(){
int k=0;
int [] vector=new int [mat.length*mat[0].length];
for(int i=0;i<mat.length;i++){
for(int j=0;j<mat[i].length;j++){
vector[k]= mat[i][j];
k++;
}}
return vector;
}
//+++++++++++++++++++++++++++++++++
//FUNCION PARA ORDENAR EL VECTOR
public int[] ordIntercambio (){
int[] vector=Convertirv();
int i, j;
for (i=0;i<vector.length;i++){
for (j=i+1;j<vector.length;j++){
if (vector[i]>vector[j]){
int aux = vector[i];
vector[i] = vector[j];
vector[j]= aux ; 
}}}
return vector;
}
//+++++++++++++++++++++++++++++++++
//FUNCION PARA IMPRIMIR DATOS
public void impresiondatos(){
int[] vector=ordIntercambio();
int i;
System.out.println("EL VECTOR ORDENADO ES:");
for(i=0; i<vector.length; i++){
System.out.print(" "+vector[i]);
}
System.out.println();
}
//+++++++++++++++++++++++++++++++++
//FUNCION PARA COMVERTIR A MATRIZ
public void Convertirm(){
int[] vector=ordIntercambio();   
int i,j,k=0;
for(i=0;i<mat.length;i++){
for(j=0;j<mat[i].length;j++){
mat[i][j]=vector[k] ;
k++;
}}}
//++++++++++++++++++++++++++++++++++++++++
//FUNCION PARA IMPRIMIR LA MATRIZ ORDENADA
public void mostrar(){
int i,j;
System.out.println("LA MATRIZ ORDENADA ES: ");
for(i=0;i<mat.length;i++){
for(j=0;j<mat[i].length;j++){
System.out.print(mat[i][j] + "   ");
}
System.out.println();
}}
//+++++++++++++++++++++++++++++++++++++++++++
// FUNCION PARA BUSCAR UN ELEMENTO DEL VECTOR
void Buscar(){
Scanner sc=new Scanner(System.in);
System.out.println("INGRESE EL ELEMENTO A BUSCAR");
int clave=sc.nextInt();
int [] vector=new int [mat.length*mat[0].length];
vector=ordIntercambio();  
int r=busquedaBin(clave,vector);
if(r!=-1){
for(int i=0;i<mat.length;i++){
for(int j=0;j<mat[i].length;j++){
if(r==mat[i][j]){
j++;
System.out.println("El Elemento es "+vector[r]+" En la fila "+i+" Y columna "+j);
i++;
}}}
}else{
System.out.println(" NO EXISTE ");
}}
//++++++++++++++++++++++++++++++
//FUNCION PARA BUSQUEDA BINARIA
private int busquedaBin(int clave,int [] vector){
int central, bajo, alto;
int valorCentral;
bajo = 0;
alto = vector.length - 1;
while (bajo <= alto){
central = (bajo + alto)/2; 
valorCentral = vector[central];
if (clave == valorCentral)
return central; 
else if (clave < valorCentral)
alto = central -1; 
else
bajo = central + 1; 
}
return -1; 
}}
