import java.util.Scanner;


public class PrimeNoCheck {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the no you want to check : ");
		int no = scn.nextInt();
		boolean total = primeCheck(no);
		if(total){
			System.out.println("It is a prime no");	
		}
		else
		{
			System.out.println("It is not a prime no");
		}
		
	}
	public static boolean primeCheck(int no)
	{
		boolean isPrime = true;			
		for(int i=2;i<no;i++){
			if(no%i==0){
				isPrime = false;
				break;
			}
		}
		return isPrime;
	}
}
