package apartment1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		String[] Info1 = new String[100];
		String[] Info2 = new String[100];
		int num = 0;
		String co="y";
		
		while (true) {
			if(co=="y") {
			System.out.println("������ �̸� �Է�:");
			String Name = sc.next();
			System.out.println("������ ����ó �Է�:");
			String Address = sc.next();
			
			System.out.println("���: y/n");
			co = sc.next();
			
			Info1[num] = Name;
			Info2[num] = Address;
			
			num++;
			}  else {
				  break;
			}
			
		}
		System.out.println(Info1[0] + Info2[0]);
		
		
		
		

	}

}
