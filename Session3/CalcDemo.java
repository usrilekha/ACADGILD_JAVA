import java.util.Scanner;


public class CalcDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CalcDemo cal = new CalcDemo();
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the value of x : ");
		int x = scn.nextInt();
		System.out.println("Enter the value of y : ");
		int y = scn.nextInt();
		System.out.println("Enter the operation to be performed(+,-,*,/) : ");
		String z = scn.next();
		int add=0,sub=0,mul=0,div=0;
		if(z.equalsIgnoreCase("+")){
			add = cal.addition(x,y);
			System.out.println("The addition of "+x+" & "+y+" is "+add);
		}
		if(z.equalsIgnoreCase("-")){
			sub = cal.subraction(x,y);
			System.out.println("The subraction of "+x+" & "+y+" is "+sub);
		}
		if(z.equalsIgnoreCase("*")){
			mul = cal.multiplication(x,y);
			System.out.println("The multiplication of "+x+" & "+y+" is "+mul);
		}
		if(z.equalsIgnoreCase("/")){
			div = cal.division(x,y);
			System.out.println("The division of "+x+" & "+y+" is "+div);
		}
	}

	public int addition(int x,int y){
		int result=0;
		result = x+y;
		return result;
	}
	
	public int subraction(int x,int y){
		int result=0;
		result = x-y;
		return result;
	}
	
	public int multiplication(int x,int y){
		int result=0;
		result = x*y;
		return result;
	}
	
	public int division(int x,int y){
		int result=0;
		result = x/y;
		return result;
	}
}
