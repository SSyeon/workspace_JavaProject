import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(true) {
		System.out.println("\n���� ���� �ϰ��������?>>>>>>>>");
		String inputString = sc.nextLine();
		
		
		if(inputString.equals("exit")) {
			System.out.print("��");
			break;
		 }
		System.out.println("\n"+inputString);
	}

}
}
