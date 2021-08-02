import java.util.Scanner;

public class W1_3_SumAlgorithm {
  /*
    static 키워드를 사용하여 합을 계산하는 함수를 만듭니다.
  */
  public static void main(String[] args){
    int result = 0;
    int number = 10;
    int input = 0;
    Scanner scn = new Scanner(System.in);

    System.out.print("숫자를 입력하시오 : ");
    input = scn.nextInt();
    System.out.print("입력된 숫자는 : " + input + " 입니다.");
    System.out.println("");

    switch(input){
      case 1:
        System.out.println("입력 값이 1일 경우");
        result = 0;
        for(int i=1; i<=number; i++){
          result = result + i;
          //result += i;
        }
        System.out.println(
          "1부터 " + number + "까지 " + input + "의 배수의 합은 " + result + "입니다."
        );
        break;
      case 2:
        System.out.println("입력 값이 2일 경우");
        // 2의 배수를 더합니다.
        for(int i=1; i<=number; i++){
          if(i % 2 == 0){
            result += i;
            // result = result + i;
          }
        }
        System.out.println(
          "1부터 " + number + "까지 " + input + "의 배수의 합은 " + result + "입니다."
        );
        break;
      case 3:
        System.out.println("입력 값이 3일 경우");
        System.out.println(
          "1부터 " + number + "까지 " 
          + input + "의 배수의 합은 " 
          + getSum(input, number) 
          + "입니다."
        );
        break;
      case 4:
        System.out.println("입력 값이 4일 경우");
        System.out.println(
          "1부터 " + number + "까지 " 
          + input + "의 배수의 합은 " 
          + getSum(input, number) 
          + "입니다."
        );
      break;
      default:
        System.out.println("입력 값이 잘못됐을 경우");
        break;
    }
  }
  public static int getSum(int n, int number){
    // static 키워드 : 객체를 생성하지 않고 함수를 호출하기 위해 사용합니다.
    // int 키워드 : 함수를 끝내고 return 받을 값이 int(정수형) 임을 선언합니다.
    // int n, int number : 함수를 실행할 때 넘길 파라미터를 선언합니다.
    int result = 0;
    for(int i=1; i<=number; i++){
      if(i % n == 0){ // i%n=0 나머지가 0인지 체크합니다.
        result = result + i;
      }
    }
    return result;
  }
}