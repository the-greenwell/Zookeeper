
public class Mammal {
	private int energyLevel;
	
	public Mammal() {
		this.energyLevel = 0;
	}
	
	public int displayEnergy() {
		return this.energyLevel;
	}
	
	public void setEnergy(int change) {
		this.energyLevel = change;
		System.out.println(String.format("Animals energy is %s.", this.energyLevel));
	}
}
