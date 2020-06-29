
package fibonaccirecursivo;

import java.util.Scanner;

public class FibonacciRecursivo {

public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("PROGRAMA QUE CALULA LA SERIE FIBONACCI CON RECURSIVIDAD ");
System.out.println("Introduce el número de elementos a mostrar de la serie: ");
int n = sc.nextInt();
sc.close();
System.out.println("la serie es:");
for(int i = 0; i<n+1; i++){
System.out.print(funcionFibonacci(i) + ", ");
}
}
//+++++++++++++++++++++++++++++
// FUNCION QUE CALCULA LA SERIE
private static int funcionFibonacci(int n){
if(n== 0 || n==1){
return n;
}
else
return funcionFibonacci(n-1) + funcionFibonacci(n-2);
} 
}
