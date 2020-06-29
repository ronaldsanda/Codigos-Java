
package productorecursivo;
import java.util.Scanner;
public class ProductoRecursivo {
public static void main(String[] args) {
int a,b;
Scanner sc= new Scanner(System.in);    
System.out.println("PROGRAMA QUE CALCULA EL PRODUCTO DE DOS NUMEROS POR RECURSIVIDAD");
System.out.println("ingrese el primer numero");
a=sc.nextInt();
System.out.println("Ingrese el segundo numero");
b=sc.nextInt();
System.out.println("el resultado del producto es:" + Producto(a,b));
}
//++++++++++++++++++++++++++++++++++
// FUNCION DE CALCULO DE PRODUCTO
public static int Producto(int a1, int b1){
if(b1==1){
return a1;
}
else
return a1 + Producto(a1,b1-1);
}
}
