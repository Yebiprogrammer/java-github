// 객체를 이용해서 도형의 넓이를 구할 수 있다. 
public class W2_2_HelloOOP {
  public static void main(String[] args){
    // 객체의 설계도를 기반으로 객체를 생성한다. (인스턴스 Instance)
    Square square1 = new Square();
    Triangle triangle1 = new Triangle();
    Circle circle1 = new Circle();

    System.out.println("-----값 저장하기-----");
    square1.setWidth(10);
    square1.setHeight(20);

    triangle1.setWidth(10);
    triangle1.setHeight(20);

    circle1.setWidth(10);

    System.out.println("-----출력하기-----");
    square1.print();
    triangle1.print();
    circle1.print();

    System.out.println("-----넓이 구하기-----");
    System.out.println("사각형의 넓이는 " + square1.getArea() + " ㎠ 입니다.");
    System.out.println("삼각형의 넓이는 " + triangle1.getArea() + " ㎠ 입니다.");
    System.out.println("원의 넓이는 " + circle1.getArea() + " ㎠ 입니다.");
  }
}

// 객체를 생성하기 위한 설계도를 만든다. (자료의 추상화)
class Square{
  // 멤버 변수
  int width = 0;
  int height = 0;
  // 멤버 함수
  public void setWidth(int width){
    // this는 멤버 변수를 지칭하기 위해 사용하는 키워드이다.
    // int width 와 this.width 는 다르다.
    this.width = width;
  }
  public void setHeight(int height){
    this.height = height;
  }
  public void print(){
    System.out.println("나는 사각형입니다.");
    System.out.println("가로 : " + this.width + " cm");
    System.out.println("높이 : " + this.height + " cm");
    System.out.println("");
  }
  public int getArea(){
    int result = 0;      
    result = this.width * this.height;
    return result;
  }
}

class Triangle{
  // 멤버 변수
  int width = 0;
  int height = 0;
  // 멤버 함수
  public void setWidth(int width){
    // this는 멤버 변수를 지칭하기 위해 사용하는 키워드이다.
    // int width 와 this.width 는 다르다.
    this.width = width;
  }
  public void setHeight(int height){
    this.height = height;
  }
  public void print(){
    System.out.println("나는 삼각형입니다.");
    System.out.println("가로 : " + this.width + " cm");
    System.out.println("높이 : " + this.height + " cm");
    System.out.println("");
  }
  public double getArea(){
    // int 정수형, double 실수형
    double result = 0;
    result = this.width * this.height * 0.5;
    return result;
  }
}

class Circle{
  // 멤버 변수
  int width = 0;
  int height = 0;
  // 멤버 함수
  public void setWidth(int width){
    // this는 멤버 변수를 지칭하기 위해 사용하는 키워드이다.
    // int width 와 this.width 는 다르다.
    this.width = width;
    this.height = width;
  }
  public void setHeight(int height){
    this.height = height;
  }
  public void print(){
    System.out.println("나는 원입니다.");
    System.out.println("반지름 : " + this.width/2 + " cm");
    System.out.println("지름 : " + this.width + " cm");
    System.out.println("");
  }
  public double getArea(){
    double result = 0;      
    double r = this.width * 0.5;
    result =  3.14 * r * r;
    return result;
  }
}