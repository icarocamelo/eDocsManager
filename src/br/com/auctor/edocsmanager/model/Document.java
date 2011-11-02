/**
 * 
 */
package br.com.auctor.edocsmanager.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.Entity;


/**
 * @author IcaroCamelo
 *
 */
@Entity
public abstract class Document {
	
	@Id
	private Long id;
	
	@Column(length=200)
	private String name;
	
	@Column(length=200)
	private String title;

	@Column(length=300)
	private String description;
	
	@Column
	private MediaType mediaType;
	
	@Column
	private Byte[] content;
	
	@ManyToOne
	private User publisher;
	
	@Column
	private Integer reads;
	
	@Enumerated(EnumType.ORDINAL)
	private Visibility visibility;
	
	@Column
	private Date creationDate;
	
	@Column
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


