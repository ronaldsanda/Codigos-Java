package analisisalgoritmos;
import java.util.Scanner;
public class AnalisisAlgoritmos {

public static void main(String[] args) {
//EJERCICIO # 1//        
//  CICLO BASICO FOR //
int n=10; int i;
for(i=0; i<n; i++){
System.out.println(" " +i);
}
System.out.println("final:      "+i);
}}
// EJERCICIO #2//
//CICLO FOR CON DECREMENTO//
int n=10; int i;
for(i=n; i>0; i--){
System.out.println(" " +i);
}
System.out.println("final:      "+i);
}}
// Ejercicio #3//
//CICLO FOR CON INCREMENTOS DE 2 //
int n=10; int i;
for(i=0; i<n; i+=2){
System.out.println(" " +i);
}
System.out.println("final:      "+i); 
}}
//EJERCICIO # 4//
//  CICLO FOR DE INCREMENTO HASTA n/2 //
int n=10; int i;
for(i=0; i<n/2; i++){
System.out.println(" " +i);
}
System.out.println("final:      "+i); 
}}
// EJERCCIO #5
//CICLO FOR BASICO DE INCREMENTO DE 2 EN 2
int n=10; int i;
for(i=0; i<n/2; i+=2){
System.out.println(" " +i);
}
System.out.println("final:      "+i); 
}}
//EJERCICIO #6//
// CICLO FOR BASICO//
int n=10; int i;
for(i=n/2; i<n; i++){
System.out.println(" " +i);
}
System.out.println("final:      "+i); 
}}
// EJERCICIO # 7
// CICLO FOR ANIDADO//
int c=0;
int n=10; int i;
for(i=0; i<n; i++){
for (int k=0;k<n;k++){
c++;
System.out.println(" " +c);
}
}
}
}
//EJERCICIO #8
//CICLO WHILE BASICO//
int i=1; int n=10;
while(i<n){
System.out.println(" "+i);
i=i*2;
}}}
Scanner sc= new Scanner(System.in);
System.out.println("ingrese numero:");
int n = sc.nextInt();
System.out.println("El factorial de:"+ n +" es: "+factorial(n));
}
Public static int factorial(int n){
int tem =1;
for(int i=1; i<=n; i++){
tem*=i;
}
return tem;
}}
Scanner sc= new Scanner(System.in);   
System.out.print("cuantos terminos desea:");
int n= sc.nextInt();
int a=0, b=1, c=0, s=1;
System.out.print(a +"\t"+ b);
for(int i=2; i<=n; i++){
c= a+b;
System.out.print("\t"+c +"\t");
s+=c;
a=b;
b=c;
}}}