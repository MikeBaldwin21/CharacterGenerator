package Baldwin;

public class Choice {
	private String name;
	private Attributes attributes;
	private Skills skills;
	private Proficiencies proficiencies;
	private String equipement;

	public Choice() {
		name = "None";
		attributes = new Attributes();
	}

	public Choice(String name, Attributes attributes, Skills skills, Proficiencies proficiencies, String equipement) {
		this.name = name;
		this.attributes = attributes;
		this.skills = skills;
		this.proficiencies = proficiencies;
		this.equipement = equipement;
	}

	public String getName() {
		return name;
	}

	public Attributes getAttributes() {
		return attributes;
	}

	public Skills getSkills() {
		return skills;
	}

	public Proficiencies getProficiencies() {
		return proficiencies;
	}

	public String getEquipement() {
		return equipement;
	}

	public static Choice add(Choice a, Choice b) {
		Choice result = new Choice();
		result.name = a.getName() + " + " + b.getName();
		result.attributes = Attributes.add(a.getAttributes(), b.getAttributes());
		result.skills = Skills.add(a.getSkills(), b.getSkills());
		result.proficiencies = Proficiencies.add(a.getProficiencies(), b.getProficiencies());
		result.equipement = a.getEquipement() + " + " + b.getEquipement();
		return result;
	}

	@Override
	public String toString() {
		return attributes.toString();
	}

	//Empty
	public static Choice zero = new Choice("Zero",
			new Attributes(0, 0, 0, 0),
			new Skills(0, 0, 0, 0, 0, 0, 0, 0,
					0, 0, 0, 0, 0, 0, 0, 0,
					0, 0, 0, 0, 0, 0, 0, 0),
			new Proficiencies(0, 0, 0, 0, 0, 0),
			"Nothing");

	//Base
	public static Choice male = new Choice("Male",
			new Attributes(6, 5, 4, 6),
			new Skills(0, 0, 0, 0, 0, 0, 0, 1,
					0, 0, 0, 0, 0, 0, 0, 0,
					0, 0, 0, 0, 0, 0, 1, 0),
			new Proficiencies(23, 15, 20, 15, 15, 19),
			"");
	public static Choice female = new Choice("Female",
			new Attributes(5, 6, 5, 5),
			new Skills(0, 0, 0, 0, 0, 0, 0, 1,
					0, 0, 0, 0, 0, 0, 0, 0,
					0, 0, 0, 0, 0, 0, 1, 0),
			new Proficiencies(23, 15, 20, 15, 15, 19),
			"");

	//Your father was...
	public static Choice nobleMale = new Choice("Noble (Male)",
			new Attributes(0, 0, 1, 2),
			new Skills(0, 1, 0, 0, 1, 0, 0, 1,
					0, 0, 0, 0, 1, 0, 0, 0,
					0, 0, 0, 0, 0, 0, 1, 0),
			new Proficiencies(2, 15, 21, 0, 0, 0),
			"Battered Old Round Shield, +100 Denars, +100 Renown, Banner, +3 Honor");
	public static Choice nobleFemale = new Choice("Noble (Female)",
			new Attributes(0, 0, 2, 1),
			new Skills(0, 0, 0, 0, 0, 0, 0, 2,
					0, 0, 0, 0, 0, 0, 0, 0,
					1, 0, 1, 0, 0, 0, 1, 0),
			new Proficiencies(14, 0, 7, 0, 0, 0),
			"");
	public static Choice merchant = new Choice("Merchant",
			new Attributes(0, 0, 2, 1),
			new Skills(0, 0, 0, 0, 0, 0, 0, 1,
					0, 0, 0, 0, 0, 0, 0, 1,
					0, 0, 0, 0, 0, 0, 1, 2),
			new Proficiencies(0, 15, 7, 0, 0, 0),
			"+250 Denars, +20 Renown");
	public static Choice warrior = new Choice("Warrior",
			new Attributes(1, 1, 0, 1),
			new Skills(1, 1, 0, 0, 1, 0, 0, 0,
					0, 0, 1, 0, 0, 0, 0, 0,
					0, 0, 0, 0, 0, 0, 1, 0),
			new Proficiencies(2, 23, 33, 0, 0, 15),
			"Battered Plain Kite Shield, +50 Denars, +10 Renown");
	public static Choice hunter = new Choice("Hunter",
			new Attributes(1, 2, 0, 0),
			new Skills(0, 0, 0, 1, 0, 0, 1, 0,
					0, 0, 0, 1, 0, 1, 1, 0,
					0, 0, 0, 0, 0, 0, 0, 0),
			new Proficiencies(0, 15, 7, 49, 0, 0),
			"+30 Denars");
	public static Choice nomadMale = new Choice("Nomad (Male)",
			new Attributes(0, 1, 1, 0),
			new Skills(0, 0, 0, 1, 0, 0, 0, 2,
					1, 0, 0, 0, 0, 1, 0, 0,
					0, 0, 0, 0, 0, 0, 0, 0),
			new Proficiencies(2, 0, 7, 49, 0, 15),
			"Battered Plain Cavalry Shield, +15 Denars, +20 Renown");
	public static Choice nomadFemale = new Choice("Nomad (Female)",
			new Attributes(0, 1, 1, 0),
			new Skills(0, 0, 0, 0, 0, 0, 0, 2,
					0, 0, 0, 0, 0, 1, 0, 0,
					1, 0, 1, 0, 0, 0, 0, 0),
			new Proficiencies(5, 0, 7, 32, 0, 7),
			"Battered Plain Cavalry Shield, +20 Denars, +20 Renown");
	public static Choice thief = new Choice("Thief",
			new Attributes(0, 3, 0, 0),
			new Skills(0, 0, 1, 0, 0, 0, 2, 0,
					0, 1, 0, 0, 0, 0, 0, 1,
					0, 0, 0, 0, 0, 0, 0, 0),
			new Proficiencies(14, 0, 7, 0, 0, 31),
			"Thowing Knives, +25 Denars");

