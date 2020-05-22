package book.model;

import java.util.Date;

public class v_RequestHistory {

	String request_number;
	int type_id;
	String isbn;
	Date due_date;
	int scheduled_amount;
	int warehouse_id;
	String destination;
	int status_id;
	Date completion_date;
	int amount;
	int complete_warehouse_id;
	
	String title;
	String author;
	String publisher;
	
	String category;
	
	String status;
	
	String warehouse_name;
	
	
	public String getWarehouse_name() {
		return warehouse_name;
	}
	public void setWarehouse_name(String warehouse_name) {
		this.warehouse_name = warehouse_name;
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
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getRequest_number() {
		return request_number;
	}
	public void setRequest_number(String request_number) {
		this.request_number = request_number;
	}
	public int getType_id() {
		return type_id;
	}
	public void setType_id(int type_id) {
		this.type_id = type_id;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public Date getDue_date() {
		return due_date;
	}
	public void setDue_date(Date due_date) {
		this.due_date = due_date;
	}
	public int getScheduled_amount() {
		return scheduled_amount;
	}
	public void setScheduled_amount(int scheduled_amount) {
		this.scheduled_amount = scheduled_amount;
	}
	public int getWarehouse_id() {
		return warehouse_id;
	}
	public void setWarehouse_id(int warehouse_id) {
		this.warehouse_id = warehouse_id;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public int getStatus_id() {
		return status_id;
	}
	public void setStatus_id(int status_id) {
		this.status_id = status_id;
	}
	public Date getCompletion_date() {
		return completion_date;
	}
	public void setCompletion_date(Date completion_date) {
		this.completion_date = completion_date;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public int getComplete_warehouse_id() {
		return complete_warehouse_id;
	}
	public void setComplete_warehouse_id(int complete_warehouse_id) {
		this.complete_warehouse_id = complete_warehouse_id;
	}
	@Override
	public String toString() {
		return "RequestHistory [request_number=" + request_number + ", isbn=" + isbn + ", due_date=" + due_date
				+ ", scheduled_amount=" + scheduled_amount + ", title=" + title + ", author=" + author + ", publisher="
				+ publisher + ", category=" + category + ", status=" + status + "]";
	}
	
	
}
