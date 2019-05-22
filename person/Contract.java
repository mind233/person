package person;

import java.util.Scanner;

public class Contract extends Employee{
	protected String wage,allowance;
	
	public String getWage() {
		return wage;
	}
	public void setWage(String wage) {
		this.wage=wage;
	}
	public String getAllowance() {
		return allowance;
	}
	public void setAllowance(String allwance) {
		this.allowance=allwance;
	}
	public Contract () {
		super();
	}
	public Contract(String fullName,String phoneNumber,String gender,String adress,String dob, String id, String position,String allowance,String wage) {
		super();
		this.setWage(wage);
		this.setWage(wage);
	}
	@Override
	
	public void input() {
		super.input();
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter Wage:");
		this.setWage(kb.nextLine());
		System.out.println("Enter Allowance:");
		this.setAllowance(kb.nextLine());
	}
	public void output() {
		super.output();
		System.out.println("Wage: "+this.getWage());
		System.out.println("Allowance: "+this.getAllowance());

	}
	@Override
	public double computeSalary() {
		double b = Double.parseDouble(getAllowance());
		double c = Double.parseDouble(getWage());
		return b * c;
	}
	public static void main(String[] args) {
		Contract c = new Contract();
		c.input();
		c.output();
		System.out.println("Total : "+c.computeSalary());

	}

}
