package br.com.javaee.example.service;


import br.com.javaee.example.model.Atendimento;

import java.util.List;

public interface AtendimentoService {

    void salvar(Atendimento atendimento);

    void remover(Integer protocolo);

    List<Atendimento> listarTodos();
}
