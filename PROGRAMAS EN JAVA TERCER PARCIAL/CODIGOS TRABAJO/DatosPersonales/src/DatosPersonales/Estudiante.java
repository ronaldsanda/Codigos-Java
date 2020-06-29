/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DatosPersonales;
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

	ArrayList<Contacto> c= new ArrayList<Contacto>();


	UsaContacto uc=new UsaContacto();

	

	int op=1;

	while(op!=0){

		System.out.println("Menu de Contactos Personales ");

		System.out.println("1. Ingresar");
  
		System.out.println("2. Buscar");

		System.out.println("3. Borrar");
                
                System.out.println("4. Presentar");

		System.out.println("0. Salir");

		op=sc.nextInt();

		switch(op){

   		   case 1:

			c.add(uc.IngresarContacto());

			break;

		   case 2:

			uc.buscarContacto(c);

			break;

		   case 3:

			uc.borrarContacto(c);

			break;

		  case 4:
                        uc.presentaContactos(c);
			

			break;
               }

	
        }

   	
       
    }
}
    
    

