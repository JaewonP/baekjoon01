package baekjoon_train;

import java.util.Scanner;

public class Star9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scr = new Scanner(System.in);
		int a = scr.nextInt();
		int b = (2*a)-1;
		int k = b;
		
		for(int i=0; i < a; i++) {
			for(int j = 0 ; j < b; j++ ) {
				if(i > 0 && j < i) {
				System.out.print(" ");
				}
				else {
				System.out.print("*");
				}
			}
			System.out.print("\n");
			b--;
		}
		
		for(int i = 2; i <= a; i++) {
			for(int j = 1 ; j <= k; j++) {
				if( a>j-i && a<j+i ) {
					System.out.print("*");
					}
				
				else {
					System.out.print(" ");
					}
			}
			System.out.print("\n");
			
		}
		
	}

}
