package HomeWork1;

public class Lab2 {

	public static void main(String[] args) {
		// Create a student
		Student stud1 = new Student("Janelle", "33212345");
		Student stud2 = new Student("Thomas", "33222345");
		Student stud3 = new Student("Elizabeth", "33232345");
		
		stud1.enroll("Math101");
		stud1.enroll("English255");
		stud1.enroll("History211");
		
		stud1.checkBalance();
		stud1.showCourses();
		stud1.payTuition(600);
		stud1.checkBalance();
		System.out.println(stud1.toString());
	}

}

class Student {
	// Properties
	private static int iD = 0;
	private String userId;
	private String name;
	private String ssn;
	private String email;
	private String phone;
	private String city;
	private String state;


	private String courses = "";
	private static final int costOfCourse = 800;
	private int balance=0;
	
	
	public Student(String name, String ssn) {
		iD++;
		this.name = name;
		this.ssn = ssn;
		setUserId();
		setEmail();
	}
	
	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
	
	private void setEmail() {
		email = name.toLowerCase()+ "." + iD + "@sdetuniversity.com";
		System.out.println("Your email: " + email); 
	}
	
	public String getEmail(){
		return email;
	}
	
	
	private void setUserId() {
		int max = 9000;
		int min = 1000;
		int randNum =  (int) (Math.random() * ((max - min)));
		randNum = randNum + min;
		userId = iD + "" + randNum + ssn.substring(7);
		System.out.println("Your User ID: " + userId);
	}
	
	
	public void enroll(String course) {
		this.courses = this.courses + " " + course;
		System.out.println(courses);
		balance = balance + costOfCourse;
		
	}
	
	public void payTuition(int amount) {
		System.out.println("Payment: $" + amount);
		balance = balance - amount;
		
	}
	
	public void checkBalance() {
		System.out.println("Balance: $" + balance);
	}
	
	public void showCourses() {
		System.out.println(courses);
	}
	
	public String toString() {
		return "[NAME: " + name + " ]\n[COURSES: " + courses + " ]\n[BALANCE: " + balance + " ]";
				
		
	}
	
	
}
