package vectorpersonas;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Vector;
public class VectorPersonas {
static final int N=3;
public static void main(String[] args) throws Exception {
Vector personas =new Vector();
int i=0;
Persona p;     
for(i=0; i<N;i++){             
p=lecturadatos();
personas.addElement(p);
}
System.out.println("Los datos ingresados son: ");
for(i=0; i<N;i++){
p=(Persona)personas.elementAt(i);
p.mostrar();
}
int e; 
BufferedReader entrada;
entrada=new BufferedReader(new InputStreamReader(System.in));
System.out.println(" ingrese la edad de la persona que desee buscar");
e= Integer.parseInt(entrada.readLine());
System.out.println("la persona buscada es");
int bandera =0;
for(i=0; i<N; i++){
p=(Persona)personas.elementAt(i);
if(e==p.getEdad()){
p.mostrar();
bandera=1;
}}
if(bandera==0){
System.out.println("el dato no existe");
}     
}
//+++++++++++++++++++++++++++   
//FUNCION LECTURA DATOS
public static Persona lecturadatos( )throws Exception{
Persona p;
BufferedReader entrada= new BufferedReader (new InputStreamReader(System.in));
String aux_nombre, aux_cedula;
int aux_edad;
System.out.println("Ingrese nombre: ");
aux_nombre=entrada.readLine();
System.out.println("Ingrese cedula: ");
aux_cedula=entrada.readLine();
System.out.println("Ingrese edad: ");
aux_edad=Integer.parseInt(entrada.readLine());
p= new Persona (aux_nombre, aux_cedula, aux_edad);
return (p);            
}}

