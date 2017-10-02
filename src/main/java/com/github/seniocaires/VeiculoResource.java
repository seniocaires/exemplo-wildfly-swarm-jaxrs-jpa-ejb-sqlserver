package com.github.seniocaires;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

import com.google.gson.Gson;

@Path("/veiculo")
@Stateless
public class VeiculoResource {

	@EJB
	private VeiculoBean veiculoBean;

	@GET
	@Path("/amostra")
	public Response amostra() {
		Gson gson = new Gson();
		return Response.ok(gson.toJson(veiculoBean.amostra())).build();
	}
}
