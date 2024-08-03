package com.person;

public class Dingi implements Student{

	@Override
	public Person getPerson() {
		return new Ramesh();
	}

}
