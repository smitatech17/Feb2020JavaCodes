package JavaSessions;

public class LoopsConcept {

	public static void main(String[] args) {

		//print from 1 to 10
		//1. while loop:
		//i is counter
		int i = 1;//initialization
		while(i<=10) {//conditional 
			System.out.println(i);//1 2 3...10
			i++;//incremental/decremental
			
		}
		
		System.out.println("------");
		//WAP from 10 to 1:
		int m = 10;
		while(m>=1) {
			System.out.println(m);
			m--;
		}
		
		//no initialization, no conditional, no incremental/decremental so infinite loop
		//while(true) {
		//	System.out.println("Bye!!!");
		//}
		
		
		
		//2. for loop: 1 to 10
		//j is counter
		for(int j=1; j<=10; j++) {
			System.out.println(j);//1 2 3...10
		}
		
		//interview question
		//no initialization, no conditional, no incremental/decremental, so will be infinite loop
		//for(; ;) {
		//	System.out.println("Hey!!");
		//}
		
		System.out.println("---even numbers---");
		//even numbers between 1 to 10
		for(int e = 2; e<=10; e=e+2) { //2 4 6 8 10
			System.out.println(e);
		}
		
		System.out.println("---odd numbers----");
		//odd numbers between 1 to 10
		for(int odd = 1; odd<=10; odd=odd+2) {
			System.out.println(odd);//1 3 5 7 9 
		}
		
		
		System.out.println("----for if -----");
		//for with if:
		//break loop when my condition is satisfied
		for(int k=1; k<=10; k++) {
			
			if(k % 2 == 0) {
			System.out.println(k);
		}
		}
		
		System.out.println("---for if -2nd ex-----");
		
		for(int d=1; d<=100; d++) {
			System.out.println(d);
			if(d % 5 == 0) {
				System.out.println("this is divisible by 5");
				break;//come out of the for loop
			}
		}
		
		//3. do-while loop: printing from 10 to 1
		int p = 10;
		do {
			System.out.println(p);//10 9 8 .....1
			p--;
		}
		while(p>=1);
		
		
	}

}

