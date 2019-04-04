import java.util.Scanner;

public class StudentNumber2Major {
	public static void main(String ar[]) {
		System.out.println("학번을 입력해주세요");
		Scanner sc=new Scanner(System.in);
		String major=sc.next();
		
		String grade = major.substring(0, 1);
		String classroom = major.substring(1, 2);//substring은 이퀄스로 비교함
		if(grade.equals("1")||grade.equals("2")) {
			if(classroom.equals("1")||classroom.equals("2")) 
				System.out.println("뉴미디어소프트웨어과");
			else if(classroom.equals("3")||classroom.equals("4")) 
				System.out.println("뉴미디어웹솔루션과");
			else if(classroom.equals("5")||classroom.equals("6")) 
				System.out.println("뉴미디어디자인과");
		}
		
		else if(major.charAt(0)=='3') {
		 		switch(major.charAt(1)) {
		 		case ('1') : case('2') : System.out.println("인터랙티브미디어과");break;
 				case ('3') : case('4') : System.out.println("뉴미디어디자인과");break;
 				case ('5') : case('6') : System.out.println("뉴미디어솔루션과");break;
		 		} 
		 }
	}
}
 
 
		 
		 