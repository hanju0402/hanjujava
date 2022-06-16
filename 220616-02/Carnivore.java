package com.kt.animal;

import com.kt.emp.Trainer;

//육식
public class Carnivore implements Animal {

	private String type;
	private int age;
	private double kg;
	private Trainer trainer;
	
	public Carnivore(String type, int age, double kg, Trainer trainer) {
		this.type = type;
		this.age = age;
		this.kg = kg;
		this.trainer = trainer;
	}
	
	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public double getKg() {
		return kg;
	}


	public void setKg(double kg) {
		this.kg = kg;
	}

	public Trainer getTrainer() {
		return trainer;
	}

	public void setTrainer(Trainer trainer) {
		this.trainer = trainer;
	}

	@Override
	public void info() {
		
	}

}
