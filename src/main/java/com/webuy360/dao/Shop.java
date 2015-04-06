package com.webuy360.dao;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;

public class Shop {
	@Id
	private String id;
	@Indexed(unique=true)
	private String name;
	private String desc;
	
	public String getId() {
		return id;
	}



	public void setId(String id) {
		this.id = id;
	}



	public String getName() {
		return name;
	}




	public Shop(String name, String desc) {
		this.name = name;
		this.desc = desc;
	}


	
    @Override
    public String toString() {
        return String.format(
                "Customer[id=%s, name='%s', desc='%s']",
                id, name, desc);
    }

}
