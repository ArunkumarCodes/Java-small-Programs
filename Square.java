import java.util.Scanner;
class Square{
	public static void main(String [] args){

	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the integer:");
	int a=sc.nextInt();
	int squar= a*a;
	int perimter= 10*a;
	
	System.out.println("your number:"+ squar);
	System.out.println("number squar:"+ perimter);
}
}