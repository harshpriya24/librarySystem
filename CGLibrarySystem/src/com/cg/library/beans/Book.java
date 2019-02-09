package com.cg.library.beans;

public class Book {

private int bookId;
private String bookName;
private String author;
private int rackNo;
private  int price;
private String status;
private int numberOfBooks;
 public Book() {}
 
 
public Book(int bookId) {
	super();
	this.bookId = bookId;
}


public Book(String bookName, String author, int rackNo, int price, String status, int numberOfBooks) {
	super();
	this.bookName = bookName;
	this.author = author;
	this.rackNo = rackNo;
	this.price = price;
	this.status = status;
	this.numberOfBooks = numberOfBooks;
}

public Book(int bookId, String name, String author, int rackNo, int price, String status, int numberOfBooks) {
	super();
	this.bookId = bookId;
	this.bookName = name;
	this.author = author;
	this.rackNo = rackNo;
	this.price = price;
	this.status = status;
	this.numberOfBooks = numberOfBooks;
}





@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((author == null) ? 0 : author.hashCode());
	result = prime * result + bookId;
	result = prime * result + ((bookName == null) ? 0 : bookName.hashCode());
	result = prime * result + numberOfBooks;
	result = prime * result + price;
	result = prime * result + rackNo;
	result = prime * result + ((status == null) ? 0 : status.hashCode());
	return result;
}


@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Book other = (Book) obj;
	if (author == null) {
		if (other.author != null)
			return false;
	} else if (!author.equals(other.author))
		return false;
	if (bookId != other.bookId)
		return false;
	if (bookName == null) {
		if (other.bookName != null)
			return false;
	} else if (!bookName.equals(other.bookName))
		return false;
	if (numberOfBooks != other.numberOfBooks)
		return false;
	if (price != other.price)
		return false;
	if (rackNo != other.rackNo)
		return false;
	if (status == null) {
		if (other.status != null)
			return false;
	} else if (!status.equals(other.status))
		return false;
	return true;
}


public int getBookId() {
	return bookId;
}
public void setBookId(int bookId) {
	this.bookId = bookId;
}
public String getName() {
	return bookName;
}
public void setName(String name) {
	this.bookName = name;
}
public String getAuthor() {
	return author;
}
public void setAuthor(String author) {
	this.author = author;
}
public int getRackNo() {
	return rackNo;
}
public void setRackNo(int rackNo) {
	this.rackNo = rackNo;
}
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}
public String getStatus() {
	return status;
}
public void setStatus(String status) {
	this.status = status;
}
public int getNumberOfBooks() {
	return numberOfBooks;
}
public void setNumberOfBooks(int numberOfBooks) {
	this.numberOfBooks = numberOfBooks;
}
@Override
public String toString() {
	return "Book [bookId=" + bookId + ", name=" + bookName + ", author=" + author + ", rackNo=" + rackNo + ", price="
			+ price + ", status=" + status + ", numberOfBooks=" + numberOfBooks + "]";
}
 
}
