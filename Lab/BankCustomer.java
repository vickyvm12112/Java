//Name: Vignesh.M
//Batch:2576
//Bank customer details using Consructor Overoading
class BankCustomer
{
	int acno;
	String atype;
	double amt;
	BankCustomer()
	{
		accno=6355489764;
		actype="Savings";
		amt=50000;
	}
	Customer(int x,String y,double z)
	{
		accno=x;
		actype=y;
		amt=z;
	}
	void show()
	{
		System.out.println(accn+" "+actype+" "+amt);
	}
	public static void main(Sring[] args)
	{
		BankCustomer a=new BankCustomer();
		BankCustomer b=new BankCustomer(6355489764,"checkbalnce",10000);
		BankCustomer c=new BankCustomer(6355735276,"Withdraw",6000);
		a.show();
		b.show();
		c.show();
	}
}
