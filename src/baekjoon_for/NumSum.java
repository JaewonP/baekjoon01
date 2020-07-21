package baekjoon_for;
import java.io.BufferedReader;
import java.util.StringTokenizer;
import java.io.IOException;
import java.io.InputStreamReader;

public class NumSum {

	public static void main(String[] args) throws IOException {
	
		/*// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int T = scanner.nextInt();
		
		for (int i=0 ; i<T; i++) {
			int A = scanner.nextInt();
			int B = scanner.nextInt();
			
			System.out.println("Case #" + (i+1) + " : " + (A+B) + "\n");
		}
		
		scanner.close();
		
	}
	*/
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		
		StringTokenizer st;
		
		for(int i =1; i<= T ; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			System.out.println("Case #" + i + ": " +
					(Integer.parseInt(st.nextToken()) +
							Integer.parseInt(st.nextToken())));
		}
		
			br.close();
			
			
		
	}

}
