package online.org;
import java.util.Scanner;
public class test1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int a=sc.nextInt();
		for(int i=1;i<=a;i++)
		{
			int k=1;
			for(int j=1;j<=a;j++)
			{
				if(i>=j)
				{   
					if(i%2==1)
						{System.out.print(k+" ");k++;}
					if(i%2==0) 
					{
						int l=i-k+1;
						System.out.print(l+" ");
						k++;
					}
				}    
			}
			System.out.println();
		}
		for(int i=2;i<=a;i++)
		{
			
			
			for(int j=1;j<=a;j++)
			{
				int k=a-j+1;
				
				if(i+j<=a+1)
				{
					if(i%2==1) {
						int x=a-i+1;
						System.out.print(x+" ");k++;}
					if(i%2==0)
					{
					int l=a-k+1;
					System.out.print(l+" ");k++;}
				}    
			}
			System.out.println();
		}
		

	}

}
