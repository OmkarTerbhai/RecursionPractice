import java.util.Scanner;

public class Power {
	
	private static int power(int a, int b) {
		if(b == 0) {
			return 1;
		}
		
		return a * power(a, b-1);
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int b = in.nextInt();
		System.out.println(power(a, b));
	}
	
	
}
