package com.jsp.lms.entity;

import java.io.Serializable;
import java.util.List;

public class Library implements Serializable{
  private int id;
  private String lib_loc;
  private String lib_name;
  private String email;
  private long phone;
  private String librarian_name;
  private List<Book>books;
public Library(int id, String lib_loc, String lib_name, String email, long phone, String librarian_name) {
	super();
	this.id = id;
	this.lib_loc = lib_loc;
	this.lib_name = lib_name;
	this.email = email;
	this.phone = phone;
	this.librarian_name = librarian_name;
}
public List<Book> getBooks() {
	return books;
}
public void setBooks(List<Book> books) {
	this.books = books;
}
public Library(int id, String lib_loc, String lib_name, String email, long phone, String librarian_name,
		List<Book> books) {
	super();
	this.id = id;
	this.lib_loc = lib_loc;
	this.lib_name = lib_name;
	this.email = email;
	this.phone = phone;
	this.librarian_name = librarian_name;
	this.books = books;
}
public Library() {
	super();
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getLib_loc() {
	return lib_loc;
}
public void setLib_loc(String lib_loc) {
	this.lib_loc = lib_loc;
}
public String getLib_name() {
	return lib_name;
}
public void setLib_name(String lib_name) {
	this.lib_name = lib_name;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public long getPhone() {
	return phone;
}
public void setPhone(long phone) {
	this.phone = phone;
}
public String getLibrarian_name() {
	return librarian_name;
}
public void setLibrarian_name(String librarian_name) {
	this.librarian_name = librarian_name;
}

}
