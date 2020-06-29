
package serie.fibonacci;

import java.util.Scanner;


public class SerieFibonacci {

    
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);   
System.out.print("cuantos terminos desea:");
int n= sc.nextInt();

int a=0, b=1, c=0, s=1;
for(int i=2; i<=n; i++){
c= a+b;

s+=c;
a=b;
b=c;
    }
System.out.println(" " +c +"\t");
    }

 }   

