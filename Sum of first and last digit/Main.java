import java.util.Scanner;
class Main {
	public static void main (String[] args){
    Scanner sc = new Scanner(System.in);
      int n=sc.nextInt();
      int last_digit = n % 10;
      while ( n > 10 )
      {
        n = n /10;
      }
      int sum= n + last_digit;
      System.out.println(sum);
    }
}