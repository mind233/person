package person;

import java.util.Scanner;

import javax.swing.JTextField;

public abstract class Employee extends Person {
	protected String id,position;

	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id=id;
	}
	
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position=position;
	}
	
	
	public Employee() {
		this.id="";
		this.position="";
	}
	public Employee(String fullName,String phoneNumber,String gender,String adress,String dob, String id, String position,String email ) {
		super();
		this.setId(id);
		this.setPosition(position);
	
	}
	
	public void input() {
		super.input();
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter ID: ");
		this.setId(kb.nextLine());
		System.out.println("Enter Position:");
		this.setPosition(kb.nextLine());
		
		
	}
	
	public void output() {
		super.output();
		System.out.println("ID: "+this.id);
		System.out.println("Position: "+this.position);
	
		
	}
	public abstract double computeSalary(); 
	

	public static void main(String[] args) {
		Employee e = new Regular();//lop trừu trượng không được new qua chính bản thân nó mà thông qua lớp con nó
		e.input();
		e.output();
	}
}


