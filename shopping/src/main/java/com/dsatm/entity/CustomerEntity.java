package com.dsatm.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.*;

@Entity
@Table(name="customer")
public class CustomerEntity {
  
	private Integer id;
	private String name;
	private Integer phone_no;
	private String email;
	
	public CustomerEntity()
		{
			
		}
	public CustomerEntity(Integer id, String name, Integer phone_no, String email)
	{
		this.id=id;
		this.name=name;
		this.phone_no=phone_no;
		this.email=email;
	
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getPhone_no() {
		return phone_no;
	}

	public void setPhone_no(Integer phone_no) {
		this.phone_no = phone_no;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
	@Override
	public String toString() {
		return "CustomerEntity [id=" + id + ", name=" + name + ", phone_no=" + phone_no + ", email=" + email + "]";
	}
	

}

