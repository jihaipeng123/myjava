import java.util.Scanner;

public class maxhigh{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int high1 = sc.nextInt();	
		int high2 = sc.nextInt();	
		int high3 = sc.nextInt();
		
		int temphight = (high1>high2) ? high1:high2;
		int high = (temphight>high3) ? temphight:high3;
		System.out.println("high:" + high);
	}

} 
