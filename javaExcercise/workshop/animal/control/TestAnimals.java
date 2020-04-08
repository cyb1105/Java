package workshop.animal.control;

import workshop.animal.entity.Animal;
import workshop.animal.entity.Cat;
import workshop.animal.entity.Pet;

public class TestAnimals {

	public static void main(String[] args) {
		//Cat ��ü�� �����ϴ� ��� 3����
		Cat cat1 = new Cat();
		cat1.setName("�÷���");
		System.out.println(cat1.getName());
		cat1.play();
		cat1.eat();
		cat1.walk();
		
		System.out.println("\r");
		
		Animal cat2 = new Cat("�÷���2");
		cat2.eat();
		cat2.walk();
		
		System.out.println("\r");
		
		Pet cat3 = new Cat();
		cat3.setName("�÷���3");
		System.out.println(cat3.getName());
		cat3.play();

	}

}
