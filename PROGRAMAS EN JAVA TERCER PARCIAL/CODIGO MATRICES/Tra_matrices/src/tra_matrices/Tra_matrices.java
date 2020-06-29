package tra_matrices;

import java.util.Scanner;
public class Tra_matrices {
public static void main(String[] args) {
        
Scanner teclado= new Scanner(System.in);
int filas, columnas;
do{
System.out.println("NUMERO DE FILAS PARA LA MATRIZ");
filas=teclado.nextInt();
}while(filas>5||filas<2);
do{
System.out.println("NUMERO DE COLUMNAS PARA LA MATRIZ");
columnas=teclado.nextInt();
}while(columnas>5||columnas<2);
matriz om= new matriz(filas, columnas);
om.lectura();
om.visualizar();
System.out.println("La suma de los elementos de la matriz es:"+om.sumaEM());   
System.out.println("La elpromedio de los elementos de la matriz es:"+om.promedioEM());
om.sumaF();
om.sumaC();
om.Convertirv();
om.impresiondatos();
om.Convertirm();
om.mostrar();
om.Buscar();
}
}