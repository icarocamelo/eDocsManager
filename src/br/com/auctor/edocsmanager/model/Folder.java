package br.com.auctor.edocsmanager.model;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;

/**
 * @author IcaroCamelo
 *
 */
public class Folder {
	private Long id;
	private String name;
	private Visibility visibility;
	private Boolean visibilityInCascade;
	private User owner;
	private Date creationDate;
	private Date updateDate;
	private Collection<Document> documents;
	private Collection<Folder> folders;
	
	public Folder() {	
		this.folders = new ArrayList<Folder>();
		this.documents = new ArrayList<Document>();
	}
	
	public Folder(String name, Visibility visibility,
			Boolean visibilityInCascade) {
		super();		
		this.name = name;
		this.visibility = visibility;
		this.visibilityInCascade = visibilityInCascade;
		this.setCreationDate(Calendar.getInstance().getTime());
		this.setUpdateDate(Calendar.getInstance().getTime());
		this.folders = new ArrayList<Folder>();
		this.documents = new ArrayList<Document>();
	}
	
	
	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Visibility getVisibility() {
		return visibility;
	}

	public void setVisibility(Visibility visibility) {
		this.visibility = visibility;
	}

	public Boolean getVisibilityInCascade() {
		return visibilityInCascade;
	}

	public void setVisibilityInCascade(Boolean visibilityInCascade) {
		this.visibilityInCascade = visibilityInCascade;
	}

	public Date getCreationDate() {
		return creationDate;
	}

	private void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	public Date getUpdateDate() {
		return updateDate;
	}

	private void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

	public Collection<Folder> getFolders() {
		return folders;
	}

	public void add(Folder folder1) {
		if (this.folders == null)
			this.folders = new ArrayList<Folder>();
		this.folders.add(folder1);
	}

	public void addDocuments(Document document) {
		if (this.documents == null){
			this.documents = new ArrayList<Document>();
		}
		this.documents.add(document);
	}

	public Collection<Document> getDocuments() {
		return documents;
	}

	public void setOwner(User owner) {
		this.owner = owner;
	}

	public User getOwner() {
		return owner;
	}
}
