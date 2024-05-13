package vinisaoswan;

import java.util.Scanner;

public class supertest {

	public static void main(String[] args) {

		final int MAX = 3;
		double[] scores = new double[MAX];
		String[] names = {"Vinicius", "Hugo", "Pedro"};
		Scanner scan = new Scanner(System.in);
		double total = 0.0;
		double avg = 0.0;
		
		for (int i = 0; i < scores.length; i++) {
			System.out.println("Enter a value " + i + ": ");
			scores[i] = scan.nextDouble();
			total += scores[i];
		}
		
		for(int i = 0; i < scores.length; i++) {
			System.out.println(names[i] + " " + "Scores: " + (i+1) + " " + scores[i]);
		}
		
		System.out.println("Total value: " + total);
		System.out.println("Avarage value: " + Math.round(total)/3);
	}

}
