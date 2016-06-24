package jp.co.fujita.model;

public class Student {

	private String name;
	private int sex;

	public Student(String name, int sex) {
		this.name = name;
		this.sex = sex;
	}

	public String getName() {
		return this.name;
	}

	public int getSex() {
		return this.sex;
	}

}
