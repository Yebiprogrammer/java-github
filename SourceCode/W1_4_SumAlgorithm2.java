import java.util.Scanner;
public class W1_4_SumAlgorithm2 {
  /* 
  함수를 사용해서 간결한 합계 알고리즘을 완성합니다.
  */
  public static void main(String[] args){
    int toNumber = 10;
    Scanner scn = new Scanner(System.in);
    System.out.print(
      toNumber + "보다 작은 숫자를 입력하시오 : "
    );
    int input = scn.nextInt();
    
    if(input <= toNumber){
      System.out.println(
        "1부터 " 
        + toNumber + "까지 " 
        + input + "의 배수의 합은 " 
        + getSum(input, toNumber) + "입니다."
      );
    }
  }

  public static int getSum(int n, int number){
    int result = 0;
    for(int i=1; i<=number; i++){
      if(i % n == 0){
        result = result + i;
      }
    }
    return result;
  }
}




