package JavaSessions;

public class IncrementalAndDecrementalConcept {

	public static void main(String[] args) {
		
		//++ increase the value by 1
		//-- decrease the value by 1
		
		int x = 1;
		int y = x++; //post increment - first give the original value of x to y and then increase the value of x by 1
		
		System.out.println(x); //2
		System.out.println(y); //1
		
		int p = -1;
		int q = p++; //post increment
		System.out.println(p); //0
		System.out.println(q); //-1
		
		//pre increment:
		int a = 1;
		int b = ++a; //pre increment -  first increase the value of a and give the increased value to b
		
		System.out.println(a); //2
		System.out.println(b); //2
		
		int h = -1;
		int g = ++h;//pre increment
		
		System.out.println(h);//0
		System.out.println(g);//0
		
		int m = 2;
		int n = m--; //post decrement
		
		System.out.println(m);//1
		System.out.println(n);//2

		int k = -3;
		int l = --k; //pre decrement
		
		System.out.println(k);//-4
		System.out.println(l);//-4
		
		
		
		
	}

}
