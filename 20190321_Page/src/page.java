import java.util.Scanner;

public class page {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*int nPage=7;
		  int nResult=331;
		  System.out.println(nResult/nPage);
		 */
		Scanner sc=new Scanner(System.in);
		while(true) {
		System.out.println("��ü �Խù��� ���� �Է��ϼ��� ��) 300 >>>");
		 
		 
		//System.out.println("�� ������ ���� : ");
		String inputString = sc.nextLine();
		/*if(page%7==0)
			System.out.println(page/7);
		else  
			System.out.println(page/7 + 1);*/
		
		 if(inputString.equals("exit")) {
			System.out.print("��");
			break;
		 }
//			else if(page%7!=0)
//				System.out.println(page/7 +1+"\n");
		 
		 int result = Integer.parseInt(inputString);
		 int real=result/7;
		 if(result % 7 !=0) {
			 real = result / 7 +1;
		 }
		 	System.out.println(real+"�������� �ʿ��մϴ�.\n");
			}
		}
	}

