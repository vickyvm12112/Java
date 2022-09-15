//Name: Vignesh.M
//Batch:2576
//reverse number
import java.util.Scanner;
class Reverse
{
	public static void main(String[] args)
	{
		int n,rev=0;
		System.out.println("Enter any number:");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		
		while(n>0);
		{ 
	      rev=(rev*10)+n%10;
		  n=n/10;
		}
		System.out.println("reverse:"+rev);
	}
}