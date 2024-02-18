package com.jsp.lms.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.PseudoColumnUsage;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.jsp.lms.entity.Book;
import com.jsp.lms.entity.Library;

public class DaoImplementation implements Dao {

	@Override
	public boolean saveLibrary(Library library) {
		try {
			Class.forName("org.postgresql.Driver");
			String url="jdbc:postgresql://localhost:5432/library_management_system?user=postgres&password=root";
			Connection connection=DriverManager.getConnection(url);
			PreparedStatement preparedStatement=connection.prepareStatement("insert into library values(?,?,?,?,?,?)");
			preparedStatement.setInt(1, library.getId());
			preparedStatement.setString(2, library.getLib_loc());
			preparedStatement.setString(3, library.getLib_name());
			preparedStatement.setString(4, library.getEmail());
			preparedStatement.setLong(5, library.getPhone());
			preparedStatement.setString(6, library.getLibrarian_name());
			preparedStatement.execute();
			connection.close();
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean addBook(Book book) {
		try {
			Class.forName("org.postgresql.Driver");
			String url="jdbc:postgresql://localhost:5432/library_management_system?user=postgres&password=root";
			Connection connection=DriverManager.getConnection(url);
			PreparedStatement preparedStatement=connection.prepareStatement("insert into book values(?,?,?,?,?,?,?,?)");
			preparedStatement.setInt(1, book.getId());
			preparedStatement.setString(2, book.getTitle());
			preparedStatement.setString(3, book.getAuthor());
			preparedStatement.setDouble(4, book.getPrice());
			preparedStatement.setObject(5, Date.valueOf(book.getPublished_date()));
			preparedStatement.setObject(6, Date.valueOf(book.getIssues_date()));
			preparedStatement.setString(7, book.getStatus().name());
			preparedStatement.setInt(8,book.getLib_id());
			preparedStatement.execute();
			connection.close();
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return false;
	}

	@Override
	public boolean findLibraryId(int id) {
		// TODO Auto-generated method stub
		try {
			Class.forName("org.postgresql.Driver");
			String url="jdbc:postgresql://localhost:5432/library_management_system?user=postgres&password=root";
			Connection connection=DriverManager.getConnection(url);
			Statement st=connection.createStatement();
			ResultSet rs=st.executeQuery("select id from library;");
			while(rs.next()) {
				if(id==rs.getInt("id")) {
					return true;
				}
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return false;
	}
   
}
