package person;

import java.util.Scanner;

public class ArrayOfEmployee {
	private Employee a[] = new Employee[100]; 
	private int n;
	public int getN() {
		return n;
	}
	public void setN(int n) {
		this.n=n;
	}
	public ArrayOfEmployee() {
		
	}
	public ArrayOfEmployee(int n) {
		this.setN(n);
	}
	public void input() {
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter N:");
		this.setN(kb.nextInt());
		for(int i=0;i<this.n;i++) {
			System.out.println("Employee "+(i+1)+" :");
			System.out.println("1-Regular/2-Contract");
			int choose =kb.nextInt();
			if(choose == 1) {
				Employee e = new Regular();
				e.input();
				a[i]=e;
			}else {
				if(choose ==2) {
					Employee e = new Contract();
					e.input();
					a[i]=e;
				}
			}
		}
	}
	public void output() {
		for(int i=0;i<this.n;i++) {
			System.out.println("Employ "+(i+1)+" :");
			a[i].output();
			System.out.println();
		}
	}
	public double salaryMax() {
		double max = a[0].computeSalary();//tinh da hinh
		for(int i=1; i<this.n;i++) {
			if(max<a[i].computeSalary())//tinh da hinh
				max = a[i].computeSalary();//tinh da hinh
		}
		return max;
	}
	//count how many Regular and Contract
	public void count() { 
		int c1=0,c2=0;
		for(int i=0;i<n;i++)
			if (a[i] instanceof Regular) c1++;
			else c2++;
		System.out.println("Regulars: "+c1);
		System.out.println("Contracts: "+c2);
	}
	public static void main(String[] args) {
		ArrayOfEmployee arr = new ArrayOfEmployee();
		arr.input();
		arr.output();
		System.out.println("Employee has largest money: "+arr.salaryMax());
		arr.count();
	}

}
