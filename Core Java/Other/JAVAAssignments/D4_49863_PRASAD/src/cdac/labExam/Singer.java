package cdac.labExam;

public class Singer {

	String name,gender,email_id,contact;
	int age,rating;
	
	public Singer() {
		super();
	}
	
	public Singer(String name, String gender, String email_id, String contact, int age, int rating) {
		super();
		this.name = name;
		this.gender = gender;
		this.email_id = email_id;
		this.contact = contact;
		this.age = age;
		this.rating = rating;
	}
	@Override
	public String toString() {
		return "Singer [name=" + name + ", gender=" + gender + ", email_id=" + email_id + ", contact=" + contact
				+ ", age=" + age + ", rating=" + rating + "]";
	}
	
	
	
}
