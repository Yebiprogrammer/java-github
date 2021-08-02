import java.util.Scanner;
public class W2_3_HelloOOPAlgo {
  public static void main(String[] args){
    // 설계도를 바탕으로 객체 생성 ☞ 실체가 있다~!
    SumAlgorithm sum = new SumAlgorithm();
    
    // 입력값을 받는다.
    sum.getInput();

    // 합계를 구한다.
    System.out.println(
      "1 부터 " 
      + sum.getToNumber() + " 까지의 합은 "
      + sum.getSum() + " 입니다."
    );
  }
}
//----------------------------------------------
// 합계알고리즘 객체 설계도 ☞ 실체가 없다..
class SumAlgorithm {
  int toNumber = 0;

  public void setToNumber(int n){
    this.toNumber = n;
  }

  public int getToNumber(){
    return toNumber;
  }

  // 입력값을 받는다.
  public void getInput(){
    Scanner scn = new Scanner(System.in);
    System.out.print(
      "숫자를 입력하시오 : "
    );
    setToNumber(scn.nextInt());
    System.out.println(
      "입력한 숫자는 " + this.toNumber + " 입니다."
    );
  }

  // 합계를 구하는 멤버함수
  public int getSum(){
    int result = 0;
    if(toNumber > 0){
      for(int i=1; i<=toNumber; i++){
        result += i;   // result = result + i; 같은 표현임
      }
    }
    return result;
  }











}