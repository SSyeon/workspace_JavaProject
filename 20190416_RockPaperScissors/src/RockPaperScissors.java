import java.util.*;

public class RockPaperScissors {

	public static void main(String[] args) {
		while(true) {
		System.out.println("���ڸ� �Է����ּ���( 1: ����  2: ����  3: ��   0 : ��)");
		String [] pae = {"����","����","��"};
		Scanner sc=new Scanner(System.in);
		int p=sc.nextInt();
		//������� �Է��� ����(1 : ���� 2: ���� 3:�� 0:��)
		if (p==0) {
			break;
		}
		 
		int c=makeComputer(); //�Ĥ�������
		int result = compare(p,c);
		System.out.println("�����  : "+pae[p-1]+"\t��ǻ�� : "+pae[c-1]);
//		if(p==1) {
//			System.out.println("����� : ����");
//		}
//		else if(p==2) {
//			System.out.println("����� : ����");}
//		else
//			System.out.println("����� : ��");
//		}

		if (result == -1)
			System.out.println("���� ��!");
		else if(result ==0)
			System.out.println("����!");
		else
			System.out.println("�̰��!");

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
