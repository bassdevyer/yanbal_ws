package com.movil.tesis.controller;

import com.movil.tesis.model.Cliente;
import com.movil.tesis.model.Consultora;
import com.movil.tesis.model.PedidosCabecera;
import com.movil.tesis.model.ProductosYanbal;
import com.movil.tesis.service.ClienteService;
import com.movil.tesis.service.ConsultoraService;
import com.movil.tesis.service.PedidosCabeceraService;
import com.movil.tesis.service.ProductService;

import javax.jws.WebService;
import javax.ws.rs.*;
import java.util.List;

/**
 * Created by mac on 10/12/16.
 */
@Path("/")
@WebService(name = "yanbalWs")
public class WSController {

    private ConsultoraService consultoraService;
    private ClienteService clienteService;
    private ProductService productService;
    private PedidosCabeceraService pedidosCabeceraService;

    public void setProductService(ProductService productService) {
        this.productService = productService;
    }


    public void setConsultoraService(ConsultoraService consultoraService) {
        this.consultoraService = consultoraService;
    }

    public void setClienteService(ClienteService clienteService) {
        this.clienteService = clienteService;
    }

    public void setPedidosCabeceraService(PedidosCabeceraService pedidosCabeceraService) {
        this.pedidosCabeceraService = pedidosCabeceraService;
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

    @GET
    @Path("/clients")
    @Produces("application/json")
    public List<Cliente> getClients() {
        List<Cliente> outcome = null;
        try {
            outcome = clienteService.getClients();
        } catch (Exception exception) {
            exception.printStackTrace();
        }
        return outcome;
    }


    @GET
    @Path("/check")
    @Produces("application/json")
    public ProductosYanbal checkExistence(@QueryParam("code") String code) {
        ProductosYanbal outcome = null;
        try {
            outcome = productService.checkExistence(code);
        } catch (Exception exception) {
            exception.printStackTrace();
        }
        return outcome;
    }

    @POST
    @Path("/registerorder")
    @Produces("application/json")
    @Consumes("application/json")
    public PedidosCabecera registerOrder(PedidosCabecera order) {
        PedidosCabecera outcome = null;
        try {
            outcome = pedidosCabeceraService.registerOrder(order);
        } catch (Exception exception) {
            exception.printStackTrace();
        }
        return outcome;
    }


}
