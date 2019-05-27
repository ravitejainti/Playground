import java.util.Scanner;
class Main{
	public static void main (String[] args){
     Scanner sc = new Scanner(System.in);
      int num = sc.nextInt();
      int cpynum = num;
      int digitcount =0;
      if(num == 0)
      {
        System.out.println(num);
      }
      else
      {
       while(num >0)
       {
        digitcount++;
        num = num/10;
       }
      }
      num = cpynum;
      int sum=0;
      int pow=1;
      while(num > 0)
      {
        int rem = num%10;
        for(int count =1; count<=digitcount; count++)
        {
          pow=pow*rem;
        }
        sum = sum+ pow;
        pow = 1;
        num= num/10;
      }
      if(cpynum == sum)
      {
        System.out.println("Armstrong Number");
      }
      else{
        System.out.println("Not a Armstrong Number");
      }
       }
}