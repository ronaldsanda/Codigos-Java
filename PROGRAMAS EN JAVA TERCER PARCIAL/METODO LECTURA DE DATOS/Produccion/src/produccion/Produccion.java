package produccion;
import java.io.*;
public class Produccion {
public static void main(String[] args)throws IOException {        
int NDias;
System.out.println("PROGRAMA QUE ALMACENA LA CANTIDAD DE PANES PRODUCIDOS");
BufferedReader entrada;
entrada=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Ingrese el numero de dias que desee almacenar la produccion");
do{
NDias= Integer.parseInt(entrada.readLine());
}
while(NDias<1||NDias>30);
int [] Archivo= new int[NDias];
lecturadatos(Archivo,NDias);
System.out.println(" El vector original la cantidad de los panes producidos es:");
impresiondatos(Archivo,NDias);
ordIntercambio(Archivo,NDias);
System.out.println("El vector ordenado de la cantidad de los panes producidos es:");
impresiondatos(Archivo,NDias);
MayorMenor(Archivo,NDias);  
System.out.println("El suma total de la produccion es:");
promedio(Archivo, NDias);}
//+++++++++++++++++++++++++
// FUNCION LECTURA DE DATOS
public static void lecturadatos(int[] Archivo1, int NNDias)throws IOException{
int i;
BufferedReader dato;
dato=new BufferedReader(new InputStreamReader(System.in));
System.out.println("ATENCION!!La produccion maxima de panes por dia es: 500 panes");
for(i=0; i<NNDias; i++){
System.out.println("Ingrese la cantidad de panes producidos por dia:");
Archivo1[i]= Integer.parseInt(dato.readLine());
if(Archivo1[i]<1||Archivo1[i]>500){
System.out.println("Es una cantidad exagerada de producion");
i--;}}}
//++++++++++++++++++++++++
// FUNCION IMPRESION DATOS
public static void impresiondatos(int []Archivo1,int NNDias){
int i;
for(i=0; i<NNDias; i++){
System.out.print(" "+Archivo1[i]);
}
System.out.println();}
//+++++++++++++++++++++++++++++++++++++++++++++++
// FUNCION PARA INTERCAMBIAR LOS DATOS DEL VECTOR    
public static void intercambiar(int []Archivo1, int ii, int jj){
int aux=Archivo1[ii];
Archivo1[ii]= Archivo1[jj];
Archivo1[jj]=aux;}
//++++++++++++++++++++++++++++++++++++++++
// FUNCION DE ORDENAMIENTO POR INTERCAMBIO
public static void ordIntercambio(int [] Archivo1, int NNDias){
int i,j;
for(i=0; i<NNDias-1; i++){
for(j=i+1; j<NNDias; j++){
if(Archivo1[i]> Archivo1[j]){
intercambiar(Archivo1,i,j);
}}}}
//+++++++++++++++++++++++++++++++++
// FUNCION PARA VERIFICAR LOS DATOS
public static void MayorMenor(int [] Archivo1, int NNDias){
System.out.println("La produccion minima es: "+Archivo1[0]+" La produccion maxima es: "+Archivo1[NNDias-1]);}
//+++++++++++++++++++++++++++++++++
// FUNCION PARA CALCULAR EL PROMEDIO    
public static void promedio(int [] Archivo1, int NNDias){
int aux=0;
for(int i=0;i<NNDias;i++){
aux=Archivo1[i]+aux;}
int promedio;
promedio=aux/NNDias;
System.out.println(aux);
System.out.println("el promedio de las cantidades producidas por dia es:");
System.out.println(promedio);}}
    

