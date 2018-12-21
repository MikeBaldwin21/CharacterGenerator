package Baldwin;

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

	public int getOneHanded() {
		return oneHanded;
	}

	public int getTwoHanded() {
		return twoHanded;
	}

	public int getPolearms() {
		return polearms;
	}

	public int getArchery() {
		return archery;
	}

	public int getCrossbows() {
		return crossbows;
	}

	public int getThrowing() {
		return throwing;
	}

	@Override
	public String toString() {
		String result = "";
		if(getOneHanded() > 0)
			result += "oneHanded[" + getOneHanded() + "], ";
		if(getTwoHanded() > 0)
			result += "twoHanded[" + getTwoHanded() + "], ";
		if(getPolearms() > 0)
			result += "polearms[" + getPolearms() + "], ";
		if(getArchery() > 0)
			result += "archery[" + getArchery() + "], ";
		if(getCrossbows() > 0)
			result += "crossbows[" + getCrossbows() + "], ";
		if(getThrowing() > 0)
			result += "throwing[" + getThrowing() + "], ";
		return result;
	}

	public static Proficiencies add(Proficiencies a, Proficiencies b) {
		Proficiencies result = new Proficiencies();
		result.oneHanded = a. getOneHanded() + b. getOneHanded();
		result.twoHanded = a. getTwoHanded() + b. getTwoHanded();
		result.polearms = a. getPolearms() + b. getPolearms();
		result.archery = a. getArchery() + b. getArchery();
		result.crossbows = a. getCrossbows() + b. getCrossbows();
		result.throwing = a. getThrowing() + b. getThrowing();
		return result;
	}
}
