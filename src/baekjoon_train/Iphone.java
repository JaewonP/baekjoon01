package baekjoon_train;
import java.util.Scanner;


public class Iphone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int arr[] = new int[5];
		int sum =0;
		
		for(int i=0; i<5; i++) {
		
			int iphoneStudent = scanner.nextInt();
			arr[i] = iphoneStudent;
			
		}
		
		for(int i : arr) {
			if(i < 40) {
				i = 40;
			}
			sum = sum + i ;		
		}
		System.out.println(sum/5);
		
		
	}

}
