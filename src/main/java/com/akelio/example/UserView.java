package com.akelio.example;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ViewScoped
@ManagedBean(name = "userView")
public class UserView {

	private String	value	= "This editor is provided by PrimeFaces";

	public UserView() {
		super();
		System.out.println("userView");
	}

	@PostConstruct
	public void init() {
		System.out.println("---------");
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

}
