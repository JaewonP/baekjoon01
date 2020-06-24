package baekjoon_if;

import java.util.Scanner;

public class quadrant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		int x = scanner.nextInt();
		int y = scanner.nextInt();
		
		// x 양수 : y 양수
		// x 양수 : y 음수
		while(x > 0 && x <= 1000) 
		{
			if(y > 0 && y <= 1000)
			{
				System.out.println("1");
			}
			else {
				System.out.println("4");
			}
		 break;
		}
		
		// x 음수 : y 양수
		// x 음수 : y 음수
		
		while(x<0 && x>= -1000) {
			
			if(y > 0 && y <= 1000) {
				System.out.println("2");
			}
			else {
				System.out.println("3");
			}
			
		break;	
		}
		
		scanner.close();
		
	}

}
