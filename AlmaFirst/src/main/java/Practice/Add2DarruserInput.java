package Practice;
import java.util.Scanner;
public class Add2DarruserInput {
	public static void main(String args[]) {
		int a[][] = new int[3][3];
		Scanner s = new Scanner(System.in);
		System.out.println("enter values of array a");
		 for(int i=0;i<a.length;i++) {
	    	  for(int j=0;j<a[i].length;j++) {
	    	  a[i][j] = s.nextInt();
	      }
	}
		 System.out.println("Array a = ");
		 for(int i=0;i<a.length;i++) {
	    	  for(int j=0;j<a[i].length;j++) {
	    	  System.out.print(a[i][j]+" ");
	      }
	    	  System.out.println();
}
		 int b[][] = new int[3][3];
			Scanner sb = new Scanner(System.in);
			System.out.println("enter values of array b");
			 for(int i=0;i<b.length;i++) {
		    	  for(int j=0;j<b[i].length;j++) {
		    	  b[i][j] = sb.nextInt();
		      }
		}
			 System.out.println("Array b = ");
			 for(int i=0;i<b.length;i++) {
		    	  for(int j=0;j<a[i].length;j++) {
		    	  System.out.print(b[i][j]+" ");
		      }
		    	  System.out.println();
}
			 s.close();
			 sb.close();
			 int c[][] =new int[3][3];
			 for(int i=0;i<c.length;i++) {
				 for(int j=0;j<c[i].length;j++) {
					 c[i][j] = a[i][j] + b[i][j];
				 }
				 System.out.println();
			 }
			 System.out.println("Addition of array 'a' and 'b'");
			 for(int i=0;i<c.length;i++) {
				 for(int j=0;j<c[i].length;j++) {
					 System.out.print(c[i][j]+" ");
			 }
				 System.out.println();
					 }}}