package workshop.animal.entity;
/*
 * �߻�Ŭ����
 * �߻�Ŭ������ ������ ��ü�� �����Ҽ� ����
 * Animal ani = new Animal() (x)
 * Animal cat = new Cat(); (o)
 * �߻�޼��尡 ���  �ȴ�.
 * body�� �ִ� concrete method�� ������ �� �ִ�.
 */

public abstract class Animal {
	protected int legs;
	
	protected Animal(int legs) {
		this.legs = legs;
	}
	public void walk() {
		System.out.println("Animal"+ this.legs + "�ٸ��� �ȴ´�");
		
	}	
	public abstract void eat();

}
