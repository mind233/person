package person;

import java.util.Scanner;

public class Person 
{
	protected String fullName,phoneNumber,gender,adress,dob,email;
	
	public void setFullName(String fullName)
	{
		this.fullName = fullName;
	}
	public String getFullName()
	{
		return this.fullName;
	}
	public String getAdress()
	{
		return this.adress;
	}
	public void setAdress(String adress)
	{
		this.adress = adress;
	}
	public String getPhoneNumber()
	{
		return this.phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber)
	{
		this.phoneNumber = phoneNumber;
	}
	public String getGender()
	{
		return this.gender;
	}
	public void setGender(String gender)
	{
		this.gender = gender;
	}
	public String getDob()
	{
		return this.dob;
	}
	public void setDob(String dob)
	{
		this.dob = dob;
	}
	public String getEmail()
	{
		return this.email;
	}
	public void setEmail(String email)
	{
		this.email = email;
	}
	
	public Person()
	{
		this.fullName="";
		this.gender="";
		this.phoneNumber="";
		this.adress="";
		this.dob="";
		this.email="";
	}
	public Person(String fullName,String phoneNumber,String gender,String adress,String dob,String email)
	{
		this.setFullName(fullName);
		this.setPhoneNumber(phoneNumber);
		this.setGender(gender);
		this.setAdress(adress);
		this.setDob(dob);
		this.setEmail(email);
	}
	public void input()
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter full name : ");
		this.setFullName(in.nextLine());
		System.out.println("Enter Adress : ");
		this.setAdress(in.nextLine());
		System.out.println("Enter phone number : ");
		this.setPhoneNumber(in.nextLine());
		System.out.println("your sex : ");
		this.setGender(in.nextLine());
		System.out.println("Day Of Birth : ");
		this.setDob(in.nextLine());
		System.out.println("Email : ");
		this.setEmail(in.nextLine());
	}
	public void output()
	{
		System.out.println(this.fullName);
		System.out.println(this.phoneNumber);
		System.out.println(this.gender);
		System.out.println(this.adress);
		System.out.println(this.dob);
		System.out.println(this.email);
	}
	public static void main(String[] args) {
		Person p1 = new Person();
		p1.input();
		p1.output();
		
		
		
		//Person p2 = new Person("minh",true,"012",new Address("30","dong da","thuan phuoc","da nang"),new DayOfBirth(2000,3,23));
		//p2.output();
		
		
	}
	

}