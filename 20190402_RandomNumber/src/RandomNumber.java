import java.util.Random;

public class RandomNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int start=3;
		int end =4;
		Random random=new Random();
		int number = random.nextInt(end+1-start )+start; //start - end, ·£´ı ¼ıÀÚ »ÌÀÚ~~
		System.out.println(number);
	}

}
