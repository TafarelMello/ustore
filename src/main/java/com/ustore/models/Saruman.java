package com.ustore.models;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Saruman implements Serializable{
	
	
		private static final long serialVersionUID = 1L;
	
		@Id
		@GeneratedValue(strategy= GenerationType.AUTO)
		private long id;

		private String login;
		private String password;
		
		
		public long getId() {
			return id;
		}
		public void setId(long id) {
			this.id = id;
		}
		
		public String getLogin() {
			return login;
		}
		public void setLogin(String login) {
			this.login = login;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		
		
}
