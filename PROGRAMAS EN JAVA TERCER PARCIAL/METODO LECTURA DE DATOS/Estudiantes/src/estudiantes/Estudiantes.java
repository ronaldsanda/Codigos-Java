package estudiantes;
import java.io.*;
public class Estudiantes {
public static void main(String[] args)throws IOException {
int NEstudent;
System.out.println("PROGRAMA QUE ALMACENA LOS DATOS DE LAS EDADES DE LOS ESTUDIANTES");
BufferedReader entrada;
entrada=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Ingrese el numero total de los alumnos:");
do{
NEstudent= Integer.parseInt(entrada.readLine());
}
while(NEstudent<1||NEstudent>30);
int [] Grado= new int[NEstudent];
lecturadatos(Grado,NEstudent);
System.out.println("El vector original de las edades es:");
impresiondatos(Grado,NEstudent);
ordIntercambio(Grado,NEstudent);
System.out.println("El vector ordenado de las edades es:");
impresiondatos(Grado,NEstudent);
MayorMenor(Grado,NEstudent);
System.out.println("El suma de las edades es:");
promedio(Grado, NEstudent);}
//+++++++++++++++++++++++++
// FUNCION LECTURA DE DATOS
public static void lecturadatos(int[] Grado1,int NNEstudent)throws IOException{
int i;
BufferedReader dato;
dato=new BufferedReader(new InputStreamReader(System.in));
System.out.println("ATENCION!!La edad ingresada debe ser mayor que 4 y menor que 13");
for(i=0; i<NNEstudent; i++){
System.out.println("Ingrese la edad del estudiante:");
Grado1[i]= Integer.parseInt(dato.readLine());
if(Grado1[i]<5||Grado1[i]>12){
System.out.println("Edad incorrecta");
i--;
}}}
//++++++++++++++++++++++++
// FUNCION IMPRESION DATOS
public static void impresiondatos(int []Grado1,int NNEstudent){
int i;
for(i=0; i<NNEstudent; i++){
System.out.print(" "+Grado1[i]);
}
System.out.println();
}
//+++++++++++++++++++++++++++++++++++++++++++++++
// FUNCION PARA INTERCAMBIAR LOS DATOS DEL VECTOR
public static void intercambiar(int []Grado1, int ii, int jj){
int aux=Grado1[ii];
Grado1[ii]= Grado1[jj];
Grado1[jj]=aux;
}
//++++++++++++++++++++++++++++++++++++++++
// FUNCION DE ORDENAMIENTO POR INTERCAMBIO
public static void ordIntercambio(int [] Grado1, int NNEstudent){
int i,j;
for(i=0; i<NNEstudent-1; i++){
for(j=i+1; j<NNEstudent; j++){
if(Grado1[i]> Grado1[j]){
intercambiar(Grado1,i,j);
}}}}
//+++++++++++++++++++++++++++++++++
// FUNCION PARA VERIFICAR LOS DATOS
public static void MayorMenor(int [] Grado1, int NNEstudent){
System.out.println("La edad menor es: "+Grado1[0]+" La edad mayor es: "+Grado1[NNEstudent-1]);}
//+++++++++++++++++++++++++++++++++
// FUNCION PARA CALCULAR EL PROMEDIO
public static void promedio(int [] Grado1, int NNEstudent){
int aux=0;
for(int i=0;i<NNEstudent;i++){
aux=Grado1[i]+aux;}
int promedio;
promedio=aux/NNEstudent;
System.out.println(aux);
System.out.println("el promedio de las edades es:");
System.out.println(promedio);
}}
    
