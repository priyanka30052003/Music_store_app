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
@Table(name="payment")
public class Payment {
	@Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "PAY_SEQ")
    @SequenceGenerator(name = "pay_seq", sequenceName = "PAY_SEQ")
   
    private int id;
	@NotNull
	private String  name;
	
	private String phnnum;
	@NotNull
	private String cardnum;
	@NotNull
	private String cvv;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhnnum() {
		return phnnum;
	}
	public void setPhnnum(String phnnum) {
		this.phnnum = phnnum;
	}
	public String getCardnum() {
		return cardnum;
	}
	public void setCardnum(String cardnum) {
		this.cardnum = cardnum;
	}
	public String getCvv() {
		return cvv;
	}
	public void setCvv(String cvv) {
		this.cvv = cvv;
	}
	

	}