public class Proficiencies {
	private int oneHanded;
	private int twoHanded;
	private int polearms;
	private int archery;
	private int crossbows;
	private int throwing;

	public Proficiencies() {
		oneHanded = 0;
		twoHanded = 0;
		polearms = 0;
		archery = 0;
		crossbows = 0;
		throwing = 0;
	}

	public Proficiencies(int oneHanded, int twoHanded, int polearms, int archery, int crossbows, int throwing) {
		this.oneHanded = oneHanded;
		this.twoHanded = twoHanded;
		this.polearms = polearms;
		this.archery = archery;
		this.crossbows = crossbows;
		this.throwing = throwing;
	}

	public static Proficiencies add(Proficiencies a, Proficiencies b) {
		Proficiencies result = new Proficiencies();
		result.oneHanded = a.oneHanded + b.oneHanded;
		result.twoHanded = a.twoHanded + b.twoHanded;
		result.polearms = a.polearms + b.polearms;
		result.archery = a.archery + b.archery;
		result.crossbows = a.crossbows + b.crossbows;
		result.throwing = a.throwing + b.throwing;
		return result;
	}

	public int getOneHanded() {
		return oneHanded;
	}

	public void setOneHanded(int oneHanded) {
		this.oneHanded = oneHanded;
	}

	public int getTwoHanded() {
		return twoHanded;
	}

	public void setTwoHanded(int twoHanded) {
		this.twoHanded = twoHanded;
	}

	public int getPolearms() {
		return polearms;
	}

	public void setPolearms(int polearms) {
		this.polearms = polearms;
	}

	public int getArchery() {
		return archery;
	}

	public void setArchery(int archery) {
		this.archery = archery;
	}

	public int getCrossbows() {
		return crossbows;
	}

	public void setCrossbows(int crossbows) {
		this.crossbows = crossbows;
	}

	public int getThrowing() {
		return throwing;
	}

	public void setThrowing(int throwing) {
		this.throwing = throwing;
	}
}
