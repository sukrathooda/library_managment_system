package com.jsp.lms.view;

import java.time.LocalDate;
import java.util.Scanner;

import com.jsp.lms.dao.DaoImplementation;
import com.jsp.lms.entity.Book;
import com.jsp.lms.entity.Library;
import com.jsp.lms.entity.Status;

public class View {

	public static void main(String[] args) {
		DaoImplementation daoImplementation=new DaoImplementation();
		Scanner scanner=new Scanner(System.in);
		System.out.println("welcome to library management system");
		System.out.println("1.save library");
		System.out.println("2.add book to library");
		System.out.println("enter the choice");
		int choice=scanner.nextInt();
		switch (choice) {
		case 1:
			Library library=new Library();
			System.out.println("enter library id");
			library.setId(scanner.nextInt());
			System.out.println("enter library location");
			scanner.nextLine();
			library.setLib_loc(scanner.nextLine());
			System.out.println("enter library name");
			library.setLib_name(scanner.next());
			System.out.println("enter library email");
			scanner.nextLine();
			library.setEmail(scanner.nextLine());
			System.out.println("enter phone number");
			library.setPhone(scanner.nextLong());
			System.out.println("enter librarian name");
			scanner.nextLine();
			library.setLibrarian_name(scanner.nextLine());
			daoImplementation.saveLibrary(library);
			break;
		case 2:
	    System.out.println("enter how many books do you want in a library");
	    int index=1;
	    int count=scanner.nextInt();
	    while(index<=count)
	    {	System.out.println("Enter library id where you want to keep book"+index);
	    	int library_id=scanner.nextInt();
	    	if(daoImplementation.findLibraryId(library_id)) {
				Book book=new Book();
				System.out.println("enter the book id");
				book.setId(scanner.nextInt());
				System.out.println("enter the book title");
				scanner.nextLine();
		        book.setTitle(scanner.nextLine());
		        System.out.println("enter the author name");
		        book.setAuthor(scanner.nextLine());
		        System.out.println("enter the price of a book");
		        book.setPrice(scanner.nextDouble());
		        System.out.println("enter published date of a book");
		        String a=scanner.next();
		        book.setPublished_date(LocalDate.parse(a));
		        System.out.println("enter issued date of a book");
		        String b=scanner.next();
		        book.setIssues_date(LocalDate.parse(b));
		        
		        
		        boolean flag=true;
		        while(flag) {
		        	System.out.println("select the status \n1.lost \n2.issued \n3.available");
		        	int options =scanner.nextInt();
			        switch (options) {
					case 1:
						book.setStatus(Status.LOST);
						flag=false;
						break;
					case 2:
				       book.setStatus(Status.ISSUED);
				       flag=false;
				       break;
				    case 3:
				    	book.setStatus(Status.AVAILABLE);
				    	flag=false;
				    	break;
			
					 default:
			        	 System.out.println("enter legal choice between 1-3");
			        }
					
				}
		        book.setLib_id(library_id);
		        daoImplementation.addBook(book);
		        index++;
	    	}else {
	    		System.out.println("Library not build yet");
	    	}
	    }
		default:
			break;
		}
		

	}

}
