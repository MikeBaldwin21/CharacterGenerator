package Baldwin;

public class Attributes {
	private int strength;
	private int agility;
	private int intelligence;
	private int charisma;

	public Attributes() {
		strength = 0;
		agility = 0;
		intelligence = 0;
		charisma = 0;
	}

	public Attributes(int strength, int agility, int intelligence, int charisma) {
		this.strength = strength;
		this.agility = agility;
		this.intelligence = intelligence;
		this.charisma = charisma;
	}

	public int getStrength() {
		return strength;
	}

	public int getAgility() {
		return agility;
	}

	public int getIntelligence() {
		return intelligence;
	}

	public int getCharisma() {
		return charisma;
	}

	public int getTotal() {
		return strength + agility + intelligence + charisma;
	}

	public int getModTotal() {
		return (strength / 3) + (agility / 3) + (intelligence / 3) + (charisma / 3);
	}

	public float getModTotalFloat() {
		return (strength / 3f) + (agility / 3f) + (intelligence / 3f) + (charisma / 3f);
	}

	@Override
	public String toString() {
		return "[" + strength + "], [" + agility + "], [" + intelligence + "], [" + charisma + "]";
	}

	public static Attributes add(Attributes a, Attributes b) {
		Attributes result = new Attributes();
		result.strength = a.getStrength() + b.getStrength();
		result.agility = a.getAgility() + b.getAgility();
		result.intelligence = a.getIntelligence() + b.getIntelligence();
		result.charisma = a.getCharisma() + b.getCharisma();
		return result;
	}
}
