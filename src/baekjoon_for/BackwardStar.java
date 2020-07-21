package baekjoon_for;
import java.util.Scanner;

public class BackwardStar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		
		for(int i = 0; i < n ; i++) {
			for(int j = n-1; j >= 0; j-- ) {
				
				if(j <= i) {
				System.out.print("*");
				}
				else 
				{
					System.out.print(" ");
				}
			}
			System.out.print("\n");
		}
		
		
	}

}
