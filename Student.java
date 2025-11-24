package tes;
public class  Student {
	private int id;
	private String name;
	private int age;
	private double gpa;

	public  Student() {
		name = "NA";
		id = 123456;
		age = 20;
		gpa = 1;

	}

	public  Student(int id, String name, int age, double gpa) {
		setId(id);
		setName(name);
		setAge(age);
		setGpa(gpa);

	}

	public void setId(int id) {
		String strId = Integer.toString(id);
		if (strId.length() == 6) {
			this.id = id;

		} else
			System.out.println("Incorrect Id");

	}

	public int getId() {
		return id;
	}

	public void setName(String name) {
		this.name = name;

	}

	public String getName() {
		return name;

	}

	public void setAge(int age) {
		if (age > 0) {
			this.age = age;
		} else
			System.out.println("Incorrect age");

	}

	public int getAge() {
		return age;

	}

	public void setGpa(double gpa) {
		if (gpa >= 1 && gpa <= 5) {
			this.gpa = gpa;
		} else
			System.out.println("Incorrect gpa");

	}

	public double getGpa() {
		return gpa;

	}

	public String getGrade() {

		if (gpa >= 4.75 && gpa <= 5) {
			return "Excellent";
		} else if (gpa >= 4 && gpa < 4.75) {
			return "Very Good";
		} else if (gpa >= 3 && gpa < 4) {
			return "Good";
		} else if (gpa >= 2 && gpa < 3) {
			return "Pass";
		} else
			return "fail";
	}

	public void display() {
		System.out.print("ID: " + id);
		System.out.print(", Name: " + name);
		System.out.print(", Age: " + age);
		System.out.print(", Gpa: " + gpa);
		System.out.print(" (" + getGrade() + ")");
	}

	public int compare( Student stud) {
		if (gpa > stud.gpa)
			return 1;
		else if (gpa == stud.gpa)
			return 0;
		else
			return -1;

	}
	
	

	
	}
	


