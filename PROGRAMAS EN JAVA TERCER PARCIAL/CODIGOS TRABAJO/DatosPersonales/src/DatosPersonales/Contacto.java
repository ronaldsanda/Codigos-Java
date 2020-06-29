/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DatosPersonales;

/**
 *
 * @author USER
 */
public class Contacto {
        String ci;

	String apellidos;

	String nombres;

	String email;

	String telefono;

	public void setCi(String ced){

	ci=ced;

	}

	public String getCi(){

	return ci;

	}

	public void setApellidos(String a){

	apellidos=a;

	}

	public String getApellidos(){

	return apellidos;

	}

	public void setNombres(String n){

	nombres=n;

	}

	public String getNombres(){

	return nombres;

	}

	public void setEmail(String e){

	email=e;

	}

	public String getEmail(){

	return email;

	}

	public void setTelefono(String t){

	telefono=t;

	}
	
public String getTelefono(){

	return telefono;

	}   
}
