package test3;
import java.util.Scanner;
public class jva3 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter number ");
		int a=sc.nextInt();
		int n=0;
		if(a%2==0) 
		{
			n=a-1;
		}else {n=a;}
	    int count=n;
		for(int i=0;count>0;i++)
		{if(i%2!=0)
			{System.out.println(i);
			 count--;
			}
		}
		
		
		
		

	}

}
