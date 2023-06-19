package Association;

public class Book {
String bookName;
int price;
Author auth;

public Book(String bookName,int price,Author auth) {
	this.bookName=bookName;
	this.price=price;
	this.auth=auth;
}

public String getBookName() {
	return bookName;
}

public int getPrice() {
	return price;
}

public Author getAuth() {
	return auth;
}

public static void main(String[] args) {
	Author a = new Author("Tagore",50,"Kolkata");
	Book b = new Book("Gitanjali",500,a);
	System.out.println("Book Details: ");
	System.out.println("BookName: "+b.getBookName());
	System.out.println("Book Price: " +b.getPrice());
	System.out.println("Author: " +b.getAuth().getName());
	System.out.println("Place: " +b.getAuth().getPlace());
	System.out.println("Age: " +b.getAuth().getAge());
	
}

}
