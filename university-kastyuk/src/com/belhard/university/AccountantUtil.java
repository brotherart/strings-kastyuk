package com.belhard.university;

public class AccountantUtil {

	private double premiumPay;
	private double vacationPay;
	private double additionalPayForAcademicDegree; 
	
	
	public double countPremium (Person salary, Person yearsOfWork) {
		
		premiumPay = salary / 10.0;

		
		return premiumPay;
	}
	
	
	public double getPremium() {
		return premiumPay;
	}
	public void setPremium(double premiumPay) {
		this.premiumPay = premiumPay;
	}
	
	public double getVacationPay() {
		return vacationPay;
	}
	public void setVacationPay(double vacationPay) {
		this.vacationPay = vacationPay;
	}
	
	public double getAdditionalPayForAcademicDegree() {
		return additionalPayForAcademicDegree;
	}
	public void setAdditionalPayForAcademicDegree(double additionalPayForAcademicDegree) {
		this.additionalPayForAcademicDegree = additionalPayForAcademicDegree;
	}
}
