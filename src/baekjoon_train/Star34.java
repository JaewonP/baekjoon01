package baekjoon_train;

import java.util.Scanner;

public class Star34 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner scr = new Scanner(System.in);
		int a = scr.nextInt();
		int b = (2*a)-1;
		int k = a;
		int t =1;
		
		for(int i = 0; i < a; i++) { // 0 
			for(int j = 1 ; j < k; j++) {
				if(j <k-i ) {
					System.out.print(" ");
					}
				
				else {
					System.out.print("*");
					
					}
				
			}
			System.out.print("\n");
			k++;
			
			
		}
		
	}

}
