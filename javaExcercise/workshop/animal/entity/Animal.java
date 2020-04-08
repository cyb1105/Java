package workshop.animal.entity;
/*
 * 추상클래스
 * 추상클래스는 스스로 객체를 생성할수 없다
 * Animal ani = new Animal() (x)
 * Animal cat = new Cat(); (o)
 * 추상메서드가 없어도  된다.
 * body가 있는 concrete method를 선언할 수 있다.
 */

public abstract class Animal {
	protected int legs;
	
	protected Animal(int legs) {
		this.legs = legs;
	}
	public void walk() {
		System.out.println("Animal"+ this.legs + "다리로 걷는다");
		
	}	
	public abstract void eat();

}
