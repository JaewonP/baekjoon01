package baekjoon_for;
import java.util.Scanner;


public class Gugudan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		//N을 입력받은 뒤, 구구단 N을 출력하는 프로그램 작성
		//N은 1보다 크거나 같고, 9보다 작거나 같다. 
		
		int N = scanner.nextInt();
		
		for(int i = N; i <=N ; i++) {
			for(int j =1; j <=9; j++) {
			System.out.println(N + "x" + j + "=" + N*j);
			}
		}
		
		
	}

}
