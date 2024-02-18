package com.jsp.lms.entity;

import java.io.Serializable;
import java.time.LocalDate;

public class Book implements Serializable{
 private int id;
 private String title;
 private String author;
 private double price;
 private LocalDate published_date;
 private LocalDate issues_date;
 private int lib_id;
 public int getLib_id() {
	return lib_id;
}
public void setLib_id(int lib_id) {
	this.lib_id = lib_id;
}
private Status status;
public Status getStatus() {
	return status;
}
public void setStatus(Status status) {
	this.status = status;
}
public Book(int id, String title, String author, double price, LocalDate published_date, LocalDate issues_date,Status status) {
	super();
	this.id = id;
	this.title = title;
	this.author = author;
	this.price = price;
	this.published_date = published_date;
	this.issues_date = issues_date;
	this.status=status;
}
public Book() {
	super();
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}
public String getAuthor() {
	return author;
}
public void setAuthor(String author) {
	this.author = author;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
public LocalDate getPublished_date() {
	return published_date;
}
public void setPublished_date(LocalDate published_date) {
	this.published_date = published_date;
}
public LocalDate getIssues_date() {
	return issues_date;
}
public void setIssues_date(LocalDate issues_date) {
	this.issues_date = issues_date;
}
 
}
