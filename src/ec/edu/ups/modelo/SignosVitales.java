package ec.edu.ups.modelo;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Transient;
@Entity
public class SignosVitales implements Serializable{
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int cod;
	@ManyToOne
	@JoinColumn(name ="codCita", nullable = false)
	private CitaMedica cita;
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "signoVit")
	private List<SignoVitalDet> signoVitalDet;
	private double presion;
	private double frecuenciaC;
	private double frecuenciaR;
	private double temperatura;
	private double saturacion;
	@Transient
	private boolean editable;
	

	public int getCod() {
		return cod;
	}

	public void setCod(int cod) {
		this.cod = cod;
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

	public CitaMedica getCita() {
		return cita;
	}

	public void setCita(CitaMedica cita) {
		this.cita = cita;
	}

	public List<SignoVitalDet> getSignoVitalDet() {
		return signoVitalDet;
	}

	public void setSignoVitalDet(List<SignoVitalDet> signoVitalDet) {
		this.signoVitalDet = signoVitalDet;
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
		result = prime * result + cod;
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
		SignosVitales other = (SignosVitales) obj;
		if (cod != other.cod)
			return false;
		return true;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("SignosVitales [cod=").append(cod).append(", presion=").append(presion).append(", frecuenciaC=")
				.append(frecuenciaC).append(", frecuenciaR=").append(frecuenciaR).append(", temperatura=")
				.append(temperatura).append(", saturacion=").append(saturacion).append(", cita=").append(cita)
				.append(", signoVitalDet=").append(signoVitalDet).append(", editable=").append(editable).append("]");
		return builder.toString();
	}
	
	
}
