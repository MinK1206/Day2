import java.util.Scanner;
class SimpleArithmetic
{
  public static void main(String[] args)
  {
    Scanner scan = new Scanner (System.in);
    System.out.println ("enter your number");
    int a = scan.nextInt();
    System.out.println ("enter your number");
    int b = scan.nextInt();
    
    System.out.println (a+b);
    
  }   
}