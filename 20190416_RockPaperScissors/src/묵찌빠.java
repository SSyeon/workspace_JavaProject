import java.util.*;

public class 묵찌빠 {

	public static void main(String[] args) {
		boolean winPlayer = false;
		boolean winner = false;
		while(true) {
		System.out.println("숫자를 입력해주세요( 1: 찌  2: 묵  3: 빠   0 : 끝)");
		String [] pae = {"찌","묵","빠"};
		Scanner sc=new Scanner(System.in);
		int p=sc.nextInt();
		if (p==0) {
			break;
		}
		 
		int c=makeComputer(); //컴ㅍ터의패
		int result = compare(p,c);
		System.out.println("사용자  : "+pae[p-1]+"\t컴퓨터 : "+pae[c-1]);
 
		if (result == -1) { //이전결과 갖고있어야함
			winPlayer=false;
			winner = true;
		}
		else if(result ==0)//처음 비기면 가위바위보 다시해야됨
			//승패가 갈리고 비기면 끝이고 결과 알려주기
		 
			if(winner == true) {
				if(winPlayer ==true) {
					System.out.println("이겼당");
				}
				else
					System.out.println("졌당 ㅠ");
			}
			else {
				//첨
			}
			 
		else //이전결과가 이겨야 승리
			winPlayer=true;
			winner = true;
			 

	}
	}
 
 

	private static int compare(int p, int c) {
		 
		if((p+1)%3==c%3) {
			return -1;
		}
		 
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