package edu.esprit.wild;

import java.io.Serializable;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;


@Named
@ApplicationScoped
public class LoginBean implements Serializable{
	
	private String login;
	
	public LoginBean() {
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}
	
	

}
