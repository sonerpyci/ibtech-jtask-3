package com.payci.soner.entities.base;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;


@MappedSuperclass
public class BaseEntity {
	@Id  @GeneratedValue(strategy=GenerationType.IDENTITY)
    protected long id;
	
	public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
}
