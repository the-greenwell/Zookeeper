
public class TestZoo {
	public static void main(String[] args) {
		System.out.println("---Mammal Test---");
		Mammal ani1 = new Mammal();
		System.out.println(String.format("Animals energy is %s.", ani1.displayEnergy()));
		
		System.out.println("---Gorilla Test---");
		Gorilla kong = new Gorilla();
		kong.throwSomething();
		kong.throwSomething();
		kong.throwSomething();
		kong.eatBananas();
		kong.eatBananas();
		kong.climb();

		System.out.println("---Bat Test---");
		Bat vamp = new Bat();
		vamp.attackTown();
		vamp.attackTown();
		vamp.attackTown();
		vamp.eatHumans();
		vamp.eatHumans();
		vamp.fly();
		vamp.fly();
	}
}
