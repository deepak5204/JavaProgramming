import java.util.Scanner;
public class OutputFormatting {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("=======================");
	for(int i = 0; i < 3; i++) {
		String s = sc.next();
		s = s.substring(0,10);
		int x = sc.nextInt();
		if(x < 1000)
			System.out.printf("%-15s%03d\n", s, x);
	}
	System.out.println("=======================");

	}

}
