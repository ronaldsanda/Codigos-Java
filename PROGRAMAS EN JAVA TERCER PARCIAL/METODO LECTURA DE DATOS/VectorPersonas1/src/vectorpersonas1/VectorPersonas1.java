package vectorpersonas1;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Vector;
public class VectorPersonas1 {
public static void main(String[] args)throws Exception {
Vector vp= new Vector();
int N;
BufferedReader entrada;
entrada= new BufferedReader(new InputStreamReader(System.in));
do{
System.out.println("Ingrese la dimension del vector");
N=Integer.parseInt(entrada.readLine());
}while((N<0)||(N>10));
lectura(vp,N);
System.out.println("LOS DATOS INGRESADOS SON");
impresion(vp,N);
ordIntercambioE(vp,N);
System.out.println("DATOS ORDENADOS POR EDAD");
impresion(vp,N);
ordIntercambioN(vp,N);
System.out.println("DATOS ORDENADOS POR NOMBRE");
impresion(vp,N);
}    
//++++++++++++++++++++++++
//FUNCION LECTURA DATOS
public static void lectura(Vector vpp,int NN )throws Exception{
Persona p;
int i;
BufferedReader entrada;
entrada=new BufferedReader (new InputStreamReader(System.in));
String aux_nombre, aux_cedula;
int aux_edad;
int j=1;
for(i=0;i<NN; i++){
System.out.println("ingrese los datos de la persona:" +j );
j++;
System.out.println("Ingrese nombre: ");
aux_nombre=entrada.readLine();
System.out.println("Ingrese cedula: ");
aux_cedula=entrada.readLine();
System.out.println("Ingrese edad: ");
aux_edad=Integer.parseInt(entrada.readLine());
p= new Persona (aux_nombre, aux_cedula, aux_edad);
vpp.addElement(p);
}}
//++++++++++++++++++++++++++++++++++++++++++++++
// FUNCION PARA IMPRIMIR LOS DATOS DEL VECTOR
public static void impresion(Vector vpp, int NN)throws Exception{
Persona p;
int i;
for(i=0;i<NN;i++){
p=(Persona)vpp.elementAt(i);
p.mostrar();        
}}
//++++++++++++++++++++++++++++++++++++++++++++++
//FUNCION PARA INTERCAMBIAR LOS DATOS DEL VECTOR
public static void intercambiar(Vector vpp, int ii, int jj){
Persona p,q;
p=(Persona)vpp.elementAt(ii);
q=(Persona)vpp.elementAt(jj);
vpp.removeElementAt(ii);
vpp.insertElementAt(q,ii);
vpp.removeElementAt(jj);
vpp.insertElementAt(p,jj);
}
//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
//FUNCION PARA ORDENAR LOS DATOS CON EL METODO DEL INTERCAMBIO
public static void ordIntercambioE(Vector vpp, int NN){
int i,j;
Persona p,q;
for(i=0; i<NN-1;i++){
for(j=i+1; j<NN; j++){
p=(Persona)vpp.elementAt(i);
q=(Persona)vpp.elementAt(j);
if(p.getEdad()>q.getEdad()){
intercambiar(vpp,i,j);
}}}}
//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
//FUNCION PARA ORDENAR LOS DATOS CON EL METODO DEL INTERCAMBIO
public static void ordIntercambioN(Vector vpp, int NN){
int i,j;
Persona p,q;
String np, nq;
for(i=0;i<NN;i++){
for(j=i+1; j<NN; j++){
p=(Persona)vpp.elementAt(i);
q=(Persona)vpp.elementAt(j);
np=p.getNombre();
nq=q.getNombre();
if(np.charAt(0)>nq.charAt(0)){
intercambiar(vpp,i,j);
}}}}}
    
    
    

