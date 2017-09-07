<<<<<<< HEAD
package com.ustudy.dashboard.model;

import java.io.Serializable;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Role implements Serializable {

	private static final long serialVersionUID = -7055935870910488212L;
	
	private int id;
	private String name = null;
	private String type = null;
	
	public Role() {}
	
	public Role(int id, String name, String type) {
		this.id = id;
		this.name = name;
		this.type = type;
	}
	
	public Role(ResultSet rs) throws SQLException {
		this.id = rs.getInt("id");
		this.name = rs.getString("name");
		this.type = rs.getString("type");
	}
	
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
	
	public String getType() {
		return type;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	
}
=======
package com.ustudy.dashboard.model;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Role implements Serializable {

	private static final long serialVersionUID = -7055935870910488212L;
	
	@JsonIgnore
	private String id = null;
	
	@JsonProperty("roleName")
	private String role_name = null;
	
	@JsonIgnore
	private String user_name = null;
	
	private List<String> perms = null;
	
	public Role() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Role(String id, String role_name, String user_name) {
		super();
		this.id = id;
		this.role_name = role_name;
		this.user_name = user_name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getRole_name() {
		return role_name;
	}

	public void setRole_name(String role_name) {
		this.role_name = role_name;
	}

	public String getUser_name() {
		return user_name;
	}

	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}

	public List<String> getPerms() {
		return perms;
	}

	public void setPerms(List<String> perms) {
		this.perms = perms;
	}

	@Override
	public String toString() {
		return "Role [id=" + id + ", role_name=" + role_name + ", user_name=" +
	        user_name + ", perms=" + perms + "]";
	}
	
	
}
>>>>>>> upstream/0.1.0
