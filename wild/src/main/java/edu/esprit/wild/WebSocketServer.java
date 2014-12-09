package edu.esprit.wild;

import java.io.IOException;

import javax.inject.Inject;
import javax.websocket.EndpointConfig;
import javax.websocket.OnMessage;
import javax.websocket.OnOpen;
import javax.websocket.Session;
import javax.websocket.server.ServerEndpoint;


@ServerEndpoint(value = "/wss")
public class WebSocketServer {
	
	@Inject
	private LoginBean LoginBean;

	@OnOpen
	public void onOpen(Session session, EndpointConfig config){
		System.out.println(session.getId());
	}
	
	@OnMessage
	public void onMessage(Session session, String message){
		System.out.println(message);
		try {
			for(Session s:session.getOpenSessions())
			s.getBasicRemote().sendText(LoginBean.getLogin() + " : " + message);
			
			//s.getBasicRemote().sendText( message);
			 
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
