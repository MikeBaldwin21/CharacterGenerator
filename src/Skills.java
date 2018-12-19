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

	public static Skills add(Skills a, Skills b) {
		Skills result = new Skills();
		result.ironflesh = a.ironflesh + b.ironflesh;
		result.powerStrike = a.powerStrike + b.powerStrike;
		result.powerThrow = a.powerThrow + b.powerThrow;
		result.powerDraw = a.powerDraw + b.powerDraw;
		result.weaponMaster = a.weaponMaster + b.weaponMaster;
		result.shield = a.shield + b.shield;
		result.athletics = a.athletics + b.athletics;
		result.riding = a.riding + b.riding;
		result.horseArchery = a.horseArchery + b.horseArchery;
		result.looting = a.looting + b.looting;
		result.trainer = a.trainer + b.trainer;
		result.tracking = a.tracking + b.tracking;
		result.tactics = a.tactics + b.tactics;
		result.pathFinding = a.pathFinding + b.pathFinding;
		result.spotting = a.spotting + b.spotting;
		result.inventoryManagement = a.inventoryManagement + b.inventoryManagement;
		result.woundManagement = a.woundManagement + b.woundManagement;
		result.surgery = a.surgery + b.surgery;
		result.firstAid = a.firstAid + b.firstAid;
		result.engineer = a.engineer + b.engineer;
		result.persuasion = a.persuasion + b.persuasion;
		result.prisonerManagement = a.prisonerManagement + b.prisonerManagement;
		result.leadership = a.leadership + b.leadership;
		result.trade = a.trade + b.trade;
		return result;
	}
}
