package Baldwin;

public class Skills {
	private int ironflesh;
	private int powerStrike;
	private int powerThrow;
	private int powerDraw;
	private int weaponMaster;
	private int shield;
	private int athletics;
	private int riding;
	private int horseArchery;
	private int looting;
	private int trainer;
	private int tracking;
	private int tactics;
	private int pathFinding;
	private int spotting;
	private int inventoryManagement;
	private int woundManagement;
	private int surgery;
	private int firstAid;
	private int engineer;
	private int persuasion;
	private int prisonerManagement;
	private int leadership;
	private int trade;

	public Skills() {
		ironflesh = 0;
		powerStrike = 0;
		powerThrow = 0;
		powerDraw = 0;
		weaponMaster = 0;
		shield = 0;
		athletics = 0;
		riding = 0;
		horseArchery = 0;
		looting = 0;
		trainer = 0;
		tracking = 0;
		tactics = 0;
		pathFinding = 0;
		spotting = 0;
		inventoryManagement = 0;
		woundManagement = 0;
		surgery = 0;
		firstAid = 0;
		engineer = 0;
		persuasion = 0;
		prisonerManagement = 0;
		leadership = 0;
		trade = 0;
	}

	public Skills(int ironflesh, int powerStrike, int powerThrow, int powerDraw, int weaponMaster, int shield, int athletics, int riding, int horseArchery, int looting, int trainer, int tracking, int tactics, int pathFinding, int spotting, int inventoryManagement, int woundManagement, int surgery, int firstAid, int engineer, int persuasion, int prisonerManagement, int leadership, int trade) {
		this.ironflesh = ironflesh;
		this.powerStrike = powerStrike;
		this.powerThrow = powerThrow;
		this.powerDraw = powerDraw;
		this.weaponMaster = weaponMaster;
		this.shield = shield;
		this.athletics = athletics;
		this.riding = riding;
		this.horseArchery = horseArchery;
		this.looting = looting;
		this.trainer = trainer;
		this.tracking = tracking;
		this.tactics = tactics;
		this.pathFinding = pathFinding;
		this.spotting = spotting;
		this.inventoryManagement = inventoryManagement;
		this.woundManagement = woundManagement;
		this.surgery = surgery;
		this.firstAid = firstAid;
		this.engineer = engineer;
		this.persuasion = persuasion;
		this.prisonerManagement = prisonerManagement;
		this.leadership = leadership;
		this.trade = trade;
	}

	public int getIronflesh() {
		return ironflesh;
	}

	public int getPowerStrike() {
		return powerStrike;
	}

	public int getPowerThrow() {
		return powerThrow;
	}

	public int getPowerDraw() {
		return powerDraw;
	}

	public int getWeaponMaster() {
		return weaponMaster;
	}

	public int getShield() {
		return shield;
	}

	public int getAthletics() {
		return athletics;
	}

	public int getRiding() {
		return riding;
	}

	public int getHorseArchery() {
		return horseArchery;
	}

	public int getLooting() {
		return looting;
	}

	public int getTrainer() {
		return trainer;
	}

	public int getTracking() {
		return tracking;
	}

	public int getTactics() {
		return tactics;
	}

	public int getPathFinding() {
		return pathFinding;
	}

	public int getSpotting() {
		return spotting;
	}

	public int getInventoryManagement() {
		return inventoryManagement;
	}

	public int getWoundManagement() {
		return woundManagement;
	}

	public int getSurgery() {
		return surgery;
	}

	public int getFirstAid() {
		return firstAid;
	}

	public int getEngineer() {
		return engineer;
	}

	public int getPersuasion() {
		return persuasion;
	}

	public int getPrisonerManagement() {
		return prisonerManagement;
	}

	public int getLeadership() {
		return leadership;
	}

	public int getTrade() {
		return trade;
	}

