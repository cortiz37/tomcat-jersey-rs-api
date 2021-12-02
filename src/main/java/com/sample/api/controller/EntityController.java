package com.sample.api.controller;

import com.sample.api.model.SimpleEntity;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;

@Path(EntityController.PATH)
public class EntityController {

    public static final String PATH = "/v1/entities";

    @Context
    private UriInfo context;

    @GET
    @Produces(MediaType.TEXT_HTML)
    public String getSimpleHTMLResponse() {
        return "Simple html response...";
    }

    @GET
    @Path("json")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getEntity() {
        SimpleEntity simpleEntity = new SimpleEntity();
        simpleEntity.setId(System.currentTimeMillis());
        simpleEntity.setActive(true);
        simpleEntity.setDescription("example");

        return Response.ok(simpleEntity).build();
    }
}