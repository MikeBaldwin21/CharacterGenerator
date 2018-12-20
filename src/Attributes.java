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

	public void setStrength(int strength) {
		this.strength = strength;
	}

	public int getAgility() {
		return agility;
	}

	public void setAgility(int agility) {
		this.agility = agility;
	}

	public int getIntelligence() {
		return intelligence;
	}

	public void setIntelligence(int intelligence) {
		this.intelligence = intelligence;
	}

	public int getCharisma() {
		return charisma;
	}

	public void setCharisma(int charisma) {
		this.charisma = charisma;
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
		result.strength = a.strength + b.strength;
		result.agility = a.agility + b.agility;
		result.intelligence = a.intelligence + b.intelligence;
		result.charisma = a.charisma + b.charisma;
		return result;
	}
}
