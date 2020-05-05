package JavaSessions;

public class Student {
	
	String name;
	int age;
	int id;

	public Student(String name, int age, int id) {
		this.name = name;
		this.age = age;
		this.id = id;
	}

	public static void main(String[] args) {

		Student s1 = new Student("Bibek", 24, 10);
		Student s2 = new Student("Anita", 25, 20);
		Student s3 = new Student("Jaya", 26, 30);
		
		System.out.println(s1.name + " " + s1.age + " " + s1.id);
		System.out.println(s2.name + " " + s2.age + " " + s2.id);
		System.out.println(s3.name + " " + s3.age + " " + s3.id);
		
		//reference transferring: switching the reference from one object to another object; we can do it in java
		s1 = s2;
		
		System.out.println(s1.name + " " + s1.age + " " + s1.id);
		System.out.println(s2.name + " " + s2.age + " " + s2.id);
		System.out.println(s3.name + " " + s3.age + " " + s3.id);
		
		s2 = s3;
		
		System.out.println(s1.name + " " + s1.age + " " + s1.id);
		System.out.println(s2.name + " " + s2.age + " " + s2.id);
		System.out.println(s3.name + " " + s3.age + " " + s3.id);
		
		s3 = s1;
		
		System.out.println(s1.name + " " + s1.age + " " + s1.id);
		System.out.println(s2.name + " " + s2.age + " " + s2.id);
		System.out.println(s3.name + " " + s3.age + " " + s3.id);
		
	}

}
