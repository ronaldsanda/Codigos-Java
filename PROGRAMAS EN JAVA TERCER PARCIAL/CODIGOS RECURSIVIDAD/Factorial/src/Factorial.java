
import java.io.*;

public class Factorial {
public static void main(String[] ar) throws IOException {
int n;
BufferedReader entrada = new BufferedReader(
new InputStreamReader(System.in));
do {
System.out.print("Introduzca número n: ");
n = Integer.parseInt(entrada.readLine());
}while (n < 0);
System.out.println("\n \t" + n + "!= " + f(n)); 
}
//+++++++++++++++++++++++++++++++++
// FUNCION QUE CALCULA EL FACTORIAL
static long f(int n) {
if (n <= 1) {
return 1;
} else {
long resultado = n * f(n - 1);
return resultado;
}
}
}
