package com.example.demo;
import com.fasterxml.jackson.annotation.JsonProperty;

public class student {
		@JsonProperty("id")
	private String Name;
	private int RollNo;
	private int Rank;
	public student(String name, int rollNo, int rank) {
		super();
		Name = name;
		RollNo = rollNo;
		Rank = rank;
	}
	public student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getRollNo() {
		return RollNo;
	}
	public void setRollNo(int rollNo) {
		RollNo = rollNo;
	}
	public int getRank() {
		return Rank;
	}
	public void setRank(int rank) {
		Rank = rank;
	}
	
	
}
