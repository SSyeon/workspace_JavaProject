import java.util.*;

public class RockPaperScissors {

	public static void main(String[] args) {
		while(true) {
		System.out.println("숫자를 입력해주세요( 1: 가위  2: 바위  3: 보   0 : 끝)");
		String [] pae = {"가위","바위","보"};
		Scanner sc=new Scanner(System.in);
		int p=sc.nextInt();
		//사용자의 입력을 받자(1 : 가위 2: 바위 3:보 0:끝)
		if (p==0) {
			break;
		}
		 
		int c=makeComputer(); //컴ㅍ터의패
		int result = compare(p,c);
		System.out.println("사용자  : "+pae[p-1]+"\t컴퓨터 : "+pae[c-1]);
//		if(p==1) {
//			System.out.println("사용자 : 가위");
//		}
//		else if(p==2) {
//			System.out.println("사용자 : 바위");}
//		else
//			System.out.println("사용자 : 보");
//		}

		if (result == -1)
			System.out.println("졌당 ㅠ!");
		else if(result ==0)
			System.out.println("비겼당!");
		else
			System.out.println("이겼당!");

	}
	}

	private static int compare(int p, int c) {
		//if((p==1 && c==2)||(p==2 && c==3)||(p==3 && c==1)) {
		if((p+1)%3==c) {
			return -1;
		}
		//else if((p==1 && c==1)||(p==2 && c==2)||(p==3&&c==3)) {
		else if(p==c) {
			return 0;
		}
		else {
			return 1;
		}
	}

	private static int makeComputer() {
		Random random = new Random();
		int c=random.nextInt(3-1+1)+1;
		return c;
	}
	
}
