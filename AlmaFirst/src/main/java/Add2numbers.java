import java.util.Scanner;
public class Add2numbers
{
	public static void main(String[] args) 
	{
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter two numbers");
		int a = reader.nextInt();
		int b = reader.nextInt();
		int sum = a + b;
		System.out.print("The sum is: " +sum);
		}
}