	//Early Life...
	public static Choice page = new Choice("Page",
			new Attributes(1, 0, 0, 1),
			new Skills(0, 1, 0, 0, 0, 0, 0, 0,
					0, 0, 0, 0, 0, 0, 0, 0,
					0, 0, 0, 0, 1, 0, 0, 0),
			new Proficiencies(8, 0, 3, 0, 0, 0),
			"");
	public static Choice apprentice = new Choice("Apprentice",
			new Attributes(1, 0, 1, 0),
			new Skills(0, 0, 0, 0, 0, 0, 0, 0,
					0, 0, 0, 0, 0, 0, 0, 0,
					0, 0, 0, 1, 0, 0, 0, 1),
			new Proficiencies(0, 0, 0, 0, 0, 0),
			"");
	public static Choice assistant = new Choice("Assistant",
			new Attributes(0, 0, 1, 1),
			new Skills(0, 0, 0, 0, 0, 0, 0, 0,
					0, 0, 0, 0, 0, 0, 0, 1,
					0, 0, 0, 0, 0, 0, 0, 1),
			new Proficiencies(0, 0, 0, 0, 0, 0),
			"");
	public static Choice urchin = new Choice("Urchin",
			new Attributes(0, 1, 1, 0),
			new Skills(0, 0, 0, 0, 0, 0, 0, 0,
					0, 1, 0, 0, 0, 0, 1, 0,
					0, 0, 0, 0, 0, 0, 0, 0),
			new Proficiencies(8, 0, 0, 0, 0, 7),
			"");
	public static Choice steppeChild = new Choice("Steppe Child",
			new Attributes(1, 1, 0, 0),
			new Skills(0, 0, 1, 0, 0, 0, 0, 0,
					1, 0, 0, 0, 0, 0, 0, 0,
					0, 0, 0, 0, 0, 0, 0, 0),
			new Proficiencies(0, 0, 0, 24, 0, 0),
			"+5 Renown");

