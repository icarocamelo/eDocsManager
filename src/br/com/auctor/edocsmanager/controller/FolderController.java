package br.com.auctor.edocsmanager.controller;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Request;
import javax.ws.rs.core.UriInfo;

import br.com.auctor.edocsmanager.model.Folder;
import br.com.auctor.edocsmanager.model.Visibility;
import br.com.auctor.edocsmanager.repository.FolderRepository;

@Path("folder")
public class FolderController {

	private FolderRepository rep;

	@Context
	UriInfo uriInfo;
	@Context
	Request request;
	
	@GET
	@Path("/add")
	@Produces(MediaType.TEXT_PLAIN)
	public void add(String folderName){
		rep.insert(new Folder(folderName, Visibility.CUSTOM, true));
	}
}
