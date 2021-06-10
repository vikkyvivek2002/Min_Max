import java.util.Scanner;
class Min_Max
{
public static void main(String[] args)
{
 Scanner s = new Scanner(System.in);
 int n = s.nextInt();
 int rem = 0, min=10,max=3;
 while(n!=0)
{
 rem=n%10;
 if(rem>max)
 max = rem;
 else if (rem<min)
 min = rem;
 n=n/10;
}
System.out.println("max = "+max);
System.out.println("min = "+min);
}
}