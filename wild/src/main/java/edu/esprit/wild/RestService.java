package edu.esprit.wild;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

@Path("/rest")
@Stateless
public class RestService {
	
	@Inject
	private LoginBean loginBean;
	
	@POST
	@Path("/login")
	@Consumes("application/x-www-form-urlencoded")
	public void login(@FormParam("login") String login){
		System.out.println("login invoked -> " + login);
		loginBean.setLogin(login);
		
		System.out.println(" ////////////////// : " + loginBean.getLogin());
	}

}
