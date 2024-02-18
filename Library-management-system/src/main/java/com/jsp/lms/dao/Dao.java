package com.jsp.lms.dao;

import com.jsp.lms.entity.Book;
import com.jsp.lms.entity.Library;

public interface Dao {
	 boolean saveLibrary(Library library);
	 boolean addBook(Book book);
	 boolean findLibraryId(int id);
}
