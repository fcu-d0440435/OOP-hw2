import java.util.Scanner;

public class StringComparator {
	
	public static void main(String[]args){
		
		Scanner scanner=new Scanner(System.in);
		
		String one,two;
		int flag=0;
		
		do{
		
		System.out.println("��J�r��");
		
		one =scanner.next();
		
		System.out.println("��J�r��2��");
		
		two = scanner.next();
		
		if(one.compareTo(two)==0){
			
			System.out.println("�@��");
			flag=0;
		}
		else{
			
			System.out.println("���@��");
			flag=1;
		}
		
	}while(flag==1);
		}

}
