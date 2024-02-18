package com.jsp.lms.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreatingTab {

	public static void main(String[] args) {
		try {
			Class.forName("org.postgresql.Driver");
			String url="jdbc:postgresql://localhost:5432/library_management_system?user=postgres&password=root";
		Connection connection=DriverManager.getConnection(url);
		Statement statement=connection.createStatement();
		String queryLib="create table library(id int primary key,library_location varchar(30),library_name varchar(30),email varchar(40),phone bigint,librarian_name varchar(30))";
		String queryBook="create table book(id int primary key,title varchar(30),author varchar(30),price numeric(10,2),published_date date,issued_date date,status varchar(20),library_id int references library(id))"; 
		
		statement.execute(queryLib);
		statement.execute(queryBook);

		connection.close();
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
