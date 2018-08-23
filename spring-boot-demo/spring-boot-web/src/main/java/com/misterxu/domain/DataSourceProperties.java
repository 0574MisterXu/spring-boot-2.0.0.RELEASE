package com.misterxu.domain;

/**
 * Created by misterxu on 2018/8/21.
 */
public class DataSourceProperties {
	private String username;
	private String password;
	private String driverClassName;
	private String url;


	public DataSourceProperties(){
		System.out.println("DataSourceProperties 加入容器");
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

	public String getDriverClassName() {
		return driverClassName;
	}

	public void setDriverClassName(String driverClassName) {
		this.driverClassName = driverClassName;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	@Override
	public String toString() {
		return "DataSourceProperties{" +
				"username='" + username + '\'' +
				", password='" + password + '\'' +
				", driverClassName='" + driverClassName + '\'' +
				", url='" + url + '\'' +
				'}';
	}
}
