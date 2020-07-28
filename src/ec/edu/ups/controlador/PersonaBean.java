package ec.edu.ups.controlador;

import java.io.Serializable;
import java.util.Enumeration;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.faces.annotation.FacesConfig;
import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.ValidatorException;
import javax.inject.Named;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


import javax.faces.component.UIInput;

import ec.edu.ups.ejb.PersonaFacade;

import ec.edu.ups.modelo.Persona;


@FacesConfig(version = FacesConfig.Version.JSF_2_3)


public class PersonaBean implements Serializable {

	private static final long serialVersionUID = 1L;

	@EJB
	private PersonaFacade ejbPersonaFacade;
	private List<Persona> list, lista2, list3;
	private String cedula;
	private String direccion;
	private String nombre;
	private String apellido;
	private String correo;

	public PersonaBean() {
		
	}
	
	@PostConstruct
	public void init() {
		
	}

	public List<Persona> getList() {
		return list;
	}

	public void setList(List<Persona> list) {
		this.list = list;
	}

	public List<Persona> getLista2() {
		return lista2;
	}

	public void setLista2(List<Persona> lista2) {
		this.lista2 = lista2;
	}

	public List<Persona> getList3() {
		return list3;
	}

	public void setList3(List<Persona> list3) {
		this.list3 = list3;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}
	
	


}
