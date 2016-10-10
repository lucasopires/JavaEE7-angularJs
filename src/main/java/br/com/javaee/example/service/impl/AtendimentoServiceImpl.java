package br.com.javaee.example.service.impl;


import br.com.javaee.example.dao.AtendimentoDao;
import br.com.javaee.example.model.Atendimento;
import br.com.javaee.example.service.AtendimentoService;

import javax.inject.Inject;
import javax.transaction.Transactional;
import java.util.List;


public class AtendimentoServiceImpl implements AtendimentoService {

    @Inject
    private AtendimentoDao dao;

    @Override
    @Transactional
    public void salvar(Atendimento atendimento) {

        dao.salvarOuAtualizar(atendimento);
    }

    @Override
    @Transactional
    public void remover(Integer protocolo) {

        dao.remover(dao.findByProtocolo(protocolo));
    }

    @Override
    public List<Atendimento> listarTodos() {

        return dao.listar();
    }

}
