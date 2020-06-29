/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package registro;

/**
 *
 * @author USER
 */
public class Alumno {
        String nombre;
                
        String apellido;

	String matricula;

	String paralelo;

	String ciclo;

	

	public void setNombre(String n){

	nombre=n;

	}

	public String getNombre(){

	return nombre;

	}
        public void setApellido(String ap){

	apellido =ap;

	}

	public String getApellido(){

	return apellido;

	}

	public void setMatricula(String m){

	matricula=m;

	}

	public String getMatricula(){

	return matricula;

	}

	public void setParalelo(String p){

	paralelo=p;

	}

	public String getParalelo(){

	return paralelo;

	}

	public void setCiclo(String c){

	ciclo=c;

	}

	public String getCiclo(){
        return ciclo;
        }
}
