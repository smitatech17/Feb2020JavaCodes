package JavaSessions;

import java.util.ArrayList;

/**
 * 
 * @author smi_s
 *
 */
public class FuntionsInJava {
	
	//cannot create a function inside the function
	//data members of class: class variables and class methods/functions
	
	//1. simple function : having no input/parameters and no return:
	//void - cannot return anything
	//return type of this function is void
	public void test() {
		System.out.println("test method");
	}
	
	//2. Function with no input but some return:
	//return type of this particular function is int
	public int getNumber() {
		System.out.println("get number");
		int a = 10;
		int b = 20;
		int c = a+b;//30
		return c;//return is a keyword which is used to return something from a particular function
	}
	
	public String getTrainerName() {
		System.out.println("get Trainer name");
		String s = "Naveen";
		return s;
	}
	
	//3.some input parameters and some return:
	public int sum(int a, int b){//int a and int b are the parameters
		System.out.println("Sum Method");
		int z = a+b;//30
		return z;
	}
	
	//difference between parameter and argument - when you create a function, these input values are called parameters but when you called the function along with the values these are called arguments

	public int getMarks(String studentName) {
		System.out.println("get Marks" + studentName);
		int marks = -1;
		
		if(studentName.equals("Bibek")) {
			marks = 90;
		}
		else if(studentName.equals("Pavani")) {
			marks = 80;
		}
		else if (studentName.equals("Sree")) {
			marks = 95;
		}
		else {
			System.out.println("student name not found" + studentName);
			//return marks;
		}
		return marks;
	}
	/**
	 * 
	 * @param browserName
	 * @return
	 */
	//param:browserName and return browsername
	public String launchApp(String browserName) {
		String name = null;
		
		if(browserName.equals("chrome")) {
			System.out.println("launch chrome");
			name  = "chrome";
		}
		else if(browserName.equals("ff")) {
			System.out.println("launch ff");
			name = "ff";
		}
		else if(browserName.equals("ie")) {
			System.out.println("launch ie");
			name = "ie";
		}
		return name;
	}
	
	//main method is void in nature by default because there is no return statement written inside the main method
		public static void main(String[] args) {
		
		//main method cannot be stored inside the object. Object can't store which is static in nature

		FuntionsInJava obj = new FuntionsInJava();
		obj.test();
		
		int num = obj.getNumber();
		System.out.println(num);
		
		System.out.println(obj.getNumber());
		
		String s1 = obj.getTrainerName();
		System.out.println(s1);
		
		int sum1 = obj.sum(10, 20);//10 and 20 are the arguments
		System.out.println(sum1);

		int sum2 = obj.sum(40, 50);//40 and 50 are the arguments
		System.out.println(sum2);
		
		int score = obj.getMarks("Bibek");
		System.out.println(score);
		
		int score1 = obj.getMarks("Bibek");
		System.out.println(score1);
		
		String brName = obj.launchApp("chrome");
		System.out.println(brName);
		
		String brName1 = obj.launchApp("opera");
		System.out.println(brName1);
		
		int m[] = obj.getStudentMarks();
		System.out.println(m.length);
		
		ArrayList<String> EmpMSList = obj.getEmployeeList("MS");
		System.out.println(EmpMSList);
		
	}
		/**
		 * 
		 * @return marks
		 */
		
		public int[] getStudentMarks() {
			System.out.println("get student marks");
			int marks[] = new int[4];
			marks[0] = 100;
			marks[1] = 50;
			marks[2] = 60;
			marks[3] = 70;
			
			return marks;
		}
		
		/**
		 * This method returns an ArrayList of String - returns employee list on the basis of Company Name
		 * @param companyName
		 * @return this method returns an ArrayList of String - returns employee list on the basis of Company Name
		 */
		public ArrayList<String> getEmployeeList(String companyName) {
			ArrayList<String> compList = new ArrayList<String>();
			
			if(companyName.equals("IBM")){
				compList.add("Anitha");
				compList.add("Rohini");
				compList.add("Pari");
			}
			else if(companyName.equals("MS")) {
				compList.add("Santosh");
				compList.add("Sandhya");
				
			}
			else if(companyName.equals("Google")) {
				compList.add("Smita");
			}
			else {
				System.out.println("company name is not found : "+companyName);
			}
					
			return compList;
	
		}
		
		
}
