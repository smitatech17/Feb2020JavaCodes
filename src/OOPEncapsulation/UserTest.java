package OOPEncapsulation;

public class UserTest {

	public static void main(String[] args) {
		
		User u1 = new User();
		u1.setName("Tom");
		u1.setAge(25);
		u1.setPhone(1989898);
		
		System.out.println(u1.getName() + " " + u1.getAge() + " " + u1.getPhone());
				
		u1.getUserSalaryInfo();
		
		
		
	}

}
