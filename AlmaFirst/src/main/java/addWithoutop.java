package practiceQ;
import java.util.Scanner;
public class addWithoutop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     //printing sum of a and b without adding them or using + op
		System.out.println("enter 2 values to add");
		Scanner s = new Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();
		s.close();
		for(int i=0;i<b;i++) {
			a++;
		}
	    System.out.println(a);
		}
	}
