//Name: Vignesh.M
//Batch:2576
//

public class Arrayelement
 {
	 public static void main(String[] args)
	 {
		 int a[]={10,20,50,25,70};
		 int max=a[0];
		 for(int i=1; i<a.length;i++)
		 {
			 if(a[i]>max)
			 {
			 max=a[i];
			 }
		 }
		 System.out.println("maximum Arrayelement is:"+max);

         int min=a[0];
		 for(int i=1; i<a.length;i++)
		 {
			 if(a[i]<min)
			 {
			 min=a[i];
			 }
		 }
		  System.out.println("minimum Arrayelement is:"+min);
	 }
 }