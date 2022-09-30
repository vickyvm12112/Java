//Name: Vignesh.M
//Batch:2576
//'this' keywords constructor chaning
class This
{
	This()
	{
		System.out.println("this keywords constructor chaining");
	}
		This(int x)
		{
			this();
			System.out.println("x="+x);
		}
		class cntrchain
		{
			public static void main(String[] args)
			{
				This a=new This(1234);
			}
		}
}

		
		