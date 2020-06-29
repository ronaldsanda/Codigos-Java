package fibonacci;
import java.util.Scanner;
public class Fibonacci {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("PROGRAMA QUE CALCULA UN TERMINO DE LA SERIE DE FIBONACCI");
System.out.println("ingrese el numero que desee calcular");    
int n = sc.nextInt();
System.out.println("EL Termino es:" + fibonacci(n));
}
//+++++++++++++++++++++++++++++++++++++++++++++++++++
//FUNCION QUE DETERMINA EL TERMINO DE SERIE FIBONACCI
public static int fibonacci(int n) { 

if (n == 0 || n == 1) { 
return n;
}
else 
return fibonacci(n - 1) + fibonacci(n - 2);
}
}
