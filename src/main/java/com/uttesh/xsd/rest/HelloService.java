package com.uttesh.xsd.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;

@Component
@Path("/")
public class HelloService  {

    private final Logger logger = Logger.getLogger(HelloService.class);
    
    @GET
    @Path("hello")
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        logger.info("hello Jersey");
        return "Got it!";
    }



}
