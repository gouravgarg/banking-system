package com.gourav;

public class Company  extends AccountHolder{
	private String companyName;
	private int taxId;

//	public Company(int idNumber, int taxId) {
//		super(idNumber);
//		this.taxId = taxId;
//	}

	public Company(String companyName, int taxId) {
		super(taxId);
		this.companyName = companyName;
		this.taxId = taxId;
	}

	public String getCompanyName() {
		return companyName;
	}
}
