package baekjoon_for;

import java.util.Scanner;

public class NumSum2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner scanner = new Scanner(System.in);
		int T = scanner.nextInt();
		
		for (int i=0 ; i<T; i++) {
			int A = scanner.nextInt();
			int B = scanner.nextInt();
			 
			System.out.println("Case #" + (i+1) + ": " + A + " + " + B + " = " + (A+B));
		}
		
		scanner.close();

	}

}
