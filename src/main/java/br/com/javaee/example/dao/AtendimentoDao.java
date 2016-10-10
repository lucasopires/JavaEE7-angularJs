package br.com.javaee.example.dao;

import br.com.javaee.example.model.Atendimento;

import java.util.List;

public interface AtendimentoDao {

    Atendimento findByProtocolo(Integer protocolo);

    List<Atendimento> listar();

    void remover(Atendimento atendimento);

    Atendimento salvarOuAtualizar(Atendimento atendimento);

}
