import java.util.Scanner;
class Sum{

	public static void main(String [] args){

	Scanner sc=new Scanner (System.in);
	System.out.println("Enter any two integer valus:");

	int a=sc.nextInt();
	int b=sc.nextInt();

	int sum =a+b;

	System.out.println("First value:"+a);
	System.out.println("Second value:"+b);
	System.out.println("Sum is:" +sum);
	}
}