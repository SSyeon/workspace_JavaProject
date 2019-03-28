import java.util.*;

public class Test {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(true) {
		System.out.println("무슨 말이 하고싶으세요?>>>>>>>>");
		String inputString = sc.nextLine();
		
		
		if(inputString.equals("exit")) {
			System.out.print("끝");
			break;
		 }
		System.out.println(inputString);
	}

}
}
