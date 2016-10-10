package br.com.javaee.example.dao.impl;


import br.com.javaee.example.dao.AtendimentoDao;
import br.com.javaee.example.model.Atendimento;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

public class AtendimentoDaoImpl implements AtendimentoDao {

    @PersistenceContext(unitName = "AtendimentoPU")
    private EntityManager em;

    @Override
    public Atendimento salvarOuAtualizar(Atendimento entity) {

        if (entity.getProtocolo() != null) {
            entity = em.merge(entity);
        }

        em.persist(entity);

        return entity;
    }

    @Override
    public void remover(Atendimento entity) {

        entity = em.merge(entity);

        em.remove(entity);
    }

    @Override
    public List<Atendimento> listar() {

        Query query = em.createQuery("from Atendimento");

        return query.getResultList();
    }

    @Override
    public Atendimento findByProtocolo(Integer protocolo) {

        return em.find(Atendimento.class, protocolo);
    }

}
