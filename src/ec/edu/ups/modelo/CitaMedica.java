package ec.edu.ups.modelo;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Transient;
@Entity
public class CitaMedica  implements Serializable{

	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int codCita;
	private String hora;
	private String fecha;
	@ManyToOne
	@JoinColumn(name="persona_ced",nullable = false)
	private Persona persona;
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "cita")
	private List<SignosVitales> signos;
	@Transient
	private boolean editable;
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
	public Persona getPersona() {
		return persona;
	}
	public void setPersona(Persona persona) {
		this.persona = persona;
	}
	
	
	
	public List<SignosVitales> getSignos() {
		return signos;
	}
	public void setSignos(List<SignosVitales> signos) {
		this.signos = signos;
	}
	public boolean isEditable() {
		return editable;
	}
	public void setEditable(boolean editable) {
		this.editable = editable;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + codCita;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CitaMedica other = (CitaMedica) obj;
		if (codCita != other.codCita)
			return false;
		return true;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("CitaMedica [codCita=").append(codCita).append(", hora=").append(hora).append(", fecha=")
				.append(fecha).append(", persona=").append(persona).append(", signos=").append(signos)
				.append(", editable=").append(editable).append("]");
		return builder.toString();
	}

	
	
	
	

	

}
