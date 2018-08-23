package com.misterxu.domain;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Component;

/**
 * Created by misterxu on 2018/8/12.
 */
@Component
public class Person {
	private static final Log logger = LogFactory.getLog(Person.class);
	private String id;
	private String name;

	public Person() {
		logger.info("Person 加入容器");
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
		return "Person{" +
				"id='" + id + '\'' +
				", name='" + name + '\'' +
				'}';
	}
}
