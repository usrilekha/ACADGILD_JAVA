import java.util.Scanner;


public class RandomNoGeneration {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RandomNoGeneration r = new RandomNoGeneration();
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the no limit : ");
		int no = scn.nextInt();
		int x=no;
		int count =0;
		while(x!=0){
			x=x/10;
			count++;
		}
		System.out.println("Count "+count);
		int random = r.random(count);
		
		while(random>no){
			random = r.random(count);
		}
		System.out.println("Random no is "+random);
	}
	public int random(int count){
		double ran = Math.random();
		System.out.println(ran);
		int random = (int)(ran*Math.pow(10, count));
		return random;
	}
}
