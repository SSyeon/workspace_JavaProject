import java.util.Scanner;

public class NumberToWeekday {

	public static void main(String[] args) {
		//�����Է�����
		//���� ������� (1==>������,
		Scanner sc=new Scanner(System.in);
		int day=sc.nextInt();
		switch(day%7) {
		case 1 : System.out.println("Monday");break;
		case 2 : System.out.println("Tuseday");break;
		case 3 : System.out.println("Wednesday");break;
		case 4 : System.out.println("Thursday");break;
		case 5 : System.out.println("Friday");break;
		case 6 : System.out.println("Saturday");break;
		case 7 : System.out.println("Sunday");break;
	 
		}
	}

}
