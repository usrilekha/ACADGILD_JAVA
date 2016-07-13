import java.util.Scanner; 

public class IfElseDemo{

     
	public static void main(String []args){
        
	Scanner scn = new Scanner(System.in);
        
	int age = scn.nextInt();
        
	if(age>=18){
            
		System.out.println("You are eligible to vote");

        }

        else

        {

           	System.out.println("You are too young to vote");

        }

        scn.close();

     }

}
