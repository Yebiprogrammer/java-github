public class W2_1_OOP {
  public static void main(String[] args){
    // 건담 객체생성 (인스턴트 Instance 생성) ☞ 실체가 있다~!
    Gundam gundam1 = new Gundam();
    Gundam gundam2 = new Gundam();

    gundam1.setName("건담 헬로우");
    gundam1.setVersion(1);
    gundam1.setHeight(100);

    gundam2.setName("건담 둘째");
    gundam2.setVersion(2);
    gundam2.setHeight(70);

    gundam1.print();
    gundam2.print();
  }
}

// 건담 설계도 ☞ 실체가 없는 무형/추상의 문서형식이다~!
class Gundam {
  String name = null;
  int version = 0;
  int height = 0;
  public void print(){
    System.out.println("");
    System.out.println("┌────────────────────────────────┐");
    System.out.println(" 건담의 버전은 " + version + "입니다.");
    System.out.println(" 건담의 이름을 " + name + "입니다.");
    System.out.println(" 건담의 크기는 " + height + "미터 입니다.");
    System.out.println("└────────────────────────────────┘");
    System.out.println("");
  }
  public void setName(String myName){
    this.name = myName;
  }
  public void setVersion(int myVersion){
    this.version = myVersion;
  }
  public void setHeight(int myHeight){
    this.height = myHeight;
  }
}