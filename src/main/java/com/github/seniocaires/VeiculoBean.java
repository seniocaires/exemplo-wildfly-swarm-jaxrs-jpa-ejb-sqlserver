package com.github.seniocaires;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

@Stateless
public class VeiculoBean {

	@PersistenceContext(unitName = "persistence-unit-projeto")
	private EntityManager entityManager;

	@SuppressWarnings("unchecked")
	public List<Veiculo> amostra() {
		Query query = entityManager.createQuery("SELECT veiculo FROM Veiculo veiculo");
		query.setMaxResults(100);
		return (List<Veiculo>) query.getResultList();
	}
}
