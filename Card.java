package week6codingAssignment;

import java.util.ArrayList;
import java.util.List;

public class Card {
	private int value;
	private String name;
//	private 
//	private String[] name=new String[4];

	
	
	public Card(int value, String name) {
		this.name=name;
		this.value=value;
//		
//		
//		
//		
	} 
	
	

	public int getValue() {
		return value;
	}



	public void setValue(int value) {
		this.value = value;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public  void describe() {
		System.out.println(this.value+" of "+this.name  );
	}
}
