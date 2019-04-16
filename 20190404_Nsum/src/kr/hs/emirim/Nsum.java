package kr.hs.emirim;

import java.util.Scanner;

public class Nsum {

	public static void main(String[] args) {
		System.out.println("숫자를 입력해주세요>>");
		Scanner sc= new Scanner (System.in);
		String num = sc.nextLine();
//		int number[]=new int [num.length()];
		nSum(num);
	}

	private static void nSum(String num) {
		int length=num.length();
		int sum=0;
		for(int i=0;i<length;i++) {				
 			//sum+=(int)(num.subString(i,i+1));
			char n = num.charAt(i);
			sum+= n -'0';
 		}
 			 System.out.println(sum);
	}

}
