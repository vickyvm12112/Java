//Name: Vignesh.M
//Batch:2576
import java.util.Scanner;
class Student
{
	public static void main(String[] args)
	{
		String name;
		int id;
		double attendence;
		System.out.println("enter student name:");
		Scanner sc=new Scanner(System.in);
		name=sc.next();
		System.out.println("enter student id:");
		id=sc.nextInt();
		System.out.println("enter student attendence:");
		attendence=sc.nextDouble();
		System.out.println(name+" "+id+" "+attendence);
	}
		
}