package com.test.webservice;


import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

/**
 * Created by home on 27.05.14.
 */

@Path("/test")
public class TestWebService {



    @GET
    @Produces("text/plain")
    public String test(){
        return "testStarted";
    }

}
