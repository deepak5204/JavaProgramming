import java.util.*;
public class PrintDataTypes {
	public static void main(String []argh)
    {
//        Scanner sc = new Scanner(System.in);
//        int t=sc.nextInt();
//        for(int i=0;i<t;i++)
//        {
//            try
//            {
//                long x=sc.nextLong();
////                System.out.println((Integer.SIZE)/8 + "byte");
//                
//                System.out.println(x+" can be fitted in:");
//                if(x>=-128 && x<=127)  
//                    System.out.println("* byte");
//                if(x>=-32768 && x<= 32767)
//                    System.out.println("* short");
//                if(x>=-2147483648 && x<= 2147483647)
//                    System.out.println("* int");
//                if(x>=-9223372036854778.0 && x<= 9223372036854777.0)                                   System.out.println("* long");       
//            }
//            catch(Exception e)
//            {
//                System.out.println(sc.next()+" can't be fitted anywhere.");
//            }
//        }
		
		 Scanner sc = new Scanner(System.in);
		    int t=sc.nextInt();

		    for(int i=0;i<t;i++)
		    {

		        try
		        {
		            long x=sc.nextLong();
		            System.out.println(x+" can be fitted in:");
		            if(x>=-128 && x<=127)System.out.println("* byte");
		            //Complete the code
		            if(x >= -Math.pow(2, 15) && x <= Math.pow(2, 15) - 1)
		                System.out.println("* short");
		            if(x >= -Math.pow(2, 31) && x <= Math.pow(2, 31) - 1)
		                System.out.println("* int");
		            if(x >= -Math.pow(2, 63) && x <= Math.pow(2, 63) - 1)
		                System.out.println("* long");
		        }
		        catch(Exception e)
		        {
		            System.out.println(sc.next()+" can't be fitted anywhere.");
		        }

		    }
		}
    }


