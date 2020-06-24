package baekjoon_if;

import java.util.Scanner;

public class CompareTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		int A = scanner.nextInt();
		int B = scanner.nextInt();
		
		while (-10000 <= A&&B <=10000)
		{
		
		if(A>B)
		{
		
			System.out.println(">");
		}
		if(A<B)
		{
		
			System.out.println("<");
		}
		if(A == B)
		{
			System.out.println("==");
		}
		break;
		
		}
	

	}

}
