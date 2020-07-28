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
import ec.edu.ups.modelo.SignoVitalDet;

@Stateless
public class SignoVitalDetFacade extends AbstractFacade<SignoVitalDet> {

	@PersistenceContext(unitName = "ZhindonHugoExamenFinal")
	private EntityManager em;

	public SignoVitalDetFacade() {
		super(SignoVitalDet.class);
	}

	@Override
	protected EntityManager getEntityManager() {
		return em;
	}

	
	
	
	
	
	
	
	
}