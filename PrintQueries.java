import java.util.*;
public class PrintQueries {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int q = s.nextInt();
		for( int i = 0; i < q; i++) {
			
			int a = s.nextInt();
			int b = s.nextInt();
			int n = s.nextInt();
			
		for(int j = 0; j < n; j++) {
			a = a+b;
			System.out.print(a+" ");
			b = b * 2;
		}
		if(i<= q) {
			a = 0;
			b = 0;
			n = 0;
		}
		}

	}

}
