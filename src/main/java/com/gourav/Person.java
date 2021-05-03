package com.gourav;

import java.util.Objects;

public class Person extends AccountHolder{
	private String firstName;
	private String lastName;
	private int idNumber;

	public Person(String firstName, String lastName, int idNumber) {
		super (idNumber);
		this.firstName = firstName;
		this.lastName = lastName;
		this.idNumber = idNumber;
	}

	public int getIdNumber() {
		return idNumber;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Person person = (Person) o;
		return idNumber == person.idNumber &&
				Objects.equals(firstName, person.firstName) &&
				Objects.equals(lastName, person.lastName);
	}

	@Override
	public int hashCode() {
		return Objects.hash(firstName, lastName, idNumber);
	}
}
