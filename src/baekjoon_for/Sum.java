package baekjoon_for;

import java.util.Scanner;

public class Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		int testCase = scanner.nextInt();
		
		for(int i = 0; i < testCase; i++) {
			int A = scanner.nextInt();
			int B = scanner.nextInt();
			
			System.out.println(A + B);	
		}
		

		
	}

}
