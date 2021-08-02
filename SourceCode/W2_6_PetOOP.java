public class W2_6_PetOOP {
	public static void main(String[] args){
		// 인스턴스(객체생성)
		Dog mydog1 = new Dog("진도개", "구피");
		mydog1.show();
		mydog1.sound();

		Dog mydog2 = new Dog("푸들", "라떼");
		mydog2.show();
		mydog2.sound();

		Cat mycat1 = new Cat("페르시안", "아지라엘");
		mycat1.show();
		mycat1.sound();

		Cat mycat2 = new Cat("시암고양이", "팡팡");
		mycat2.show();
		mycat2.sound();
	}	
}

// 객체지향 설계도
class Animal{
	String type, name;
	public void show() {
		System.out.println("");
		System.out.println("");
		System.out.print("┌");
		System.out.print("─────────MY PET─────────");
		System.out.print("┐");
		System.out.println("");
	}
	public void intro(){
		System.out.println(
				"나는 " + this.type + "~! "
				+ "내이름은 " + this.name + " 예요."
		);
	}
	public void sound(){
		System.out.print("♪♬ ");
	}
}

class Dog extends Animal{
	public Dog(){
		//System.out.println("객체를 생성할 때 자동 호출");
	}
	public Dog(String type, String name){
		this.type = type;
		this.name = name;
	}
	@Override
	public void show(){
		super.show();
		System.out.println("     (___()'`;");
		System.out.println("     /,    /`");
		System.out.println("     \\\\\"--\\\\");
		super.intro();
	}
	@Override
	public void sound(){
		super.sound();
		System.out.println("멍멍!!");
	}
}

class Cat extends Animal{
	public Cat(String type, String name){
		this.type = type;
		this.name = name;
	}
	@Override
	public void show(){
		super.show();
		System.out.println("     \\    /\\");
		System.out.println("      )  ( ')");
		System.out.println("     (  /  )");
		System.out.println("      \\(__)|");
		super.intro();
	}
	@Override
	public void sound(){
		super.sound();
		System.out.println("냐옹...");
	}
}