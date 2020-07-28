package ec.edu.ups.modelo;

import javax.persistence.Transient;
import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;

/**
 * Entity implementation class for Entity: Rol
 *
 */

//@NamedQuery(name = "getClienteRegistro", query = "Select d FROM Cliente d WHERE d.cedula =:cedula")


@Entity
public class Persona implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	private String cedula;
	private String direccion;
	private String nombre;
	private String apellido;
	@Column(name = "CORREO", unique = true)
	private String correo;
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "persona")
	private List<CitaMedica> citas;
	
	@Transient
	private boolean editable;

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

	

	public boolean isEditable() {
		return editable;
	}

	public void setEditable(boolean editable) {
		this.editable = editable;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cedula == null) ? 0 : cedula.hashCode());
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
		Persona other = (Persona) obj;
		if (cedula == null) {
			if (other.cedula != null)
				return false;
		} else if (!cedula.equals(other.cedula))
			return false;
		return true;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Persona [cedula=").append(cedula).append(", direccion=").append(direccion).append(", nombre=")
				.append(nombre).append(", apellido=").append(apellido).append(", correo=").append(correo).append("]");
		return builder.toString();
	}

	

}
