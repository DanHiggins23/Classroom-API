package com.qa.account.rest;

import com.qa.account.business.service.ClassroomService;

import javax.inject.Inject;
import javax.ws.rs.*;

@Path("/trainee")
public class TraineeEndPoint {
    @Inject
    private ClassroomService service;

    @GET
    @Path("/json")
    public String getAllTrainees(String account) {
        return service.getAllTrainees();
    }
}
