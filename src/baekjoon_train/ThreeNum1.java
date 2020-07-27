package baekjoon_train;

import java.util.Scanner;

public class ThreeNum1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner scr = new Scanner(System.in);
		
		int A = scr.nextInt();
		int B = scr.nextInt();
		int C = scr.nextInt();
		int first =0;
		int second=0;
		int thrid=0;
		
		if(A<=B)
		{
			 if(C<=A)
			{
				second = A;
			}
			 else if(A<C)
			 {
				 if(C<B) {
					 second = C;
				 }
				 else 
				 {
					 second = B;
				 }
			 }
		}
		else if(B <= A){
			if(C<=B) {
				second = B;
			}
			 else if(B<C)
			 {
				 if(C<A) {
					 second = C;
				 }
				 else 
				 {
					 second = A;
				 }
			 }
		
		}

		
		System.out.println(second);
		
		
	}

}
