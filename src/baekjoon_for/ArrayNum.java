package baekjoon_for;
import java.util.Scanner;


public class ArrayNum {

	final int MAX_NUM =100;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt();
		int x = scanner.nextInt();
		
		int A[] = new int[n];
		
		for(int i =0; i < A.length; i++) 
		{
			 A[i] = scanner.nextInt();
		}
		scanner.close();
		
		for(int i=0; i<A.length; i++) {
			if(A[i] < x) {
				System.out.println(A[i]);
			}
		}
		
	}

}
