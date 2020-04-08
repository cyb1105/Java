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
		System.out.println("물고기는 걷지 않고 헤엄쳐요");
	}

	@Override
	public void play() {
		System.out.println("물고기는 어항에서 놀아요");

	}

	@Override
	public void eat() {
		System.out.println("물고기는 플랑크톤을 먹어요");

	}

}
