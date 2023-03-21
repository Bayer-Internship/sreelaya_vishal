package com.example.todo.model;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="TO_DO_MODEL")
public class ToDoModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public long id;
	public String discription;
	public boolean complete;
	public LocalDate date;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getDiscription() {
		return discription;
	}
	public void setDiscription(String discription) {
		this.discription = discription;
	}
	public boolean isComplete() {
		return complete;
	}
	public void setComplete(boolean complete) {
		this.complete = complete;
	}
	public ToDoModel() {
	}
	public ToDoModel(String discription) {
		this.discription = discription;
		this.complete=false;
	}
	@Override
	public String toString() {
		return "ToDoModel [id=" + id + ", discription=" + discription + ", complete=" + complete + "]";
	}
	

}
