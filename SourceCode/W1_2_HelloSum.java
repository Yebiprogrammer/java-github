import java.util.Scanner;
public class W1_2_HelloSum{
	/*
	프로그램 실행 시 파라미터를 넘길 수 있습니다.
	파라미터는 String 배열인 args 변수로 받아 사용합니다.
	(사용예)
	컴파일 javac W1_2_HelloSum.java -encoding utf8
	실행
	  java  W1_2_HelloSum  매개변수
	  java  W1_2_HelloSum  3
	*/
	public static void main(String[] args){		
		String version = null;
		
		if(args.length > 0){
			version = args[0];
			
			switch(version){				
				case "1":
					System.out.println("더하기 프로그램 버전 1");
					//더하기 프로그램 버전 1 (정수형 변수 사용)
					int i1 = 1;
					int i2 = 2;
					int i3 = 3;
					int i4 = 4;
					int i5 = 5;
					int i6 = 6;
					int i7 = 7;
					int i8 = 8;
					int i9 = 9;
					int i10 = 10;
					int result_v1 = 0;
					
					result_v1 = i1 + i2 + i3 + i4 + i5 + i6 + i7 + i8 + i9 + i10;
					
					System.out.print("1부터 10까지의 합은 ");
					System.out.println(result_v1);
					break;

				case "2":
					System.out.println("더하기 프로그램 버전 2");
					//더하기 프로그램 버전 2 (정수형 배열 사용)
					//배열 선언방법 int [] 변수명 = {값1,값2,...,값들};
					int [] i = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
					int result_v2 = 0;
					
					result_v2 = i[0] + i[1] + i[2] + i[3] + i[4] + i[5] + i[6] + i[7] + i[8] + i[9];
					System.out.print("1부터 10까지의 합은 ");
					System.out.println(result_v2);
					break;

				case "3":
					System.out.println("더하기 프로그램 버전 3");
					//더하기 프로그램 버전 3 (배열을 for문을 사용해서 결과값 구하기)
					int [] num = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
					int result_v3 = 0;
					System.out.println("배열의 길이:" + num.length);
					//for문 for(시작; 끝; 스텝)
					for(int i_=0; i_ < num.length; i_=i_+1){
						result_v3 = result_v3 + num[i_];
					}
					System.out.print("1부터 10까지의 합은 ");
					System.out.println(result_v3);
					break;

				case "4":
					System.out.println("더하기 프로그램 버전 4");
					//더하기 프로그램 버전 4 (변수만을 이용해서 덧셈 계산하기)
					int fromNum = 1;
					int toNum = 10000;
					int result_v4 = 0;
					for(int i__ = fromNum; i__ <= toNum; i__++){
						//i++  →  i = i + 1  ☜ 이 둘은 같은 표현입니다.
						//result += i  →  result = result + i ☜ 이 둘은 같은 표현입니다.
						result_v4 += i__;
					}
					System.out.println(
						fromNum + "부터 " + toNum + "까지의 합은 "
						+ result_v4 + "입니다."
					);
					break;

				case "5":
					System.out.println("더하기 프로그램 버전 5");
					// 키보드로 입력받기 위한 방법
					// import java.util.Scanner;
					// 키보드로 입력받을 객체 생성
					// Scanner scn = new Scanner(System.in);
					// int 입력받을 변수 = scn.nextInt();
					
					System.out.println("1부터 숫자 몇까지 합산할까요?");
					
					Scanner scn = new Scanner(System.in); // 키보드로 입력받는 객체 생성
					int inputNumber = scn.nextInt();  // 키보드로 입력받기~!
					System.out.println("입력받은 숫자는 " + inputNumber + "입니다.");
					
					int result_v5 = 0;
					
					for(int i_v5 = 1; i_v5 <= inputNumber; i_v5++){
						result_v5 += i_v5;
					}
					
					System.out.println(
						"결과 : 1부터 "+ inputNumber+"까지 합계는 " 
						+ result_v5	+ " 입니다."
					);
					break;

				default:
					System.out.println("해당 버전이 없습니다!");
					break;
			}
		}
	}
}