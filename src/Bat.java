
public class Bat extends Mammal{
	public Bat() {
		super();
		super.setEnergy(300);
	}
	
	public void fly() {
		System.out.println("The bat takes off!");
		int engChange = super.displayEnergy() - 50;
		super.setEnergy(engChange);
	}
	public void eatHumans() {
		System.out.println("The bat eats another victim!");
		int engChange = super.displayEnergy() + 25;
		super.setEnergy(engChange);
		
	}
	public void attackTown() {
		System.out.println("The bat attacks a small town!");
		int engChange = super.displayEnergy() - 100;
		super.setEnergy(engChange);
	}
}
