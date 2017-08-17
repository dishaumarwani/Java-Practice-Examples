/*
A hashSet has all unique elements. An array may contain duplicate elements but a hashSet
always has unique elements. It basically uses hash tables for storage. So, if two keys are
same they will have same hash values and hence will collide.
*/
import java.util.*;
class Book{
	int id;
	String name,author,publisher;
	int quantity;
	public Book(int id, String name, String author, 
	String publisher, int quantity){
		this.id = id;
		this.name = name;
		this.author =author;
		this.publisher = publisher;
		this.quantity = quantity;
	}
}
class HashSetDemo{
	public static void main(String args[]){
		//Creating List of Books
		HashSet<Book> BookList = new HashSet<Book>();
		
		Book b1 =new Book(101,"Python for Data Analysis", "Wes McKinney", "O'Reilly Media",4);
		Book b2 =new Book(102,"Programming Hive","Dean Wampler","O'Reilly Media",4);
		Book b3 = new Book(103,"MapReduce Design Patterns","Adam Shook","O'Reilly Media",3);
		//Adding Books to the set
		BookList.add(b1);
		BookList.add(b2);
		BookList.add(b3);
		//Traversing list
		for(Book b:BookList){
			System.out.println("Book"+b.id+"\t"+b.name+"\t "+b.author+"\t"+b.publisher+"\t"+b.quantity);
		}
	}
}