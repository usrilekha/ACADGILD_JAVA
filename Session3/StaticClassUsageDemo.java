import java.util.Scanner;


public class StaticClassUsageDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the no : ");
		int no = scn.nextInt();
		System.out.println("Square root of the no is "+Math.sqrt(no));
		System.out.println("Ceil value of square root is "+Math.ceil(Math.sqrt(no)));
		System.out.println("Floor value is sqare root"+Math.floor(Math.sqrt(no)));
		System.out.println("Rounded off value of the Square root of the no is "+Math.round(Math.sqrt(no)));
		System.out.println("Cube root of the no is "+Math.cbrt(no));
		System.out.println("Ceil value of cube root is "+Math.ceil(Math.cbrt(no)));
		System.out.println("Floor value is cube root"+Math.floor(Math.cbrt(no)));
		System.out.println("Rounded off value of the cube root of the no is "+Math.round(Math.cbrt(no)));
	}

}
