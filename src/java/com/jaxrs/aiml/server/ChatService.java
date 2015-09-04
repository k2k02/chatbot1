/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jaxrs.aiml.server;

/**
 *
 * @author WKKFERNANDO
 */
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.alicebot.ab.Bot;
import org.alicebot.ab.Chat;

@Path("/chat")
public class ChatService {
	@GET
	@Path("/{param}")
	public Response ProcessMsg(@PathParam("param") String msg) {
                System.out.println("A");
		String botname="k2bot";
		String path="src\\java\\program ab";
		Bot bot=new Bot(botname,path);
		Chat chat = new Chat(bot);
		String response=chat.multisentenceRespond(msg);
		return Response.status(200).entity("Bot~"+response).build();
	}

}

