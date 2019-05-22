package person;

import java.util.Scanner;

public class Regular extends Employee {
	protected String yearOfExperience,basicOfSalary,rate;

	
	public String getYearOfExperience() {
		return this.yearOfExperience;
	}
	public void setYearOfExperience(String yearOfExperience2) {
		this.yearOfExperience=yearOfExperience2;
	}
	
	public String getRate() {
		return this.rate;
	}
	public void setRate(String rate) {
		this.rate=rate;
	}
	
	public String getBasicOfSalary() {
		return this.basicOfSalary;
	}
	public void setBasicOfSalary(String baiscOfSalary) {
		this.basicOfSalary=baiscOfSalary;
	}
	public Regular() {
		super();
	}
	public Regular(String id,String fullName,String gender,String dob,String adress,String phoneNumber, String position,String allowance,String yearOfExperience,String rate,String baiscOfSalary) {
		super();
		this.setBasicOfSalary(baiscOfSalary);
		this.setYearOfExperience(yearOfExperience);
	}
	@Override
	public void input() {
		super.input();
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter Year Of Experience:");
		this.setYearOfExperience(kb.nextLine());
		System.out.println("Enter Basic Of Salary:");
		this.setBasicOfSalary(kb.nextLine());
		double c = Double.parseDouble(getYearOfExperience());
		double d=0;
		if(c<=25) 
			d = 3.14 +0.33*(  (c+2)/3 );		
		else d=3.14+(8*0.33);
		String s = String.valueOf(d);
		this.setRate(s);
	}
	public void output() {
		super.output();
		System.out.println("Year Of Experience: "+this.getYearOfExperience());
		System.out.println("Rate: "+this.getRate());
		System.out.println("Basic Of Salary: "+this.getBasicOfSalary());
		double b = Double.parseDouble(getBasicOfSalary());
		double c = Double.parseDouble(getYearOfExperience());
		double d=0;
		if(c<=25) 
			d = 3.14 +0.33*(  (c+2)/3 );		
		else d=3.14+(8*0.33);
		System.out.println("Total: "+(d*b) );
	}
	@Override
	public double computeSalary() {
		double b = Double.parseDouble(getBasicOfSalary());
		double c = Double.parseDouble(getYearOfExperience());
		double d=0;
		if(c<=25) 
			d = 3.14 +0.33*(  (c+2)/3 );		
		else d=3.14+(8*0.33);
		return b *d;
	}
	public static void main(String[] args) {
		Regular r = new Regular();
		r.input();
		r.output();
		//System.out.println("Total: ");
		//r.solve();
	}
	
	

}
