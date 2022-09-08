//Name: Vignesh.M
//Batch:2576
// All operators
class Operators
{
	public static void main(String[] args)
	{
	int a,b,c;
	System.out.println("Enter the two number...");
	Scanner obj=new Scanner(System.in);
	a=obj.nextInt();
	b=obj.nextInt();
	System.out.println("Arithmetic" +(a+b));
	a=obj.nextInt();
	b=obj.nextInt();
	System.out.println("assignment" +(z=a+b-2));
    a=obj.nextInt();
	b=obj.nextInt();
	System.out.println("multiple " +(a+=b));
	a=obj.nextInt();
	b=obj.nextInt();
	System.out.println("relational" +(a<b));
	a=obj.nextInt();
	b=obj.nextInt();
	System.out.println("logical" +(a&&b));
	a=obj.nextInt();
	b=obj.nextInt();
	System.out.println("unary" +(a++));
	a=obj.nextInt();
	b=obj.nextInt();
	System.out.println("ternary" +(a<b?));
	a=obj.nextInt();
	b=obj.nextInt();
	System.out.println("bitwise" +(a&b));
	a=obj.nextInt();
	b=obj.nextInt();
	System.out.println(a+" "+b+" "+c);
	
	}
}

