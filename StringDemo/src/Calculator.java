	import java.util.Scanner;
	import java.util.*;
	public class Calculator {
		
		public int addtion(int a, int b) {
			int sum=a+b;
			return sum;
		}
		public int Substraction(int a, int b) {
			int sum=a-b;
			return sum;
		}
		public int Multiplication(int a, int b) {
			int sum=a*b;
			return sum;
		}
		public int Deivison(int a, int b) {
			int sum=a/b;
			return sum;
		}
		public int Modulus(int a, int b) {
			int sum=a%b;
			return sum;
		}
		
		public static void main(String[] args) {
			Calculator obj=new Calculator();
			Scanner input =new Scanner(System.in);
			System.out.println("enter a Number calculation");
			System.out.print("1st No: ");
			int no1=input.nextInt();
			System.out.print("2nd No: ");
			int no2=input.nextInt();
			System.out.println("enter which calculation you need?");
			System.out.println("add , sub, multi, dev, mod");
			String a=input.next();
			String expression=a;
			int sum1=0;
			int sum2=0;
			switch(expression){
			 case "add":{
				 sum1=obj.addtion(no1, no2);
				 System.out.println(sum1);
			 }
			 break;
			 case "sub":{
				 sum1=obj.Substraction(no1, no2);
				 System.out.println(sum1);
			 }
			 break;
			 case "multi":{
				 sum1=obj.Multiplication(no1, no2);
				 System.out.println(sum1);
			 }
			 break;
			
			 case "dev":{
				 sum1=obj.Deivison(no1,no2);
				 System.out.println(sum1);
			 }
			 break;
			 
			 case "mod":{
				 sum1=obj.Modulus(no1,no2);
				 System.out.println(sum1);
			 }
			 break;
			}
			
			System.out.println("If you continue press y or n");
			String a1=input.next();
			if(a1.contains("y")) {
				System.out.println("enter a number :");
				sum2=input.nextInt();
				System.out.println("add , sub, multi, dev, mod");
				String s=input.next();
				int result=0;
				if(s.contains("add")) {
					result=obj.addtion(sum1, sum2);
					System.out.println(result);
				}
				if(s.contains("Sub")) {
					result=obj.Substraction(sum1, sum2);
					System.out.println(result);
				}
				if(s.contains("multi")) {
					result=obj.Multiplication(sum1, sum2);
					System.out.println(result);
				}
				if(s.contains("dev")) {
					result=obj.Deivison(sum1, sum2);
					System.out.println(result);
				}
				if(s.contains("mod")) {
					result=obj.Modulus(sum1, sum2);
					System.out.println(result);
				}		
			}
			else
				System.out.println("Thank you.");
		}	
		}
		
	
	
