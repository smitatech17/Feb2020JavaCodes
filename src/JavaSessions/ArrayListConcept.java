package JavaSessions;

import java.util.ArrayList;

public class ArrayListConcept {

	public static void main(String[] args) {
		
		//ArrayList - default class in java; already present in java
		//dynamic array
		//create the object of ArrayList class
		//ArrayList class is available in java.util package in JDK and have to import ArrayList class to use it
		
		ArrayList ar = new ArrayList();
		System.out.println(ar.size());//0; calculate the physical memory allocation, not the virtual capacity
		
		//add method is available in ArrayList class
		//add on the basis of indexing, in order
		ar.add(100);//0
		ar.add(200);//1
		
		System.out.println(ar.size());//.size method is for ArrayList and will give the physical capacity; .length is for static array
		
		ar.add(300);//2
		ar.add(400);//3
		System.out.println(ar.size());// physical capacity is 2 but the virtual capacity is 8; virtual capacity = 10-physical capacity
		
		ar.add(500);//4
		ar.add(600);//5
		ar.add(600);//6
		
		//to print all the values of ArrayList: For loop
		for(int f=0; f<ar.size();f++) {
			System.out.println(ar.get(f));
		}
		
		
		//System.out.println(ar.size());
		
		//.get method in ArrayList to get the value
		//System.out.println(ar.get(0));
		//System.out.println(ar.get(4));
		//System.out.println(ar.get(7));//IndexOutOfBoundException
		
		
		//.remove method in ArrayList to delete the entire index; the lower value will be shifted upward
		//ar.remove(4);
		//System.out.println(ar.size());
		//System.out.println(ar.get(4));
		//System.out.println(ar.get(6));//IndexOutOfBoundException
		
		//ar.add("Smita");
		//ar.add(30);
		//ar.add('F');
		
		//virtual capacity/default size of ArrayList is 10
		
		//ArrayList with integer:
		ArrayList<Integer> marksList = new ArrayList<Integer>(); //this concept is called generic and is to restrict the other types of data types. Integer is a class and can only store integer
		marksList.add(10);
		//marksList.add("test");//not allowed with another data types, only with integer
		marksList.add(20);
		
		ArrayList<String> studentList = new ArrayList<String>();
		studentList.add("Tom");
		studentList.add("Steve");
		
		ArrayList<Object> empList = new ArrayList<Object>();//ArrayList created with generics of Object
		empList.add("Tom");
		empList.add(25);
		empList.add('m');
		empList.add(true);
		
	}

}
