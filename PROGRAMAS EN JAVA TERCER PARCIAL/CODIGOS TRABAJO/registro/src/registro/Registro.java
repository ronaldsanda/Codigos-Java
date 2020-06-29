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
public class Registro {
public Alumno IngresarAlumno(){

		Scanner sc=new Scanner(System.in);

		Alumno al=new Alumno();
                
                System.out.print("Ingrese el nombre:");

		al.setNombre(sc.next());
		
                System.out.print("Ingrese el apellido:");

		al.setApellido(sc.next());

		System.out.print("Ingrese el numero de Matricula: ");

		al.setMatricula(sc.next());

		System.out.print("Ingrese el paralelo: ");

		al.setParalelo(sc.next());

		System.out.print("Ingrese el ciclo: ");

		al.setCiclo(sc.next());

		return al;


	}
	
                public void presentaAlumno(ArrayList<Alumno> a){


		System.out.println("Nombre    Apellido   Matricula 	Paralelo        Ciclo");
		for(int i=0; i<a.size();i++)
			System.out.println(a.get(i).getNombre()+"       "+a.get(i).getApellido()+"	 "+a.get(i).getMatricula()+"	     "+a.get(i).getParalelo()+"	        "+a.get(i).getCiclo());
			
	}
	public void buscarAlumno(ArrayList<Alumno> a){
		Scanner sc=new Scanner(System.in);
                
		System.out.println("Ingrese el numero de matricula: ");
		String ce=sc.next();
                System.out.println("Nombre    Apellido   Matricula 	Paralelo        Ciclo");
		for(int i=0;i<a.size();i++)
			if(a.get(i).getMatricula().compareTo(ce)==0)
				System.out.println(a.get(i).getNombre()+"	"+a.get(i).getApellido()+"        "+a.get(i).getMatricula()+"	     "+a.get(i).getParalelo()+"	         "+a.get(i).getCiclo());
		
	}
	public void borrarAlumno(ArrayList<Alumno> a){
		Scanner sc=new Scanner(System.in);
		System.out.println("Ingrese el numero de matricula:");
		String ce=sc.next();
		for(int i=0;i<a.size();i++)
			if(a.get(i).getMatricula().compareTo(ce)==0)
				a.remove(i);
                
	      System.out.println(" Eliminaste los datos del alumno");
	}
	
        }