	@Override
	public String toString() {
		String result = "";
		if(getIronflesh() > 0)
			result += "ironflesh[" + getIronflesh() + "], ";
		if(getPowerStrike() > 0)
			result += "powerStrike[" + getPowerStrike() + "], ";
		if(getPowerThrow() > 0)
			result += "powerThrow[" + getPowerThrow() + "], ";
		if(getPowerDraw() > 0)
			result += "powerDraw[" + getPowerDraw() + "], ";
		if(getWeaponMaster() > 0)
			result += "weaponMaster[" + getWeaponMaster() + "], ";
		if(getShield() > 0)
			result += "shield[" + getShield() + "], ";
		if(getAthletics() > 0)
			result += "athletics[" + getAthletics() + "], ";
		if(getRiding() > 0)
			result += "riding[" + getRiding() + "], ";
		if(getHorseArchery() > 0)
			result += "horseArchery[" + getHorseArchery() + "], ";
		if(getLooting() > 0)
			result += "looting[" + getLooting() + "], ";
		if(getTrainer() > 0)
			result += "trainer[" + getTrainer() + "], ";
		if(getTracking() > 0)
			result += "tracking[" + getTracking() + "], ";
		if(getTactics() > 0)
			result += "tactics[" + getTactics() + "], ";
		if(getPathFinding() > 0)
			result += "pathFinding[" + getPathFinding() + "], ";
		if(getSpotting() > 0)
			result += "spotting[" + getSpotting() + "], ";
		if(getInventoryManagement() > 0)
			result += "inventoryManagement[" + getInventoryManagement() + "], ";
		if(getWoundManagement() > 0)
			result += "woundManagement[" + getWoundManagement() + "], ";
		if(getSurgery() > 0)
			result += "surgery[" + getSurgery() + "], ";
		if(getFirstAid() > 0)
			result += "firstAid[" + getFirstAid() + "], ";
		if(getEngineer() > 0)
			result += "engineer[" + getEngineer() + "], ";
		if(getPersuasion() > 0)
			result += "persuasion[" + getPersuasion() + "], ";
		if(getPrisonerManagement() > 0)
			result += "prisonerManagement[" + getPrisonerManagement() + "], ";
		if(getLeadership() > 0)
			result += "leadership[" + getLeadership() + "], ";
		if(getTrade() > 0)
			result += "trade[" + getTrade() + "]";
		return result;
	}

	public static Skills add(Skills a, Skills b) {
		Skills result = new Skills();
		result.ironflesh = a.getIronflesh() + b.getIronflesh();
		result.powerStrike = a.getPowerStrike() + b.getPowerStrike();
		result.powerThrow = a.getPowerThrow() + b.getPowerThrow();
		result.powerDraw = a.getPowerDraw() + b.powerDraw;
		result.weaponMaster = a.getWeaponMaster() + b.getWeaponMaster();
		result.shield = a.getShield() + b.getShield();
		result.athletics = a.getAthletics() + b.getAthletics();
		result.riding = a.getRiding() + b.getRiding();
		result.horseArchery = a.getHorseArchery() + b.getHorseArchery();
		result.looting = a.getLooting() + b.getLooting();
		result.trainer = a.getTrainer() + b.getTrainer();
		result.tracking = a.getTracking() + b.getTracking();
		result.tactics = a.getTactics() + b.getTactics();
		result.pathFinding = a.getPathFinding() + b.getPathFinding();
		result.spotting = a.getSpotting() + b.getSpotting();
		result.inventoryManagement = a.getInventoryManagement() + b.getInventoryManagement();
		result.woundManagement = a.getWoundManagement() + b.getWoundManagement();
		result.surgery = a.getSurgery() + b.getSurgery();
		result.firstAid = a.getFirstAid() + b.getFirstAid();
		result.engineer = a.getEngineer() + b.getEngineer();
		result.persuasion = a.getPersuasion() + b.getPersuasion();
		result.prisonerManagement = a.getPrisonerManagement() + b.getPrisonerManagement();
		result.leadership = a.getLeadership() + b.getLeadership();
		result.trade = a.getTrade() + b.getTrade();
		return result;
	}
}
