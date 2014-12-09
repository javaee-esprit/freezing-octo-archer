package edu.esprit.wild;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.faces.view.ViewScoped;
import javax.inject.Named;


@Named
@ViewScoped
public class UsesrBean implements Serializable{
	
	
	private List<String> users;
	private Date date;
	
	
	public UsesrBean() {
	}
	
	@PostConstruct
	public void init(){
		System.out.println("bean created : " + new Date() );
		users = new ArrayList<String>();
		users.add("karim");
		users.add("zoubeir");
		users.add("amine");
		users.add("imene");
		users.add("nour");
	}

	public List<String> getUsers() {
		return users;
	}

	public void setUsers(List<String> users) {
		this.users = users;
	}

	public Date getDate() {
		return date;
	}
	
	@PreDestroy
	public void destroy(){
		System.out.println("bean destroyed : " + new Date() );
	}
	
	

}
