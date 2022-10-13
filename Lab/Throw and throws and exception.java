//Name: Vignesh.M
//Batch:2576
class invaildAgeException extend Exception
{
InvailAgeException(String s)
{
	super(s);
}
}
class textCustomException
{
staic void validate(int age)
{
	if(age<18)
		throw new ArithmethicException("not valid");
		else
			System.out.println("welcome to vote");
}
          public static void main(String[] args) 
		  {
		  try
		  {
			validate(15);
		  }
		  catch(Exception m)
		  {
		     System.out.println("Exception occured:"+m);
		  }
		   System.out.println("rest of code...");
}
}
