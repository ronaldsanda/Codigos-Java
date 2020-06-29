package SumaNRecursividad;
import java.util.Scanner;
public class  Suma {
    
public static void main(String[] args) {
Scanner sc= new Scanner(System.in);
System.out.println("PROGRAMA QUE CALCULA LA SUMA DE NUMEROS NATURALES POR RECURSIVIDAD ");
System.out.println("ingrese el numero que desee calcular");
int n= sc.nextInt();
System.out.println("EL resultado de la suma es: "+sumaNenteros(n));
}
//+++++++++++++++++++++++++++++++
// LA FUNCION QUE CALCULA LA SUMA 
public static int sumaNenteros (int n) {
if (n == 1){ 
return 1;
}
else{
return n + sumaNenteros(n - 1);
}
}
}






