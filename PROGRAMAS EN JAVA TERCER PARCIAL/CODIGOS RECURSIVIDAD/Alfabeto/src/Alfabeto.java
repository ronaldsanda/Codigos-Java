public class Alfabeto{
    
public static void main(String [] args){
System.out.println();metodoA('Z'); 
}
//++++++++++++++++++++++++++++++++++++++++++++++++++++++
// FUNCION DE COMPARA LOS DATOS EN UN SISTEMA BINARIO
static void metodoA(char c){
if (c > 'A')
metodoB(c); System.out.print(c);
}
static void metodoB(char c){
metodoA(--c);
}
}
