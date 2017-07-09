package com.resteasy;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

@Path ("/welcome")
public class RestEasyService {
	
	@GET
	@Path("/{name}")
	public Response welcomeRestEasy(@PathParam("name") String name) {
		String result = "Welcome to My RestEasy Example ! " + name;
		return Response.status(200).entity(result).build();
	}

	@GET
	public Response welcomeRestEasySecond() {
		String result = "Rest Easy with out param call ";
		return Response.status(200).entity(result).build();
	}

}
