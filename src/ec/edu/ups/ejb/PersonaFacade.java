package ec.edu.ups.ejb;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.Selection;

import ec.edu.ups.modelo.Persona;

@Stateless
public class PersonaFacade extends AbstractFacade<Persona> {

	@PersistenceContext(unitName = "ZhindonHugoExamenFinal")
	private EntityManager em;

	public PersonaFacade() {
		super(Persona.class);
	}

	@Override
	protected EntityManager getEntityManager() {
		return em;
	}

	
	
	
	
	
	
	
	
}