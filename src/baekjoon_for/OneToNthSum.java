package baekjoon_for;
import java.util.Scanner;

public class OneToNthSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt();
		int result = 0;
		
		for(int i =0; i <=n; i++) {
			result = result + i;
			
		}
		System.out.println(result);

	}

}
