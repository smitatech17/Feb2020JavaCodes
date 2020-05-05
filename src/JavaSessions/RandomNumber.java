package JavaSessions;

import java.util.Random;

public class RandomNumber {

	int max;
	int min;
	
	public static void main(String[] args) {

		RandomNumber number = new RandomNumber();
		number.generateRandomNumbers(10);
		
	}
	public void generateRandomNumbers(int n) {
		max = n;
		min = 1;
		for(int i=1; i<=n; i++) {
			Random rand = new Random();
			int randomNum = min + rand.nextInt((max-min) + 1);
			System.out.println(randomNum);
		}
	}
}
