import java.util.Scanner;
public class PrintANum
{
 public static void main(String[] args)
 {
  int num;
  Scanner reader = new Scanner(System.in);
  System.out.print("Enter a number: ");
  num = reader.nextInt();
  System.out.println("You entered: " + num);
 }
}