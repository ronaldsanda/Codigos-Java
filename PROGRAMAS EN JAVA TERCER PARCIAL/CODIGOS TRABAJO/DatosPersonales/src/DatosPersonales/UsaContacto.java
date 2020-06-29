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
public class UsaContacto {
public Contacto IngresarContacto(){

		Scanner sc=new Scanner(System.in);

		Contacto c1=new Contacto();

		System.out.print("Ingrese la cedula: ");

		c1.setCi(sc.next());

		System.out.print("Ingrese el apellido: ");

		c1.setApellidos(sc.next());

		System.out.print("Ingrese el nombre: ");

		c1.setNombres(sc.next());

		System.out.print("Ingrese el email: ");

		c1.setEmail(sc.next());

		System.out.print("Ingrese el telefono: ");

		c1.setTelefono(sc.next());

		return c1;


	}
	
                public void presentaContactos(ArrayList<Contacto> c){


		System.out.println("Ci     Nombre    Apellido 	 email	  Telefono");
		for(int i=0; i<c.size();i++)
			System.out.println(c.get(i).getCi()+"	"+c.get(i).getNombres()+"	"+c.get(i).getApellidos()+"	"+c.get(i).getEmail()+"	"+c.get(i).getTelefono());
			
	}
	public void buscarContacto(ArrayList<Contacto> c){
		Scanner sc=new Scanner(System.in);
		System.out.println("Ingrese la cedula: ");
		String ce=sc.next();
		for(int i=0;i<c.size();i++)
			if(c.get(i).getCi().compareTo(ce)==0)
				System.out.println(c.get(i).getCi()+"	"+c.get(i).getNombres()+"	"+c.get(i).getApellidos()+"	"+c.get(i).getEmail()+"	"+c.get(i).getTelefono()); 
		
	}
	public void borrarContacto(ArrayList<Contacto>c){
		Scanner sc=new Scanner(System.in);
		System.out.println("Ingrese la cedula: ");
		String ce=sc.next();
		for(int i=0;i<c.size();i++)
			if(c.get(i).getCi().compareTo(ce)==0)
				c.remove(i);
                System.out.println(" El contacto sea ha eliminado ");
		
	}
	
        }
