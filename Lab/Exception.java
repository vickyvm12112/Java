

class Exception
{
	public static void main(String[] args)
	{
		try
		{
		  try //nullpoiner exception
		   {
			String s1=null;
			System.out.println(s1.length());
		   }
		   catch(NullPointerException e)
		   {
			System.out.println("String is null");
		   }
		   try //array intex bound of exception
		   {
			int[]={12,15,16,17,20};
			a[5]=6;
		   }
		   catch(ArrayIndexOutOfBoundsException e)
		   {
			System.out.println("array out side ring");
		   }
		}
		 catch(Exception e)
		 {
			System.out.println("handled");
	     }
		    System.out.println("normal flow");
		
	}
}
		