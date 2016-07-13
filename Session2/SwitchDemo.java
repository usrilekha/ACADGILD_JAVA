import java.util.Scanner;


public class SwitchDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the month in no : ");
		int month = scn.nextInt();
		int total = getNoOfDays(month);
		System.out.println("No of Days in the month is "+total);
	}
	public static int getNoOfDays(int month)
	{
		int str = 0;
		switch(month)
		{
		case 1 : 
			str=31;
			break;
		case 2 :
			str=28;
			break;
		case 3 : 
			str=31;
			break;
		case 4 : 
			str=30;
			break;
		case 5 : 		
			str=31;
			break;
		case 6 : 
			str=30;
			break;
		case 7 : 
			str=31;
			break;
		case 8 : 
			str=31;
			break;
		case 9 : 
			str=30;
			break;
		case 10 : 
			str=31;
			break;
		case 11 : 
			str=30;
			break;
		case 12 : 
			str=31;
			break;
		}
		return str;
	}
}
