package ec.edu.ups.controlador;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.faces.annotation.FacesConfig;
import javax.inject.Named;

import ec.edu.ups.ejb.SignoVitalPriFacade;
import ec.edu.ups.modelo.CitaMedica;
import ec.edu.ups.modelo.SignosVitales;
@FacesConfig(version = FacesConfig.Version.JSF_2_3)

public class SignoVitalesPrin implements Serializable {

	private static final long serialVersionUID = 1L;

	@EJB
	private SignoVitalPriFacade ejbSignosVitales;
	private List<SignosVitales> signosVitalesPrin;
	private double presion;
	private double frecuenciaC;
	private double frecuenciaR;
	private double temperatura;
	private double saturacion;
	
	
	
	public SignoVitalesPrin() {
		// TODO Auto-generated constructor stub
	}

	@PostConstruct
	public void init() {
		
	}

	public List<SignosVitales> getSignosVitalesPrin() {
		return signosVitalesPrin;
	}

	public void setSignosVitalesPrin(List<SignosVitales> signosVitalesPrin) {
		this.signosVitalesPrin = signosVitalesPrin;
	}

	public double getPresion() {
		return presion;
	}

	public void setPresion(double presion) {
		this.presion = presion;
	}

	public double getFrecuenciaC() {
		return frecuenciaC;
	}

	public void setFrecuenciaC(double frecuenciaC) {
		this.frecuenciaC = frecuenciaC;
	}

	public double getFrecuenciaR() {
		return frecuenciaR;
	}

	public void setFrecuenciaR(double frecuenciaR) {
		this.frecuenciaR = frecuenciaR;
	}

	public double getTemperatura() {
		return temperatura;
	}

	public void setTemperatura(double temperatura) {
		this.temperatura = temperatura;
	}

	public double getSaturacion() {
		return saturacion;
	}

	public void setSaturacion(double saturacion) {
		this.saturacion = saturacion;
	}
	
	
	

	
}
