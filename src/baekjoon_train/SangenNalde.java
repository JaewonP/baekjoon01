package baekjoon_train;
import java.util.Scanner;


public class SangenNalde {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		

		int bugU = scanner.nextInt();
		int bugM = scanner.nextInt();
		int bugL = scanner.nextInt();
		
		int cola = scanner.nextInt();
		int sida = scanner.nextInt();
		
		int temp = 0;
		int sum1 = (bugU + cola) - 50;
		int sum2 = (bugM + cola) - 50;
		int sum3 = (bugL + cola) - 50;
		int sum4 = (bugU + sida) - 50;
		int sum5 = (bugM + sida) - 50;
		int sum6 = (bugL + sida) - 50;
		
		
		//그냥 배열로 풀어도 될 것 같은데
		//알고리즘...
		temp = sum1;
		if(temp > sum2){
			temp = sum2;
		}
		else if(temp > sum3) {
			temp = sum3;
		}
		else if(temp > sum4) {
			temp = sum4;
		}
		else if(temp > sum5) {
			temp = sum5;
		}
		else if (temp > sum6) {
			temp = sum6;
		}

		scanner.close();
		System.out.println(temp);

		
 }

}
