import java.util.Scanner;

public class NumberToWeekday {

	public static void main(String[] args) {
		 String Day[] = {"울요일","화요일","수요일","목요일","금요일","토요일","일요일"};
		//요일입력하자
		//요일 출력하자 (1==>월요일,
		Scanner sc=new Scanner(System.in);
		int day=sc.nextInt();
// 	switch(day%7) {
//		case 1 : System.out.println("Monday");break;
//		case 2 : System.out.println("Tuseday");break;
//		case 3 : System.out.println("Wednesday");break;
//		case 4 : System.out.println("Thursday");break;
//		case 5 : System.out.println("Friday");break;
//		case 7 : System.out.println("Sunday");break;			  
 //		}
		
		 System.out.println(Day[day-1]);
}
}
