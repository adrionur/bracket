package com.test.bracketapp.controller;

import org.jboss.resteasy.core.ServerResponse;
import service.BracketService;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/bracket")
public class BracketController {
    private BracketService bracketService;
    public BracketController(){
        if(bracketService == null)
            bracketService = new BracketService();
    }

    @GET
    @Path("/calculate-bracket")
    @Produces(MediaType.TEXT_PLAIN)
    public String BracketCombinations(int number){
        bracketService.calculateBracketCombinations(number);
        Response response = new ServerResponse();
        return "";
    }

    @GET
    @Path("/test")
    @Produces(MediaType.TEXT_PLAIN)
    public String test()
    {
        return "Test";
    }
}
