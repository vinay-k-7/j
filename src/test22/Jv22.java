package test22;
import java.util.Scanner;
public class Jv22 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		 System.out.println("enter a number"); 
		 int n=sc.nextInt();
		 for(int i=1;i<=n;i++)
		 { 
			 int k=1;
			 for(int j=1;j<=n;j++)
			 { 
				 if(j<=i) 
				 { 
					 if(i%2==0)
						 {
						  int l=i-k+1; 
						  if(j==1) {
						   System.out.print(l); k++;}
							 else {
								 System.out.print("*"+ l); k++;}
						 }
					 else if(i%2==1) 
						{
						 if(j==1) {
							   System.out.print(k); k++;}
								 else {
									 System.out.print("*"+ k); k++; }
						 }
		
				 
			     }
			     else System.out.print(" ");
				 
			 }
		 System.out.println();
		 }
	}

}
