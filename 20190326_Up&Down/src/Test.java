import java.util.Random;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in) ;
		System.out.println("����� �����ϴ� ���ڸ� ������ >>>(200����)");
	Random random = new Random();
	int rNum = random.nextInt(200); //0~99������
	while(true) {
		int number = sc.nextInt();
	if(number>rNum+1) {
		System.out.println("Down!");
	}
	else if(number<rNum+1)
		System.out.println("Up!");

	else if(number==rNum+1) {
		System.out.println(rNum+1+" ���߼̳׿�~~");
		break;
	}
	 
	}
}
}
