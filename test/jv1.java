package test;
import java.util.Scanner;
public class jv1 {
 public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
   System.out.println("enter a number a");
   int a=sc.nextInt();
   System.out.println("enter a number b");
   int b=sc.nextInt();
   System.out.println("enter operation to be performed ");
   System.out.println("1.add ");
   System.out.println("2.sub ");
   System.out.println("3.mul ");
   System.out.println("4.div ");
    String ope=sc.next();
   switch(ope)
   {
   case "add":System.out.println(a+b);  break;
   case "sub":System.out.println(a-b);  break; 
   
   case "mul":System.out.println(a*b);  break; 
   case "div":System.out.println(a/b);  break; 
   default: System.out.println("invalid operation ");
   
   }
   
}
}
