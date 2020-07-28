package ec.edu.ups.controlador;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.annotation.FacesConfig;

import ec.edu.ups.ejb.CitaMedicaFacade;
import ec.edu.ups.modelo.CitaMedica;
@FacesConfig(version = FacesConfig.Version.JSF_2_3)
public class CitaMedicaBean implements Serializable {

	private static final long serialVersionUID = 1L;
	@EJB
	private CitaMedicaFacade ejebCitaMedica;
	private List<CitaMedica> listC, listC2;
	private int codCita;
	private String hora;
	private String fecha;
	
	public CitaMedicaBean() {
		// TODO Auto-generated constructor stub
	}
	
	@PostConstruct
	public void init() {
		
	
	}

	public List<CitaMedica> getListC() {
		return listC;
	}

	public void setListC(List<CitaMedica> listC) {
		this.listC = listC;
	}

	public List<CitaMedica> getListC2() {
		return listC2;
	}

	public void setListC2(List<CitaMedica> listC2) {
		this.listC2 = listC2;
	}

	public int getCodCita() {
		return codCita;
	}

	public void setCodCita(int codCita) {
		this.codCita = codCita;
	}

	public String getHora() {
		return hora;
	}

	public void setHora(String hora) {
		this.hora = hora;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	
	
	

}
