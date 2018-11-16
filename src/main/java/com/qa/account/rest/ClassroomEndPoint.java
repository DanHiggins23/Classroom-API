package com.qa.account.rest;

import com.qa.account.business.service.ClassroomService;

import javax.inject.Inject;
import javax.ws.rs.*;

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
    @Produces({"application/json"})
    public String createUser(String jsonString) {
        return service.createUser(jsonString);
    }

    @PUT
    @Path("/json/{classroomID}")
    @Produces({"application/json"})
    public String updateUser(@PathParam("classroomID") Long classroomID, String classroomToUpdate) {
        return service.updateUser(classroomID, classroomToUpdate);
    }

    @DELETE
    @Path("/json/{classroomID}")
    @Produces({"application/json"})
    public String deleteUser(@PathParam("classroomID") Long classroomID) {
        return service.deleteUser(classroomID);
    }

}
