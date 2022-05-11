import java.util.Scanner;
class CircleInput{

	public static void main(String [] args){
	
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter Radius number:");
	float r=sc.nextFloat();
	
	double area = 3.14 *r*r;
	double Circlmferece = 2* 3.14 *r;
	System.out.println("area is :"+ area);
	System.out.println("circlmference is:"+ Circlmferece);
	}
}