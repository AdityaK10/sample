import java.util.Scanner;

public class Extract_Num_from_String {

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string with numbers: \n");
		String str1=sc.nextLine();
		System.out.println("The entered string is: "+str1);
		str1=str1.replaceAll("[^\\d]", " ");
		str1=str1.trim();
		str1=str1.replaceAll(" +", " ");
		String str[]=str1.split("\\s+");
		int sum=0;
		for(int i=0;i<str.length;i++)
		{
			if(i==0)				
				System.out.println("The "+(i+1)+"st number is: "+str[i]);
			else if(i==1)
				System.out.println("The "+(i+1)+"nd number is: "+str[i]);	
			else if(i==2)
				System.out.println("The "+(i+1)+"rd number is: "+str[i]);
			else
				System.out.println("The "+(i+1)+"th number is: "+str[i]);
			int temp=Integer.parseInt(str[i]);
			sum=sum+temp;
		}
		System.out.println("The addition of all the numbers from the string is: "+sum);
		sc.close();
	}
	
}
