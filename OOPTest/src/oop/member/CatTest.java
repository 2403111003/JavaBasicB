package oop.member;

class Cat {
	String color;
	static String feed;
	
	void eat() {
		String feed = "아무거나";
		{
			System.out.println("사료 "+this.feed+"를 먹습니다.");
		}
	}
	
	void eat(String feed) {
		System.out.println("사료 "+feed+"를 먹습니다.");
	}
	
}
public class CatTest {
	public static void main(String[] agrs) {
		Cat myCat = new Cat();
		myCat.color = "브라운";
		
		System.out.println(Cat.feed);
		
		myCat.feed = "힐스";
		
		System.out.println(Cat.feed);
		
		myCat.eat();
		myCat.eat("일반");
	}
}
