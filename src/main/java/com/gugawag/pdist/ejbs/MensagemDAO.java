package com.gugawag.pdist.ejbs;

import com.gugawag.pdist.model.Mensagem;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;
import java.util.stream.Collectors;

@Stateless
public class MensagemDAO {

    @PersistenceContext(unitName="default")
    private EntityManager em;

    public void inserir(Mensagem novaMensagem){
        em.persist(novaMensagem);
    }

    public List<Mensagem> listar() {
        return em.createQuery("select m FROM Mensagem m").getResultList();
    }

    public Mensagem pesquisarPorId(Long id){
        List<Mensagem> mensagems = listar();
        return mensagems.stream().filter(m -> m.getId().equals(id)).collect(Collectors.toList()).get(0);
    }
}
