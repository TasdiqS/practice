package Practice;
import java.util.*;
public class SwitchCaseMathsOper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int n1,n2,c;
     System.out.println("Enter values of n1 and n2.");
     Scanner s = new Scanner(System.in);
     n1 = s.nextInt();
     n2 = s.nextInt();
     System.out.println("Please enter operator as '+' '-' or '*' to perform mathematical operations on n1 and n2.");
     Scanner so = new Scanner(System.in);
     char op;
     op = so.next().charAt(0);
     switch(op) {
     case'+':
    	 c=n1+n2;
    	 System.out.println(n1+" + "+n2+" = "+c);
         break;
     case'-':
    	 c=n1-n2;
    	 System.out.println(n1+" - "+n2+" = "+c);
         break;
     case'*':
    	 c=n1*n2;
    	 System.out.println(n1+" * "+n2+" = "+c);
         break;
     default:
    	 System.out.println("Enter '+' '-' or '*' only.");
     }
    	 System.out.println("====Thank You====");
	}

}
