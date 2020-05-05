package JavaSessions;

public class ArrayConcept {

	public static void main(String[] args) {
		//lowest index is always 0
		
		//limitations of array:
		//1. static array : size of array is fixed; and if you are using only few of the values then you are wasting the remaining /unused spaces; couldn't add the new values beyond the highest index
		//2. can store only similar types of data
		//to solve these limitations, we use ArrayList (Dynamic Array)
		
		//1. int array
		int i[] = new int[4];
		i[0] = 10;
		i[1] = 20;
		i[2] = 30;
		i[3] = 40;
		//i[4] = 50;
		
		System.out.println(i[1]);
		System.out.println(i[1]+i[2]);
		//System.out.println(i[4]); //ArrayIndexOutOfBoundException - array is getting beyond the limits, trying to print the values which are not in memory
		//could not print the value above the highest index or before lowest index - 0
		
		//length of the array
		//length of array  = highest index + 1
		//highest index = length of the array - 1
		System.out.println(i.length);
		int len = i.length;
		int HI = len - 1;
		System.out.println(HI);
		
		//to print all the values of array: for loop
		for(int k=0; k<i.length; k++) {
			System.out.println(i[k]);
		}
		for(int k=0; k<=i.length-1; k++) {
			System.out.println(i[k]);
		}
		
		int p[] = new int[10];
		p[0] = 100;
		p[1] = 200;
		p[8] = 800;
		System.out.println(p[2]);
		System.out.println(p[6]);
		System.out.println(p[8]);
		System.out.println(p[9]);
		//System.out.println(p[10]); - ArrayIndexOutOfBoundException 
		//default value of int is '0'; double is '0.0'; string is 'null', boolean is 'false', char is 'empty/nothing'
		
		//2.double array:
		double d[] = new double[3];
		d[0] = 12.33;
		d[1] = 100;
		
		System.out.println(d[0]);
		System.out.println(d[1]);
		System.out.println(d[2]);//default value of double is '0.0'
		
		//char array:
		char c[] = new char[2];
		System.out.println(c[0]);//default value of char is nothing/empty
		System.out.println(c[0] + c[1]); // answer is 0
		
		//boolean array:
		boolean b[] = new boolean[2];
		System.out.println(b[0]);//default value is 'false'
		
		//string array:
		String str[] = new String[4];
		str[0] = "Java";
		str[1] = "Python";
		str[2] = "Ruby";
		
		System.out.println(str[0]);
		System.out.println(str[3]);//default of value is 'null'
		
		for(int z=0; z<str.length; z++) {
			System.out.println(str[z]);
		}

		
		//Object Array:
		//Object is a class in java and store different types of data
		Object ob[] = new Object[5];
		ob[0] = "Steve";
		ob[1] = 25;
		ob[2] = 12.33;
		ob[3] = true;
		ob[4] = 'm';
		
		for(int v=0; v<=ob.length-1; v++) {
			System.out.println(ob[v]);
		}
		
	}

}
