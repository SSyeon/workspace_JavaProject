import java.util.Scanner;

public class StudentNumber2Major {
	public static void main(String ar[]) {
		System.out.println("�й��� �Է����ּ���");
		Scanner sc=new Scanner(System.in);
		String major=sc.next();
		
		String grade = major.substring(0, 1);
		String classroom = major.substring(1, 2);//substring�� �������� ����
		if(grade.equals("1")||grade.equals("2")) {
			if(classroom.equals("1")||classroom.equals("2")) 
				System.out.println("���̵�����Ʈ�����");
			else if(classroom.equals("3")||classroom.equals("4")) 
				System.out.println("���̵�����ַ�ǰ�");
			else if(classroom.equals("5")||classroom.equals("6")) 
				System.out.println("���̵������ΰ�");
		}
		
		else if(major.charAt(0)=='3') {
		 		switch(major.charAt(1)) {
		 		case ('1') : case('2') : System.out.println("���ͷ�Ƽ��̵���");break;
 				case ('3') : case('4') : System.out.println("���̵������ΰ�");break;
 				case ('5') : case('6') : System.out.println("���̵��ַ�ǰ�");break;
		 		} 
		 }
	}
}
 
 
		 
		 