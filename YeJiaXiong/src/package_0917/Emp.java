package package_0917;

import java.text.DateFormat;
import java.util.Date;

public class Emp {
	private String name;
	private int age;
	private String gender;
	private int salary;
	private Date hiredate;

	public Emp() {

	}

	public Emp(String name, int age, String gender, int salary, Date hiredate) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.salary = salary;
		this.hiredate = hiredate;
	}

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

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public Date getHiredate() {
		return hiredate;
	}

	public void setHiredate(Date hiredate) {
		this.hiredate = hiredate;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "姓名:" + this.name + ",年龄:" + this.age + ",性别:" + this.gender + ",薪资:" + this.salary + ",入职时间:"
				+ DateFormat.getDateInstance().format(this.hiredate);
	}

	@Override
	public boolean equals(Object o) {
		Emp emp = (Emp) o;
		// TODO Auto-generated method stub
		return this.name == emp.name && this.age == emp.age && this.gender == emp.gender && this.salary == emp.salary;
	}

	public static void main(String[] args) {
		Emp e = new Emp("1", 1, "1", 122, null);
		Emp e2 = new Emp("1", 1, "1", 122, null);
		System.out.println(e.equals(e2));
	}
}
