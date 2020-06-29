package vocales;
import java.util.Scanner;
public class Vocales {

   
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
String p;
System.out.println("PROGRAMA QUE CALCULA EL NUMERO DE VOCALES EN UNA PALABRA");
System.out.println("ingrese una palabra");
p= sc.nextLine();
System.out.println("numero de vocal:"+Caracter(p) );
}
//++++++++++++++++++++++++++++++++++++++++++++++++
// FUNCION PARA COMPARAR LOS CARACTERES INGRESADOS
//++++++++++++++++++++++++++++++++++++++++++++++++
public static int Caracter(String p1){
int c=0;
for(int i=0; i< p1.length(); i++){
if (p1.charAt(i)=='a'||p1.charAt(i)=='e' ||p1.charAt(i)=='i'||p1.charAt(i)=='o'
||p1.charAt(i)=='u'||p1.charAt(i)=='A'||p1.charAt(i)=='E' ||p1.charAt(i)=='I' 
||p1.charAt(i)=='O'||p1.charAt(i)=='U'){
c++;   
}}
return c;
}} 

     
    
    

