package online.org;
import java.util.Scanner;
public class test2 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter input");
		String x=sc.next();
		String z="";
		int n1=0,n2=0;
		for(int i=x.length()-1;i>=0;i--)
		{
			if(x.charAt(i)>='a'&&x.charAt(i)<='z') {
			int y=(int)x.charAt(i)+1;
			int q=y-97;
			n1=n1+q;
			n2=n2+q+1;
			z=z+(char)y;
			}
			
			if(x.charAt(i)>='A'&&x.charAt(i)<='Z') {
				int y=(int)x.charAt(i)+1;
				int q=y-64;
				n1=n1+q;
				n2=n2+q+1;
				z=z+(char)y;
				}
		}
		System.out.println(n1+" "+n2);
	    int a=n2-n1;
		System.out.println(z+" "+a);
			

	}

}
