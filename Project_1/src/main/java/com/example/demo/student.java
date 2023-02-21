package com.example.demo;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Name {
		@JsonProperty("id")
	private String Name;
	private int RollNo;
	private int Rank;
	public Name(String name, int rollNo, int rank) {
		super();
		Name = name;
		RollNo = rollNo;
		Rank = rank;
	}
	public Name() {
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
