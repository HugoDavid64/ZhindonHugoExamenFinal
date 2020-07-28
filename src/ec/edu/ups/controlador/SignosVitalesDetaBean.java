package ec.edu.ups.controlador;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.faces.annotation.FacesConfig;
import javax.inject.Named;

import ec.edu.ups.ejb.SignoVitalDetFacade;

@FacesConfig(version = FacesConfig.Version.JSF_2_3)

public class SignosVitalesDetaBean implements Serializable {

	private static final long serialVersionUID = 1L;

	@EJB
	private SignoVitalDetFacade jbSignoVitalDetFacade;
	private List<SignosVitalesDetaBean> detaleSignos;
	private String tipo;
	private String descripcion;
	

	public SignosVitalesDetaBean() {
		// TODO Auto-generated constructor stub
	}

	

	@PostConstruct
	public void init() {
	}



	public List<SignosVitalesDetaBean> getDetaleSignos() {
		return detaleSignos;
	}



	public void setDetaleSignos(List<SignosVitalesDetaBean> detaleSignos) {
		this.detaleSignos = detaleSignos;
	}



	public String getTipo() {
		return tipo;
	}



	public void setTipo(String tipo) {
		this.tipo = tipo;
	}



	public String getDescripcion() {
		return descripcion;
	}



	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	
	
}
