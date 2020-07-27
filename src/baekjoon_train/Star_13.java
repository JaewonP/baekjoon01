package baekjoon_train;

import java.util.Scanner;

public class Star_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scr = new Scanner(System.in);

		
		int a = scr.nextInt();
		
		int i=0;
		
		int b = (2*a)-1;
		
		for(i=0; i<b; i++) {
			if(i <= a-1 ) {
				for(int j=i; j >= 0; j--) {
					System.out.print("*");
				}
				System.out.print("\n");
			}
			else if(i>a-1){ //2
				for(int j= i ; j< b ; j++) {
					System.out.print("*");
				}
				
				System.out.print("\n");
			}
	
		}
		
	}

}
