package com.test.mercedes;


import com.test.model.BracketModel;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import com.test.service.BracketService;

@Path("/bracket")
public class BracketController {
    private BracketService service;

    public BracketController(){
        if(service == null)
            service = new BracketService();
    }

    @GET
    @Path("/calculate-bracket/{number}")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.TEXT_PLAIN)
    public Response bracketCombination(@PathParam("number") Integer number)
    {
        BracketModel model;
        ObjectWriter ow = new ObjectMapper().writer().withDefaultPrettyPrinter();
        try {
            model = service.calculateBracketCombinations(number);
            String json = ow.writeValueAsString(model);
            return Response.status(Response.Status.OK)
                    .entity(json)
                    .build();
        }
        catch (Exception ex){
            return Response.status(Response.Status.INTERNAL_SERVER_ERROR)
                    .entity(ex.getMessage())
                    .build();
        }
    }
}
