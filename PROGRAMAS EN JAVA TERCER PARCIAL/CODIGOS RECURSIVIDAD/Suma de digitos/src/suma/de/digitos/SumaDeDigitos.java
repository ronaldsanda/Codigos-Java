
package suma.de.digitos;

import java.util.Scanner;

public class SumaDeDigitos {
   
public static void main(String[] args) {
Scanner sc= new Scanner(System.in);
System.out.println("PROGRAMA QUE CALCULA LA SUMA DE DIGITOS POR RECURSIVIDAD");
System.out.println("ingrese el numero que desee calcular");
int n= sc.nextInt(); 
System.out.println("La suma de los digitos es:    "+sumaRecursiva(n));
}
//+++++++++++++++++++++++++++++
// FUNCION QUE SUMA LOS NUMEROS
public static int sumaRecursiva(int n1){ 
if (n1 <=9){ 
return n1;
}
else
return sumaRecursiva(n1/10) + n1%10;  
}                                   
}
