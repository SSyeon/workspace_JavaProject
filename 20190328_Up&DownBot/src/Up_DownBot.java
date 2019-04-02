 import java.util.Random;
 import java.util.Scanner;
//
 public class Up_DownBot {
  public static void main(String ar[]) {
 
 Scanner sc=new Scanner(System.in);
 	int start = 1;
 	int end =100;
 	Random random = new Random();
 
while(true) {
	//int guess = random.nextInt(end - start +1)+start;
	int guess = (end -start)/2;
	System.out.println(guess+"입니까? (1: 정답, 2:up 3:Down)");
	int answer = sc.nextInt();
	if(answer ==1) {
		System.out.println("정답입니다");
		break;
	}
	else if(answer ==2) {
		start = guess +1;
	}
	else if(answer ==3) {
		end=guess-1;
	}
}
	}
}