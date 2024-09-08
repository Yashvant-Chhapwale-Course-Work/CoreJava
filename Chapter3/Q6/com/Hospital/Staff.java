package com.Hospital;

public class Staff {
	public static class Doctor {

		protected double calculatesalary(double amt, double tax) {
			return amt - tax;
		}

		public double calculatesalary(double amt) {
			return amt;
		}
	}

	public static void main(String[] args) {

		Staff.Doctor s=  new Doctor();
		System.out.println("Doctor's Salary:" + new Doctor().calculatesalary(250000, 250));
		System.out.println("Doctor's Salary Without Tax:" + s.calculatesalary(250000));
	}

}
