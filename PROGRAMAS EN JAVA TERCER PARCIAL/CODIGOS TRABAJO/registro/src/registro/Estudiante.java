/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package registro;
import java.util.Scanner;

import java.util.ArrayList;

/**
 *
 * @author USER
 */
public class Estudiante {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

	ArrayList<Alumno> a= new ArrayList<Alumno>();


	Registro re=new Registro();

	

	int op=1;

	while(op!=0){

		System.out.println("Menu de datos de los estudiantes ");

		System.out.println("1. Ingresar");
  
		System.out.println("2. Buscar");

		System.out.println("3. Borrar");
                
                System.out.println("4. Presentar");

		System.out.println("0. Salir");

		op=sc.nextInt();

		switch(op){

   		   case 1:

			a.add(re.IngresarAlumno());

			break;

		   case 2:

			re.buscarAlumno(a);

			break;

		   case 3:

			re.borrarAlumno(a);

			break;

		  case 4:
                        re.presentaAlumno(a);
			

			break;
               }

	
        }

   	
       
    }
}
    
    

