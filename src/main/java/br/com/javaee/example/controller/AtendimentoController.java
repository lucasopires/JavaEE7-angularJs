package br.com.javaee.example.controller;


import br.com.javaee.example.model.Atendimento;
import br.com.javaee.example.service.AtendimentoService;

import javax.inject.Inject;
import javax.ws.rs.*;
import java.util.List;

@Path("/atendimento")
@Produces({"application/json"})
public class AtendimentoController {

    @Inject
    private AtendimentoService service;

    @GET
    @Path("/")
    public List<Atendimento> listarTodos() {
        return service.listarTodos();
    }

    @POST
    @Path("/")
    public void salvar(Atendimento atendimento) {
        service.salvar(atendimento);
    }

    @DELETE
    @Path("/{protocolo}")
    public void remover(@PathParam("protocolo") Integer protocolo) {
        service.remover(protocolo);
    }

}
