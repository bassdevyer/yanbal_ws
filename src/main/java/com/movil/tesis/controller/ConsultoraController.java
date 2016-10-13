package com.movil.tesis.controller;

import com.movil.tesis.model.Consultora;
import com.movil.tesis.service.ConsultoraService;

import javax.jws.WebService;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

/**
 * Created by mac on 10/12/16.
 */
@Path("/")
@WebService(name = "yanbalWs")
public class ConsultoraController {

    private ConsultoraService consultoraService;

    public void setConsultoraService(ConsultoraService consultoraService) {
        this.consultoraService = consultoraService;
    }

    @GET
    @Path("/authenticate/{username}/{password}")
    @Produces("application/json")
    public Consultora authenticate(@PathParam("username") String username, @PathParam("password") String password) {
        Consultora outcome = null;
        try {
            outcome = consultoraService.findByUsernamePassword(username, password);
        } catch (Exception exception) {
            exception.printStackTrace();
        }
        return outcome;
    }
}
