package com.qa.account.rest;

import com.qa.account.business.service.ClassroomService;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

@Path("/classroom")
public class ClassroomEndPoint {
    @Inject
    private ClassroomService service;

    @GET
    @Path("/json")
    public String getAllClassrooms(String account) {
        return service.getAllClassrooms();
    }

    @POST
    @Path("/json")
    public String createUser(String jsonString) {
        return service.createUser(jsonString);
    }
}
