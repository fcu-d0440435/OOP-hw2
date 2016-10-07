import java.util.Scanner;

public class KeyboardScanner {
	
	public static void main(String[] args){
	
		int num1;
		float num2;
		String num3;
		
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("輸入一個整數 ");
		num1=scanner.nextInt();
		System.out.println("輸入一個小數 ");
		num2=scanner.nextFloat();
		System.out.println("輸入一個字串 ");
		num3=scanner.next();
		
		System.out.println("Enter a integer:"+num1 );
		System.out.println("Enter a float point number:" +num2);
		System.out.println("Enter a you name:"+num3);
		System.out.printf("Hi %s,the multiplication of %d and %f is %f",num3,num1,num2,num1*num2);
		
		

	
	}
}
