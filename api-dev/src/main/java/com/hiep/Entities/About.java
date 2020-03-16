package com.hiep.Entities;
// Generated Mar 16, 2020 10:55:25 AM by Hibernate Tools 5.4.7.Final

import java.util.Date;

/**
 * About generated by hbm2java
 */
public class About implements java.io.Serializable {

	private int aboutId;
	private String tittle;
	private String metaTittle;
	private String descriptions;
	private String details;
	private Date createdDate;
	private String createdBy;
	private Date modifiedDate;
	private String metaKeywords;
	private String metaDescription;

	public About() {
	}

	public About(int aboutId) {
		this.aboutId = aboutId;
	}

	public About(int aboutId, String tittle, String metaTittle, String descriptions, String details, Date createdDate,
			String createdBy, Date modifiedDate, String metaKeywords, String metaDescription) {
		this.aboutId = aboutId;
		this.tittle = tittle;
		this.metaTittle = metaTittle;
		this.descriptions = descriptions;
		this.details = details;
		this.createdDate = createdDate;
		this.createdBy = createdBy;
		this.modifiedDate = modifiedDate;
		this.metaKeywords = metaKeywords;
		this.metaDescription = metaDescription;
	}

	public int getAboutId() {
		return this.aboutId;
	}

	public void setAboutId(int aboutId) {
		this.aboutId = aboutId;
	}

	public String getTittle() {
		return this.tittle;
	}

	public void setTittle(String tittle) {
		this.tittle = tittle;
	}

	public String getMetaTittle() {
		return this.metaTittle;
	}

	public void setMetaTittle(String metaTittle) {
		this.metaTittle = metaTittle;
	}

	public String getDescriptions() {
		return this.descriptions;
	}

	public void setDescriptions(String descriptions) {
		this.descriptions = descriptions;
	}

	public String getDetails() {
		return this.details;
	}

	public void setDetails(String details) {
		this.details = details;
	}

	public Date getCreatedDate() {
		return this.createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public String getCreatedBy() {
		return this.createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public Date getModifiedDate() {
		return this.modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	public String getMetaKeywords() {
		return this.metaKeywords;
	}

	public void setMetaKeywords(String metaKeywords) {
		this.metaKeywords = metaKeywords;
	}

	public String getMetaDescription() {
		return this.metaDescription;
	}

	public void setMetaDescription(String metaDescription) {
		this.metaDescription = metaDescription;
	}

}
