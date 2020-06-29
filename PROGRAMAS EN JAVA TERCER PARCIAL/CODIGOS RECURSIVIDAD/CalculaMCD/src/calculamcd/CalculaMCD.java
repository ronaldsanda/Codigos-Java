package calculamcd;

import java.util.Scanner;

public class CalculaMCD {

public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("ingrese el numero del 1er valor");
int m = sc.nextInt();
System.out.println("ingrese el numero del 2do valor");
int n = sc.nextInt();
System.out.println("El maximo comun divisor es:" + mcd(n,m));
}
//++++++++++++++++++++++++
//FUNCION CALCULAR MCD
static int mcd(int m, int n) {
if (n <= m && m % n == 0) { 
return n;
} else if (m < n) {
return mcd(n, m);
} else {
return mcd(n, m % n);
}
}
}
