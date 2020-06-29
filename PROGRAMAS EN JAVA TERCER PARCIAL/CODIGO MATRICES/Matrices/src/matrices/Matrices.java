
package matrices;
import java.io.*;
public class Matrices {
public static void main(String[] args) throws Exception{
int v[] []=new int [2] [2];
leer(v);
visualizar(v);
System.out.println("La suma de los elementos es: " + sumarEM(v));
System.out.println("El promedio de la matriz es : " + promedioEM(v));
}
//+++++++++++++++++++++++++++++++
//FUNCION PARA INGRESAR LOS DATOS
static void leer(int vv[] []) throws Exception{
int i,j, fila=1;
BufferedReader entrada=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Entrada de datos de la Matriz");
for(i=0;i<vv.length;i++){
System.out.println("FILA: " + fila++);
for(j=0;j<vv[i].length;j++)
vv[i] [j]=Integer.parseInt(entrada.readLine());
}
}
//+++++++++++++++++++++++++++++++
//FUNCION PARA IMPRIMIR LOS DATOS
static void visualizar(int vv[] []) throws Exception{
int i,j;
System.out.println("La Matriz que usted ingreso es: ");
for(i=0;i<vv.length;i++){
for(j=0;j<vv[i].length;j++)
System.out.print(vv[i] [j] + "   ");
System.out.println("");
}
}
//+++++++++++++++++++++++++++++++++
//FUNCION PARA CALCULAR EL PROMEDIO
static int sumarEM(int vv[] []) throws Exception{
int i,j,suma=0;
for(i=0;i<vv.length;i++){
for(j=0;j<vv[i].length;j++)
suma=suma+vv[i] [j];
}
return suma;
}
//+++++++++++++++++++++++++++++++++
//FUNCION PARA CALCULAR EL PROMEDIO
public static float promedioEM(int vv [] []) throws Exception
{
int numelem;
float pro;
numelem=vv.length*vv[0].length;
pro= sumarEM(vv)/numelem;
return pro;
}
    
}
