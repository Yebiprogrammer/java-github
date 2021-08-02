import java.util.Scanner;
public class W3_1_Prime {
	public static void main(String[] args){
		// 숫자를 받아서 해당 숫자가 소수인지 아닌지 판별하는 알고리즘
		Scanner scn = new Scanner(System.in);
		System.out.print("숫자를 입력하세요 : ");
		int inputNumber = scn.nextInt();
		boolean isPrime = false;

		if(isPrime(inputNumber) == true){
			System.out.println(inputNumber + " 는 소수입니다.");
		} else {
			System.out.println(inputNumber + " 는 소수가 아닙니다.");
		}
	}

	public static boolean isPrime(int n){
		boolean result = true;
		if(n > 1)
			for(int i=2; i<n; i++)
				if(n % i == 0) result = false;
		return result;
	}
}