	//Adulthood...
	public static Choice squire = new Choice("Squire",
			new Attributes(1, 1, 0, 0),
			new Skills(0, 1, 0, 0, 1, 0, 0, 1,
					0, 0, 0, 0, 0, 0, 0, 0,
					0, 0, 0, 0, 0, 0, 1, 0),
			new Proficiencies(23, 38, 22, 16, 16, 14),
			"Ragged Leather Jerkin, Tattered Leather Boots, Swaybacked Saddle Horse, Rusty Sword, Hunting Crossbow, Bolts, Smoked Fish, +20 Denars");
	public static Choice ladyInWaiting = new Choice("Lady in Waiting",
			new Attributes(0, 0, 1, 1),
			new Skills(0, 0, 0, 0, 0, 0, 0, 1,
					0, 0, 0, 0, 0, 0, 0, 0,
					1, 0, 0, 0, 2, 0, 0, 0),
			new Proficiencies(8, 0, 0, 0, 24, 0),
			"Sturdy Woolen Hood, Sturdy Woolen Dress, Spirited Courser, Dagger, Hunting Crossbow, Bolts, Smoked FIsh, +100 Denars");
	public static Choice troubadour = new Choice("Troubadour",
			new Attributes(0, 0, 0, 2),
			new Skills(0, 0, 0, 0, 1, 0, 0, 0,
					0, 0, 0, 0, 0, 1, 0, 0,
					0, 0, 0, 0, 1, 0, 1, 0),
			new Proficiencies(19, 0, 0, 0, 16, 0),
			"Sturdy Tabard, Ragged Leather Boots, Swaybacked Saddle Horse, Rusty Sword, Hunting Crossbow, Bolts, Smoked Fish, +80 Denars");
	public static Choice student = new Choice("Student",
			new Attributes(0, 0, 2, 0),
			new Skills(0, 0, 0, 0, 1, 0, 0, 0,
					0, 0, 0, 0, 0, 0, 0, 0,
					1, 1, 0, 0, 1, 0, 0, 0),
			new Proficiencies(15, 0, 0, 0, 32, 0),
			"Sturdy Linen Tunic, Woolen Hose, Swaybacked Saddle Horse, Rusty Sword, Hunting Crossbow, Bolts, Smoked Fish, Book (random), +80 Denars");
	public static Choice peddler = new Choice("Peddler",
			new Attributes(0, 0, 1, 1),
			new Skills(0, 0, 0, 0, 0, 0, 0, 1,
					0, 0, 0, 0, 0, 1, 0, 1,
					0, 0, 0, 0, 0, 0, 0, 1),
			new Proficiencies(0, 0, 11, 0, 0, 0),
			"Fur Hat, Leather Jacket, Ragged Leather Boots, Leather Gloves, Saddle Horse, Staff, Hunting Crossbow, Bolts, Smoked Fish, Linen, Pottery, 2x Wool, Sumpter Horse, +90 Denars");
	public static Choice smith = new Choice("Smith",
			new Attributes(1, 0, 1, 0),
			new Skills(0, 0, 0, 0, 1, 0, 0, 0,
					0, 0, 0, 0, 1, 0, 0, 0,
					0, 0, 0, 1, 0, 0, 0, 1),
			new Proficiencies(11, 0, 0, 0, 0, 0),
			"Coarse Tunic, Ragged Leather Boots, Saddle Horse, Balanced Sword, Hunting Crossbow, Bolts, Smoked Fish, Tools, +100 Denars");
	public static Choice poacher = new Choice("Poacher",
			new Attributes(1, 1, 0, 0),
			new Skills(0, 0, 0, 1, 0, 0, 1, 0,
					0, 0, 0, 1, 0, 0, 1, 0,
					0, 0, 0, 0, 0, 0, 0, 0),
			new Proficiencies(0, 0, 7, 57, 0, 0),
			"Rawhide Coat, Hide Boots, Heavy Sumpter Horse, Chipped Axe, Hunting Bow, Barbed Arrows, 2x Dried Meat, 2x Furs, +10 Denars");

	//Reason for Adventuring...
	public static Choice revenge = new Choice("Revenge",
			new Attributes(2, 0, 0, 0),
			new Skills(0, 1, 0, 0, 0, 0, 0, 0,
					0, 0, 0, 0, 0, 0, 0, 0,
					0, 0, 0, 0, 0, 0, 0, 0),
			new Proficiencies(0, 0, 0, 0, 0, 0),
			"");
	public static Choice loss = new Choice("Loss",
			new Attributes(0, 0, 0, 2),
			new Skills(1, 0, 0, 0, 0, 0, 0, 0,
					0, 0, 0, 0, 0, 0, 0, 0,
					0, 0, 0, 0, 0, 0, 0, 0),
			new Proficiencies(0, 0, 0, 0, 0, 0),
			"");
	public static Choice wanderlust = new Choice("Wanderlust",
			new Attributes(0, 2, 0, 0),
			new Skills(0, 0, 0, 0, 0, 0, 0, 0,
					0, 0, 0, 0, 0, 1, 0, 0,
					0, 0, 0, 0, 0, 0, 0, 0),
			new Proficiencies(0, 0, 0, 0, 0, 0),
			"");
	public static Choice forcedOut = new Choice("Forced Out",
			new Attributes(1, 0, 1, 0),
			new Skills(0, 0, 0, 0, 1, 0, 0, 0,
					0, 0, 0, 0, 0, 0, 0, 0,
					0, 0, 0, 0, 0, 0, 0, 0),
			new Proficiencies(0, 0, 0, 0, 0, 0),
			"");
	public static Choice money = new Choice("Money",
			new Attributes(0, 1, 1, 0),
			new Skills(0, 0, 0, 0, 0, 0, 0, 0,
					0, 1, 0, 0, 0, 0, 0, 0,
					0, 0, 0, 0, 0, 0, 0, 0),
			new Proficiencies(0, 0, 0, 0, 0, 0),
			"");
}
