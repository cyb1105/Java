package workshop.animal.entity;

public class Fish extends Animal implements Pet {
	private String name;
	
	public Fish(String name) {
		super(0);
		this.name = name;
	}

	@Override
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String getName() {
		return null;
	}

	@Override
	public void walk() {
		System.out.println("������ ���� �ʰ� ����Ŀ�");
	}

	@Override
	public void play() {
		System.out.println("������ ���׿��� ��ƿ�");

	}

	@Override
	public void eat() {
		System.out.println("������ �ö�ũ���� �Ծ��");

	}

}
