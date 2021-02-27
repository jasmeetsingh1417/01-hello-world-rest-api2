package com.amazon.clone.entity;

public class Girls {
int id;
String name;
int BoobSize;
String email;

public Girls() {
	
}
public Girls(int id, String name, int boobSize, String email) {
	super();
	this.id = id;
	this.name = name;
	BoobSize = boobSize;
	this.email = email;
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
public int getBoobSize() {
	return BoobSize;
}
public void setBoobSize(int boobSize) {
	BoobSize = boobSize;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}

}
