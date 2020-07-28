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
import ec.edu.ups.modelo.SignosVitales;

@Stateless
public class SignoVitalPriFacade extends AbstractFacade<SignosVitales> {

	@PersistenceContext(unitName = "ZhindonHugoExamenFinal")
	private EntityManager em;

	public SignoVitalPriFacade() {
		super(SignosVitales.class);
	}

	@Override
	protected EntityManager getEntityManager() {
		return em;
	}

	
	
	
	
	
	
	
	
}