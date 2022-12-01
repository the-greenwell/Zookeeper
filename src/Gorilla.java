
public class Gorilla extends Mammal{
	public Gorilla() {
		super();
		super.setEnergy(300);
	}
	public void throwSomething() {
		System.out.println("The gorilla threw something smelly...");
		int engSpent = super.displayEnergy() - 5;
		super.setEnergy(engSpent);
	}
	public void eatBananas() {
		System.out.println("The gorilla ate a banana!");
		int engSpent = super.displayEnergy() + 10;
		super.setEnergy(engSpent);
	}
	public void climb() {
		System.out.println("The gorilla climbed a tree.");
		int engSpent = super.displayEnergy() - 10;
		super.setEnergy(engSpent);
	}
}
