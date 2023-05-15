package practice.marks;

public class Student {
	private String name;
	private int id;
	private Date dob;
	private int m1;
	private int m2;
	private int m3;
	
	public Student() {
		this.dob = new Date();
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public int getM1() {
		return m1;
	}
	public void setM1(int m1) {
		this.m1 = m1;
	}
	public int getM2() {
		return m2;
	}
	public void setM2(int m2) {
		this.m2 = m2;
	}
	public int getM3() {
		return m3;
	}
	public void setM3(int m3) {
		this.m3 = m3;
	}
	
	public Student(String name, int id, Date dob, int m1, int m2, int m3) {
		super();
		this.name = name;
		this.id = id;
		this.dob = dob;
		this.m1 = m1;
		this.m2 = m2;
		this.m3 = m3;
	}
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + ", dob=" + dob + ", m1=" + m1 + ", m2=" + m2 + ", m3=" + m3
				+ "]";
	}
}
