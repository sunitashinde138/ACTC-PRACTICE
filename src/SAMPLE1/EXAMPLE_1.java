package SAMPLE1;

public class EXAMPLE_1
{

	public static void main(String[] args)
	{
		//array declaration
		String ar[]=new String[5];
		// array initialization
		ar[0]="Sunita";
		ar[1]="Harshali";	
		ar[2]="Vedanti";
		ar[3]="Shardul";
		ar[4]="Naitik";
		//usage
		System.out.println("...printing all info in array without for loop...");
		System.out.println(ar[0]);
		System.out.println(ar[1]);
		System.out.println(ar[2]);
		System.out.println(ar[3]);
		System.out.println(ar[4]);
		
		
		System.out.println(ar.length);
		System.out.println(ar.length-1);
		
		
		System.out.println("...printing all info in array without for loop...");
		for(int i=0;i<=(ar.length-1);i++)
		{
			System.out.println(ar[i]);
		}
		
		}

}



