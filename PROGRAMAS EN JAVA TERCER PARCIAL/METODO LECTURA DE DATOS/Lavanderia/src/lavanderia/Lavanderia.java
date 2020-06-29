package lavanderia;
import java.io.*;
public class Lavanderia {
public static void main(String[] args)throws IOException {
int NDias;
System.out.println("PROGRAMA QUE ALMACENA LA CANTIDAD DE PRENDAS LAVADAS DEL MES");
BufferedReader entrada;
entrada=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Ingrese el numero de dias que desee almacenar");
do{
NDias= Integer.parseInt(entrada.readLine());
}
while(NDias<1||NDias>=31);
int [] Registro= new int[NDias];
lecturadatos(Registro,NDias);
System.out.println(" El vector original las cantidades de las prendas lavadas es:");
impresiondatos(Registro,NDias);
ordIntercambio(Registro,NDias);
System.out.println("El vector ordenado de las cantidades de las prendas lavadas es:");
impresiondatos(Registro,NDias);
MayorMenor(Registro,NDias);
System.out.println("El suma total de las prendas lavadas es:");
promedio(Registro, NDias);}
//+++++++++++++++++++++++++
// FUNCION LECTURA DE DATOS
public static void lecturadatos(int[] Registro1, int NNDias)throws IOException{
int i;
BufferedReader dato;
dato=new BufferedReader(new InputStreamReader(System.in));
System.out.println("ATENCION!!La lavada de pendas maxima por dia es: 500 prendas");
for(i=0; i<NNDias; i++){
System.out.println("Ingrese la cantidad de prenndas lavadas por dia:");
Registro1[i]= Integer.parseInt(dato.readLine());
if(Registro1[i]<1||Registro1[i]>500){
System.out.println("Es una cantidad exagerada de lavanderia");
i--;}}}
//++++++++++++++++++++++++
// FUNCION IMPRESION DATOS
public static void impresiondatos(int []Registro1,int NNDias){
int i;
for(i=0; i<NNDias; i++){
System.out.print(" "+Registro1[i]);
}
System.out.println();}
//+++++++++++++++++++++++++++++++++++++++++++++++
// FUNCION PARA INTERCAMBIAR LOS DATOS DEL VECTOR
public static void intercambiar(int []Registro1, int ii, int jj){
int aux=Registro1[ii];
Registro1[ii]= Registro1[jj];
Registro1[jj]=aux;}
//++++++++++++++++++++++++++++++++++++++++
// FUNCION DE ORDENAMIENTO POR INTERCAMBIO
public static void ordIntercambio(int [] Registro1, int NNDias){
int i,j;
for(i=0; i<NNDias-1; i++){
for(j=i+1; j<NNDias; j++){
if(Registro1[i]> Registro1[j]){
intercambiar(Registro1,i,j);
}}}}
//+++++++++++++++++++++++++++++++++
// FUNCION PARA VERIFICAR LOS DATOS
public static void MayorMenor(int [] Registro1, int NNDias){
System.out.println("La cantidad minima de prendas lavadas es: "+Registro1[0]);
System.out.println("La cantidad maxima de prendas lavadas es:"+Registro1[NNDias-1]);}
//+++++++++++++++++++++++++++++++++
// FUNCION PARA CALCULAR EL PROMEDIO
public static void promedio(int [] Registro1, int NNDias){
int aux=0;
for(int i=0;i<NNDias;i++){
aux=Registro1[i]+aux;}
int promedio;
promedio=aux/NNDias;
System.out.println(aux);
System.out.println("el promedio de las prendas lavadas es:");
System.out.println(promedio);}}