//Name: Vignesh.M
//Batch:2576
//
import java.util.Scanner;
 class Result
 {
	 public static void main(String[] args)
	 {
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter the Student name=");
	  sname=sc.nextString();
	  System.out.println("Enter the 1st subject mark:");
	  s1=sc.nextInt();
	  System.out.println("Enter the 2st subject mark:");
	  s2=sc.nextInt();
	  System.out.println("Enter the 3st subject mark:");
	  s3=sc.nextInt();
	  System.out.println("Enter the 4st subject mark:");
	  s4=sc.nextInt();
	  System.out.println("Enter the 5st subject mark:");
	  s5=sc.nextInt();
	  int total=(s1+" "+s2+" "+s3+" "+s4+" "+s5);
	  double avg=total/5;
	  System.out.println("Your mark:"+tolal);
	  System.out.println("Your Average:"+avg);
	  
	   if(avg>=40)
	 {
		 System.out.println("Pass");
	 }
	 else
	 {
		 System.out.println("Fail");
	 }
	}
}
		