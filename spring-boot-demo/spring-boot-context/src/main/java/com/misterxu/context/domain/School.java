package com.misterxu.context.domain;

import org.springframework.stereotype.Component;

/**
 * Created by misterxu on 2018/8/20.
 */
@Component
public class School {
	private String id;
	private String name;


	public School() {
		System.out.println("School 加入容器");
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	@Override
	public String toString() {
		return "School{" +
				"id='" + id + '\'' +
				", name='" + name + '\'' +
				'}';
	}
}
