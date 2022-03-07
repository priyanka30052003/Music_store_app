package org.registeruser.register_user.model;

import javax.persistence.Column;
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
@Table(name="adminlogin")
public class Admin {
@Id
@GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "LOGIN_SEQ")
@SequenceGenerator(name = "Login_seq", sequenceName = "LOGIN_SEQ")
private int id;

@NotNull
@Column(unique=true, name="userName")
private String userId;

@NotNull
@Column(unique=true, name="password")
private String password;



public int getId() {
return id;
}



public void setId(int id) {
this.id = id;
}



public String getUserId() {
return userId;
}



public void setId(String userName) {
this.userId = userName;
}



public String getPassword() {
return password;
}



public void setPassword(String password) {
this.password = password;
}
}