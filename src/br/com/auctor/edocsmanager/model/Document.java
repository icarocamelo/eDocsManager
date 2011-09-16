/**
 * 
 */
package br.com.auctor.edocsmanager.model;

import java.util.Date;

import javax.ws.rs.core.MediaType;

/**
 * @author IcaroCamelo
 *
 */
public abstract class Document {
	private Long id;
	private String name;
	private String title;
	private String description;
	private MediaType mediaType;
	private Byte[] content;
	private User publisher;
	private Integer reads;
	private Visibility visibility;
	private Date creationDate;
	private Date updateDate;
	

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
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Byte[] getContent() {
		return content;
	}
	public void setContent(Byte[] content) {
		this.content = content;
	}
	public User getPublisher() {
		return publisher;
	}
	public void setPublisher(User publisher) {
		this.publisher = publisher;
	}
	public Integer getReads() {
		return reads;
	}
	public void setReads(Integer reads) {
		this.reads = reads;
	}
	public Visibility getVisibility() {
		return visibility;
	}
	public void setVisibility(Visibility visibility) {
		this.visibility = visibility;
	}
	public Date getCreationDate() {
		return creationDate;
	}
	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}
	public Date getUpdateDate() {
		return updateDate;
	}
	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}
	public MediaType getContentType() {
		return mediaType;
	}
	public void setContentType(MediaType contentType) {
		this.mediaType = contentType;
	}

}


