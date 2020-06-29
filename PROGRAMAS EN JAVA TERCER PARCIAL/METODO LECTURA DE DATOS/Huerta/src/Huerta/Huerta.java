package Huerta;
/*
EXAMEN DE ESTRUCTURAS DE DATOS
NOMBRE : RONALD SANDA
CARRERA: ING. EN SOFTWARE
CICLO:   TERCERO
*/
import java.util.Scanner;
import java.util.Vector;

public class Huerta {
static int n,op;
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
DatosProductos p=null;
System.out.println("Ingrese la cantidad de siembras: ");
n=sc.nextInt();
Vector datos=new Vector();
do{
menu();
op=sc.nextInt();
switch(op){
case 1:
for(int i=0;i<n;i++){
p=Ingresar();
datos.insertElementAt(p, i);
}
System.out.println("Los productos ingresados son: ");
for(int i=0;i<n;i++){
p=(DatosProductos)datos.elementAt(i);
p.visualizar();
}
break;
case 2:
System.out.println("INGRESAR DATOS DE LAS COSECHAS");
for(int i=0;i<n;i++){
p=(DatosProductos)datos.elementAt(i);
p.visualizar();
System.out.println("Ingresar la fecha de las cosechas: ");
p.setFechaC(sc.next());
System.out.println("Ingrese la cantidad de la produccion en quintales: ");
p.setProduccion(sc.next());
datos.remove(p);
datos.insertElementAt(p, i);
}
for(int i=0;i<n;i++){
p=(DatosProductos)datos.elementAt(i);
p.visualizarCompleto();
}
break;
case 3:
int co,e=0;
String cont;
System.out.println("CANTIDAD DE TERRENO QUE SE UTILIZO PARA SEMBRAR CADA PRODUCTO");
for(int i=0;i<n;i++){
p=(DatosProductos)datos.elementAt(i);
p.visualizarProducto();
}
System.out.println("De que producto desea calcular la cantidad de terreno: ");
String prod=sc.next();
for(int i=0;i<n;i++){
p=(DatosProductos)datos.elementAt(i);
if(prod.equals(p.getProducto())){
cont=p.getTerreno();
co=Integer.parseInt(cont);
e=e+co;
}}
System.out.println("La cantidad de terreno en hectareas de "+prod+" es: "+e);
break;
case 4:
int k=0,con;
String cont1;
System.out.println("PRODUCCION DE CADA PRODUCTO");
for(int i=0;i<n;i++){
p=(DatosProductos)datos.elementAt(i);
p.visualizarProducto();
}
System.out.println("De que producto desea calcular la cantidad de produccion");
String pro=sc.next();
for(int i=0;i<n;i++){
p=(DatosProductos)datos.elementAt(i);
if(pro.equals(p.getProducto())){
cont1=p.getProduccion();
con=Integer.parseInt(cont1);
k=k+con;
}}
System.out.println("La cantidad de produccion de "+pro+" es "+k+" quintales");
break;
case 5:
System.out.println("BUSCAR FECHA DE SIEMBRA Y COSECHA");
e=0;
for(int i=0;i<n;i++){
p=(DatosProductos)datos.elementAt(i);
p.visualizarProducto();
}
System.out.println("De que producto desea saber la fecha de siembra y de cosecha: ");
prod=sc.next();
for(int i=0;i<n;i++){
p=(DatosProductos)datos.elementAt(i);
if(prod.equals(p.getProducto())){
cont=p.getTerreno();
System.out.println("Producto "+prod+" es: "+p.getFechas());
}
}
break;
}
}while(op!=6||op<0);
}
static void menu(){
System.out.println("1. Ingresar los datos de las siembras");
System.out.println("2. Ingresar los datos de las cosechas");
System.out.println("3. Cantidad de terreno que se utilizo para sembrar cada producto");
System.out.println("4. Produccion de cada producto");
System.out.println("5. Buscar fecha de siembra y cosecha");
System.out.println("6. Salir"); 
}
//+++++++++++++++++++++++++++++++++
//FUNCION INGRESAR LOS DATOS DE LOS PRODUCTOS
static DatosProductos Ingresar(){
Scanner sc=new Scanner(System.in);
DatosProductos p;
String prod,fechaSiembra,Terreno;
System.out.println("Ingrese el nombre del producto: ");
prod=sc.next();
System.out.println("Ingrese la fecha de siembra: ");
fechaSiembra=sc.next();
System.out.println("Ingrese la cantidad de terreno en hectareas: ");
Terreno=sc.next();
p=new DatosProductos(prod,fechaSiembra,Terreno);
return p;
}}
