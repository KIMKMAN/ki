package io.objectstream;

import java.io.Serializable;

// 직열화 : 객체가 스트림을 통과하기 위해서

public class Person implements Serializable { // Serializable 추상신호 이기때문에 메소드 존재 x

	private String name;
	private int age;
	private double height;
 	private char bloodType;
 	
 	// 다른곳에서 접근하지 못하게 private로 사용하고 setter ,getter로  캡슐화
 	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public char getBloodType() {
		return bloodType;
	}
	public void setBloodType(char bloodType) {
		this.bloodType = bloodType;
	}
}
