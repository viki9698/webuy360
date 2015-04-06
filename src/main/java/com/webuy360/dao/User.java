package com.webuy360.dao;

import java.util.HashSet;
import java.util.Set;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.DBRef;

public class User {
	@Id
	private String id;
	@Indexed(unique=true)
	private String username;
	private String password;
	private String name;
	private String email;
	
	@DBRef
	private Set<Shop> shops = new HashSet<Shop>();
	
	public void addShop(Shop shop) {
		shops.add(shop);
	}
	
	public void addShops(Set<Shop> list) {
		shops.addAll(list);
	}
	
	public Set<Shop> getShops() {
		return shops;
	}

	public void setShops(Set<Shop> shops) {
		this.shops = shops;
	}



	public String getId() {
		return id;
	}



	public void setId(String id) {
		this.id = id;
	}



	public String getUsername() {
		return username;
	}



	public void setUsername(String username) {
		this.username = username;
	}



	public String getPassword() {
		return password;
	}



	public void setPassword(String password) {
		this.password = password;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public User(String username, String name, String email) {
		this.username = username;
		this.name = name;
		this.email = email;
	}


	
    @Override
    public String toString() {
        return String.format(
                "Customer[id=%s, username = '%s', name='%s', email='%s']",
                id, username, name, email);
    }

}
