package org.registeruser.register_user.model;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.sun.istack.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name="userregister")
public class User {
	@Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "USER_SEQ")
    @SequenceGenerator(name = "user_seq", sequenceName = "USER_SEQ")
   
    private Long id;
	@NotNull
	private String  password;
	private String Name;
	@NotNull
	private String  userId;


	public String getName() {
		return Name;
	}


	public void setName(String name) {
		Name = name;
	}




	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getUserId() {
		return userId;
	}


	public void setUserId(String userId) {
		this.userId = userId;
	}




}



