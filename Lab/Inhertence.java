//Name: Vignesh.M
//Batch:2576
//Multiple inhertence
package inhertence;
class Red
{
	void color1()
	{
		System.out.println("Red color");
	}
}
class Green
{
	void color2()
	{
		System.out.println("Green color");
	}
}
class Yellow extends Red,Green
{
	void color3()
	{
		System.out.println("Yellow color");
	}
}
public class Inhertence
{
	public static void main(String[] args)
	{
		Yellow y=new Yellow();
		y.color1();
		y.color2();
		y.color3();
	}
}
