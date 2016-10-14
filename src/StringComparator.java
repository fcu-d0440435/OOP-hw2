import java.util.Scanner;

public class StringComparator {
	
	public static void main(String[]args){
		
		Scanner scanner=new Scanner(System.in);
		
		String one,two;
		int flag=0;
		
		do{
		
		System.out.println("輸入字串");
		
		one =scanner.next();
		
		System.out.println("輸入字串2號");
		
		two = scanner.next();
		
		if(one.compareTo(two)==0){
			
			System.out.println("一樣");
			flag=0;
		}
		else{
			
			System.out.println("不一樣");
			flag=1;
		}
		
	}while(flag==1);
		}

}
