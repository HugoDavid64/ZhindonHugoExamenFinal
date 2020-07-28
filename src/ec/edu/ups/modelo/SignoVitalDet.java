package ec.edu.ups.modelo;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Transient;
@Entity
public class SignoVitalDet implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int cod;
	
	@ManyToOne
	@JoinColumn(name = "SignoPrin_id", nullable = false)
	private  SignosVitales signoVit;
	private String tipo;
	private String descrip;
	@Transient
	private boolean editable;

	public int getCod() {
		return cod;
	}

	public void setCod(int cod) {
		this.cod = cod;
	}

	public SignosVitales getSignoVit() {
		return signoVit;
	}

	public void setSignoVit(SignosVitales signoVit) {
		this.signoVit = signoVit;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getDescrip() {
		return descrip;
	}

	public void setDescrip(String descrip) {
		this.descrip = descrip;
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
		SignoVitalDet other = (SignoVitalDet) obj;
		if (cod != other.cod)
			return false;
		return true;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("SignoVitalDet [cod=").append(cod).append(", signoVit=").append(signoVit).append(", tipo=")
				.append(tipo).append(", descrip=").append(descrip).append(", editable=").append(editable).append("]");
		return builder.toString();
	}


	
	
	
	
}
