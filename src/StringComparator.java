import java.util.Scanner;

public class StringComparator {
	
	public static void main(String[]args){
		
		Scanner scanner=new Scanner(System.in);
		
		String one,two;
		
		System.out.println("��J�r��");
		
		one =scanner.next();
		
		System.out.println("��J�r��2��");
		
		two = scanner.next();
		
		if(one.compareTo(two)==0){
			
			System.out.println("�@��");
		}
		else{
			
			System.out.println("���@��");
		}
		
	}

}
