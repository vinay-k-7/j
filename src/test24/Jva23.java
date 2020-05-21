package test24;
import java.util.Scanner;
public class Jva23 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the number");
		int a=sc.nextInt();
		int[] x=new int[a];
		int od=0;
		int en=0;
		System.out.println("enter the variables");
		for(int i=0;i<a;i++)
		{
			x[i]=sc.nextInt();
		}
		for(int i=0;i<a;i++)
		{if(x[i]%2==0)
			en++;
		else 
			od++;
		}
		System.out.println("total odd number is "+od+" total even numbers is "+en);
	}

}
