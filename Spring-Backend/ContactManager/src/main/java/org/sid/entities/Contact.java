package org.sid.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Contact implements Serializable{

	@Id
	@GeneratedValue
	private long id;
	private String nom;
	private String prenom;
	@Temporal(TemporalType.DATE)
	private Date datenaissance;
	private String email;
	private String photo;
	private long tel;
	@Override
	public String toString() {
		return "Contact :: " + nom + " " + prenom ;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public Date getDatenaissance() {
		return datenaissance;
	}
	public void setDatenaissance(Date datenaissance) {
		this.datenaissance = datenaissance;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	public long getTel() {
		return tel;
	}
	public void setTel(long tel) {
		this.tel = tel;
	}
	public Contact(String nom, String prenom, Date datenaissance, String email, String photo, long tel) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.datenaissance = datenaissance;
		this.email = email;
		this.photo = photo;
		this.tel = tel;
	}
	public Contact() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
}
