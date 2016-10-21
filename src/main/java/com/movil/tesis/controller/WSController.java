package com.movil.tesis.controller;

import com.movil.tesis.model.Cliente;
import com.movil.tesis.model.Consultora;
import com.movil.tesis.service.ClienteService;
import com.movil.tesis.service.ConsultoraService;

import javax.jws.WebService;
import javax.ws.rs.*;

/**
 * Created by mac on 10/12/16.
 */
@Path("/")
@WebService(name = "yanbalWs")
public class WSController {

    private ConsultoraService consultoraService;
    private ClienteService clienteService;

    public void setConsultoraService(ConsultoraService consultoraService) {
        this.consultoraService = consultoraService;
    }

    public void setClienteService(ClienteService clienteService) {
        this.clienteService = clienteService;
    }

    @GET
    @Path("/authenticate")
    @Produces("application/json")
    public Consultora authenticate(@QueryParam("username") String username, @QueryParam("password") String password) {
        Consultora outcome = null;
        try {
            outcome = consultoraService.findByUsernamePassword(username, password);
        } catch (Exception exception) {
            exception.printStackTrace();
        }
        return outcome;
    }

    @POST
    @Path("/registerconsultant")
    @Produces("application/json")
    @Consumes("application/json")
    public Consultora register(Consultora consultora) {
        Consultora outcome = null;
        try {
            outcome = consultoraService.save(consultora);
        } catch (Exception exception) {
            exception.printStackTrace();
        }
        return outcome;
    }

    @POST
    @Path("/registerclient")
    @Produces("application/json")
    @Consumes("application/json")
    public Cliente registerClient(Cliente cliente) {
        Cliente outcome = null;
        try {
            outcome = clienteService.save(cliente);
        } catch (Exception exception) {
            exception.printStackTrace();
        }
        return outcome;
    }
}
