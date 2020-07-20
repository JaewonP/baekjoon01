package baekjoon_for;
import java.util.Scanner;

public class NumSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int T = scanner.nextInt();
		
		for (int i=1 ; i<=T; i++) {
			int A = scanner.nextInt();
			int B = scanner.nextInt();
			
			System.out.println("Case #" + i + " : " + (A+B) + "\n");
		}
		
		
	}

}
