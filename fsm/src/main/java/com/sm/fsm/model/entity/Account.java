package com.sm.fsm.model.entity;

import javax.persistence.Entity;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
@Entity(name = "tm_account")
public class Account extends AbstractEntity {

	private String test;
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
