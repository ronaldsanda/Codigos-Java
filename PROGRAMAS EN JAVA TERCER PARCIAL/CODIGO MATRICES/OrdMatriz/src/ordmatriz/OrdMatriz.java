package ordmatriz;
import java.io.*;

public class OrdMatriz {

    
    public static void main(String[] args) throws Exception{
    int v[][]=new int[2][2];
    leer (v);
    visualizar(v);
    System.out.println("La suma de los elementos es: " + sumarEM(v));
    ordIntercambio(v);
    System.out.println("La matriz ordenado es:");
    impresiondatos(v);
    }
//+++++++++++++++++++
//FUNCION LECTURA
static void leer (int vv[][]) throws Exception{
    int i,j, fila=1;
    BufferedReader entrada=new BufferedReader (new InputStreamReader (System.in));
    System.out.println("ENTRADA DE DATOS DE LA MATRIZ");
    for(i=0;i<vv.length;i++){
    System.out.println("FILA:" + fila++);
    for(j=0;j<vv[i].length;j++){
    vv[i][j]=Integer.parseInt(entrada.readLine ());
    }}}
//++++++++++++++++++++++++++++++++++++++++++++++
// FUNCION PARA VISUALIZAR LOS DATOS DE LA MATRIZ   
static void visualizar (int vv[][]) throws Exception{
     int i,j;
     System.out.println("MATRIZ LEIDA....");
     for (i=0;i<vv.length;i++){
     for (j=0;j<vv[i].length;j++){
     System.out.print(vv[i][j] + " ");
     }
     System.out.println(" ");
     }}
//++++++++++++++++++++++++++++++++++++++++++++
//FUNCION DE LA SUMA DE LOS DATOS DE LA MATRIZ
static int sumarEM(int vv[][]) throws Exception{
     int i,j,suma=0;
     for(i=0;i<vv.length;i++) {
     for(j=0;j<vv[i].length;j++){ 
     suma= suma+ vv[i][j];
     }
     }
     return suma;
     }
//++++++++++++++++++++++++++++++++++++
//FUNCION ORDENAMIENTO POR INTERCAMBIO
public static void ordIntercambio (int[][] vv){
    int i, j,x,y;
    
    for (i=0;i<vv.length;i++){
    System.out.println("***valor i: "+i);
    for (j=0;j<vv[i].length;j++){
    System.out.println("******valor j: "+j);
    for (x=0;x<vv.length;x++){
    System.out.println("*********valor x: "+x);
    for (y=0;y<vv[x].length;y++){
    System.out.println("************valor y: "+y);
               
    if (vv[i][j]<vv[x][y]){
    intercambiar(vv,i,j,x,y);
    }}}}}}
//+++++++++++++++++++++++
//FUNCION DE INTERCANBIAR
public static void intercambiar(int[][] vv,int ii, int jj,int xx,int yy){ 
    int aux = vv[ii][jj];
    vv[ii][jj] = vv[xx][yy];
    vv[xx][yy]= aux ;  
    }
//++++++++++++++++++++++++++
//FUNCION IMPRESION DE DATOS
public static void impresiondatos(int [][] vv){
    int i,j;
    for(i=0; i<vv.length; i++){
    for (j=0;j<vv[i].length;j++){
    System.out.print(vv[i][j]+" ");
    }
    System.out.println(" ");
    }}}
    

