package com.apps.developerblog.app.ws.io.entity;


import jakarta.persistence.*;

import java.io.Serializable;
import java.util.List;


@Entity(name="users")
public class UserEntity implements Serializable {

	
	private static final long serialVersionUID = 1952468127902667740L;
	
	@Id
	@GeneratedValue
	private long id;
	
	@Column(nullable=false)
	private String userId;
	
	@Column(nullable=false, length=50)
	private String firstName;
	
	@Column(nullable=false, length=50)
	private String lastName;
	
	@Column(nullable=false, length=120)
	private String email;
	
	@Column(nullable=false)
	private String encryptedPassword;
	
	private String emailVerificatioToken;
	
	@Column(nullable=false, columnDefinition ="boolean default false")
	private Boolean emailVerificatioStatus = false;
	
	@OneToMany(mappedBy="userDetails", cascade=CascadeType.ALL)
	private List<AddressEntity> addresses;


	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEncryptedPassword() {
		return encryptedPassword;
	}

	public void setEncryptedPassword(String encryptedPassword) {
		this.encryptedPassword = encryptedPassword;
	}

	public String getEmailVerificatioToken() {
		return emailVerificatioToken;
	}

	public void setEmailVerificatioToken(String emailVerificatioToken) {
		this.emailVerificatioToken = emailVerificatioToken;
	}

	public Boolean getEmailVerificatioStatus() {
		return emailVerificatioStatus;
	}

	public void setEmailVerificatioStatus(Boolean emailVerificatioStatus) {
		this.emailVerificatioStatus = emailVerificatioStatus;
	}

	public List<AddressEntity> getAddresses() {
		return addresses;
	}

	public void setAddresses(List<AddressEntity> addresses) {
		this.addresses = addresses;
	}


}
