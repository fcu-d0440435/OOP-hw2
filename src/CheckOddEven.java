import java.util.Scanner;
public class CheckOddEven {
	
	public static void main(String[]args){
		
		int num1;
		
		
		
		Scanner scanner  = new Scanner(System.in);
		
		System.out.println("輸入一個整數");
		
		num1=scanner.nextInt();
		
		if (num1 %2==0){
			
			System.out.println("it is even");
		}
		else {
			
			System.out.println("it is odd");
		}
	}

}
