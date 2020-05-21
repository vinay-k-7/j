package test2;
import java.util.Scanner;
public class Jv2 {
	public static void main(String[] args) {
		 Scanner sc =new Scanner(System.in);
		 System.out.println("enter a number");
		 int a=sc.nextInt();
		 int count=a;
		 for(int i=0;count>0;i++) {
			 if(i%2==1&&i%5!=0) {
				 System.out.println(i);
			     count--;
			 }
		 }
		 
	}

}
