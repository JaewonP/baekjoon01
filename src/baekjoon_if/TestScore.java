package baekjoon_if;

import java.util.Scanner;

public class TestScore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("시험성적은 0보다 크거나 같고 100보다 작거나 같다.");		

		Scanner scanner = new Scanner(System.in);
		
		int A = scanner.nextInt();


		while(A >=0 && A <= 100)

		{
			if(A<=100 && A>=90)
			{
				System.out.println("A");
			}
			
			else if(A<=89 && A>=80)
			{
				System.out.println("B");
			}
			
			else if(A<=79 && A>=70)
			{
				System.out.println("C");
			}
			
			else if(A<=69 && A>=60)
			{
				System.out.println("D");
			}
			else 
			{
			  System.out.println("F");
			}
		
			 break;
		
		}
		scanner.close();
	
		
	}

}
