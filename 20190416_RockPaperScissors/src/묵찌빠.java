import java.util.*;

public class ����� {

	public static void main(String[] args) {
		boolean winPlayer = false;
		boolean winner = false;
		while(true) {
		System.out.println("���ڸ� �Է����ּ���( 1: ��  2: ��  3: ��   0 : ��)");
		String [] pae = {"��","��","��"};
		Scanner sc=new Scanner(System.in);
		int p=sc.nextInt();
		if (p==0) {
			break;
		}
		 
		int c=makeComputer(); //�Ĥ�������
		int result = compare(p,c);
		System.out.println("�����  : "+pae[p-1]+"\t��ǻ�� : "+pae[c-1]);
 
		if (result == -1) { //������� �����־����
			winPlayer=false;
			winner = true;
		}
		else if(result ==0)//ó�� ���� ���������� �ٽ��ؾߵ�
			//���а� ������ ���� ���̰� ��� �˷��ֱ�
		 
			if(winner == true) {
				if(winPlayer ==true) {
					System.out.println("�̰��");
				}
				else
					System.out.println("���� ��");
			}
			else {
				//÷
			}
			 
		else //��������� �̰ܾ� �¸�
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