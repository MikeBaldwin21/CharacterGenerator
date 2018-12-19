import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
	//Empty
	private static Choice zero = new Choice("Zero",
			new Attributes(0, 0, 0, 0),
			new Skills(0, 0, 0, 0, 0, 0, 0, 0,
					0, 0, 0, 0, 0, 0, 0, 0,
					0, 0, 0, 0, 0, 0, 0, 0),
			new Proficiencies(0, 0, 0, 0, 0, 0),
			"Nothing");

	//Base
	private static Choice male = new Choice("Male",
			new Attributes(6, 5, 4, 6),
			new Skills(0, 0, 0, 0, 0, 0, 0, 1,
					0, 0, 0, 0, 0, 0, 0, 0,
					0, 0, 0, 0, 0, 0, 1, 0),
			new Proficiencies(23, 15, 20, 15, 15, 19),
			"");
	private static Choice female = new Choice("Female",
			new Attributes(5, 6, 5, 5),
			new Skills(0, 0, 0, 0, 0, 0, 0, 1,
					0, 0, 0, 0, 0, 0, 0, 0,
					0, 0, 0, 0, 0, 0, 1, 0),
			new Proficiencies(23, 15, 20, 15, 15, 19),
			"");

	//Your father was...
	private static Choice nobleMale = new Choice("Noble (Male)",
			new Attributes(0, 0, 1, 2),
			new Skills(0, 1, 0, 0, 1, 0, 0, 1,
					0, 0, 0, 0, 1, 0, 0, 0,
					0, 0, 0, 0, 0, 0, 1, 0),
			new Proficiencies(2, 15, 21, 0, 0, 0),
			"Battered Old Round Shield, +100 Denars, +100 Renown, Banner, +3 Honor");
	private static Choice nobleFemale = new Choice("Noble (Female)",
			new Attributes(0, 0, 2, 1),
			new Skills(0, 0, 0, 0, 0, 0, 0, 2,
					0, 0, 0, 0, 0, 0, 0, 0,
					1, 0, 1, 0, 0, 0, 1, 0),
			new Proficiencies(14, 0, 7, 0, 0, 0),
			"");
	private static Choice merchant = new Choice("Merchant",
			new Attributes(0, 0, 2, 1),
			new Skills(0, 0, 0, 0, 0, 0, 0, 1,
					0, 0, 0, 0, 0, 0, 0, 1,
					0, 0, 0, 0, 0, 0, 1, 2),
			new Proficiencies(0, 15, 7, 0, 0, 0),
			"+250 Denars, +20 Renown");
	private static Choice warrior = new Choice("Warrior",
			new Attributes(1, 1, 0, 1),
			new Skills(1, 1, 0, 0, 1, 0, 0, 0,
					0, 0, 1, 0, 0, 0, 0, 0,
					0, 0, 0, 0, 0, 0, 1, 0),
			new Proficiencies(2, 23, 33, 0, 0, 15),
			"Battered Plain Kite Shield, +50 Denars, +10 Renown");
	private static Choice hunter = new Choice("Hunter",
			new Attributes(1, 2, 0, 0),
			new Skills(0, 0, 0, 1, 0, 0, 1, 0,
					0, 0, 0, 1, 0, 1, 1, 0,
					0, 0, 0, 0, 0, 0, 0, 0),
			new Proficiencies(0, 15, 7, 49, 0, 0),
			"+30 Denars");
	private static Choice nomadMale = new Choice("Nomad (Male)",
			new Attributes(0, 1, 1, 0),
			new Skills(0, 0, 0, 1, 0, 0, 0, 2,
					1, 0, 0, 0, 0, 1, 0, 0,
					0, 0, 0, 0, 0, 0, 0, 0),
			new Proficiencies(2, 0, 7, 49, 0, 15),
			"Battered Plain Cavalry Shield, +15 Denars, +20 Renown");
	private static Choice nomadFemale = new Choice("Nomad (Female)",
			new Attributes(0, 1, 1, 0),
			new Skills(0, 0, 0, 0, 0, 0, 0, 2,
					0, 0, 0, 0, 0, 1, 0, 0,
					1, 0, 1, 0, 0, 0, 0, 0),
			new Proficiencies(5, 0, 7, 32, 0, 7),
			"Battered Plain Cavalry Shield, +20 Denars, +20 Renown");
	private static Choice thief = new Choice("Thief",
			new Attributes(0, 3, 0, 0),
			new Skills(0, 0, 1, 0, 0, 0, 2, 0,
					0, 1, 0, 0, 0, 0, 0, 1,
					0, 0, 0, 0, 0, 0, 0, 0),
			new Proficiencies(14, 0, 7, 0, 0, 31),
			"Thowing Knives, +25 Denars");

	//Early Life...
	private static Choice page = new Choice("Page",
			new Attributes(1, 0, 0, 1),
			new Skills(0, 1, 0, 0, 0, 0, 0, 0,
					0, 0, 0, 0, 0, 0, 0, 0,
					0, 0, 0, 0, 1, 0, 0, 0),
			new Proficiencies(8, 0, 3, 0, 0, 0),
			"");
	private static Choice apprentice = new Choice("Apprentice",
			new Attributes(1, 0, 1, 0),
			new Skills(0, 0, 0, 0, 0, 0, 0, 0,
					0, 0, 0, 0, 0, 0, 0, 0,
					0, 0, 0, 1, 0, 0, 0, 1),
			new Proficiencies(0, 0, 0, 0, 0, 0),
			"");
	private static Choice assistant = new Choice("Assistant",
			new Attributes(0, 0, 1, 1),
			new Skills(0, 0, 0, 0, 0, 0, 0, 0,
					0, 0, 0, 0, 0, 0, 0, 1,
					0, 0, 0, 0, 0, 0, 0, 1),
			new Proficiencies(0, 0, 0, 0, 0, 0),
			"");
	private static Choice urchin = new Choice("Urchin",
			new Attributes(0, 1, 1, 0),
			new Skills(0, 0, 0, 0, 0, 0, 0, 0,
					0, 1, 0, 0, 0, 0, 1, 0,
					0, 0, 0, 0, 0, 0, 0, 0),
			new Proficiencies(8, 0, 0, 0, 0, 7),
			"");
	private static Choice steppeChild = new Choice("Steppe Child",
			new Attributes(1, 1, 0, 0),
			new Skills(0, 0, 1, 0, 0, 0, 0, 0,
					1, 0, 0, 0, 0, 0, 0, 0,
					0, 0, 0, 0, 0, 0, 0, 0),
			new Proficiencies(0, 0, 0, 24, 0, 0),
			"+5 Renown");

	//Adulthood...
	private static Choice squire = new Choice("Squire",
			new Attributes(1, 1, 0, 0),
			new Skills(0, 1, 0, 0, 1, 0, 0, 1,
					0, 0, 0, 0, 0, 0, 0, 0,
					0, 0, 0, 0, 0, 0, 1, 0),
			new Proficiencies(23, 38, 22, 16, 16, 14),
			"Ragged Leather Jerkin, Tattered Leather Boots, Swaybacked Saddle Horse, Rusty Sword, Hunting Crossbow, Bolts, Smoked Fish, +20 Denars");
	private static Choice ladyInWaiting = new Choice("Lady in Waiting",
			new Attributes(0, 0, 1, 1),
			new Skills(0, 0, 0, 0, 0, 0, 0, 1,
					0, 0, 0, 0, 0, 0, 0, 0,
					1, 0, 0, 0, 2, 0, 0, 0),
			new Proficiencies(8, 0, 0, 0, 24, 0),
			"Sturdy Woolen Hood, Sturdy Woolen Dress, Spirited Courser, Dagger, Hunting Crossbow, Bolts, Smoked FIsh, +100 Denars");
	private static Choice troubadour = new Choice("Troubadour",
			new Attributes(0, 0, 0, 2),
			new Skills(0, 0, 0, 0, 1, 0, 0, 0,
					0, 0, 0, 0, 0, 1, 0, 0,
					0, 0, 0, 0, 1, 0, 1, 0),
			new Proficiencies(19, 0, 0, 0, 16, 0),
			"Sturdy Tabard, Ragged Leather Boots, Swaybacked Saddle Horse, Rusty Sword, Hunting Crossbow, Bolts, Smoked Fish, +80 Denars");
	private static Choice student = new Choice("Student",
			new Attributes(0, 0, 2, 0),
			new Skills(0, 0, 0, 0, 1, 0, 0, 0,
					0, 0, 0, 0, 0, 0, 0, 0,
					1, 1, 0, 0, 1, 0, 0, 0),
			new Proficiencies(15, 0, 0, 0, 32, 0),
			"Sturdy Linen Tunic, Woolen Hose, Swaybacked Saddle Horse, Rusty Sword, Hunting Crossbow, Bolts, Smoked Fish, Book (random), +80 Denars");
	private static Choice peddler = new Choice("Peddler",
			new Attributes(0, 0, 1, 1),
			new Skills(0, 0, 0, 0, 0, 0, 0, 1,
					0, 0, 0, 0, 0, 1, 0, 1,
					0, 0, 0, 0, 0, 0, 0, 1),
			new Proficiencies(0, 0, 11, 0, 0, 0),
			"Fur Hat, Leather Jacket, Ragged Leather Boots, Leather Gloves, Saddle Horse, Staff, Hunting Crossbow, Bolts, Smoked Fish, Linen, Pottery, 2x Wool, Sumpter Horse, +90 Denars");
	private static Choice smith = new Choice("Smith",
			new Attributes(1, 0, 1, 0),
			new Skills(0, 0, 0, 0, 1, 0, 0, 0,
					0, 0, 0, 0, 1, 0, 0, 0,
					0, 0, 0, 1, 0, 0, 0, 1),
			new Proficiencies(11, 0, 0, 0, 0, 0),
			"Coarse Tunic, Ragged Leather Boots, Saddle Horse, Balanced Sword, Hunting Crossbow, Bolts, Smoked Fish, Tools, +100 Denars");
	private static Choice poacher = new Choice("Poacher",
			new Attributes(1, 1, 0, 0),
			new Skills(0, 0, 0, 1, 0, 0, 1, 0,
					0, 0, 0, 1, 0, 0, 1, 0,
					0, 0, 0, 0, 0, 0, 0, 0),
			new Proficiencies(0, 0, 7, 57, 0, 0),
			"Rawhide Coat, Hide Boots, Heavy Sumpter Horse, Chipped Axe, Hunting Bow, Barbed Arrows, 2x Dried Meat, 2x Furs, +10 Denars");

	//Reason for Adventuring...
	private static Choice revenge = new Choice("Revenge",
			new Attributes(2, 0, 0, 0),
			new Skills(0, 1, 0, 0, 0, 0, 0, 0,
					0, 0, 0, 0, 0, 0, 0, 0,
					0, 0, 0, 0, 0, 0, 0, 0),
			new Proficiencies(0, 0, 0, 0, 0, 0),
			"");
	private static Choice loss = new Choice("Loss",
			new Attributes(0, 0, 0, 2),
			new Skills(1, 0, 0, 0, 0, 0, 0, 0,
					0, 0, 0, 0, 0, 0, 0, 0,
					0, 0, 0, 0, 0, 0, 0, 0),
			new Proficiencies(0, 0, 0, 0, 0, 0),
			"");
	private static Choice wanderlust = new Choice("Wanderlust",
			new Attributes(0, 2, 0, 0),
			new Skills(0, 0, 0, 0, 0, 0, 0, 0,
					0, 0, 0, 0, 0, 1, 0, 0,
					0, 0, 0, 0, 0, 0, 0, 0),
			new Proficiencies(0, 0, 0, 0, 0, 0),
			"");
	private static Choice forcedOut = new Choice("Forced Out",
			new Attributes(1, 0, 1, 0),
			new Skills(0, 0, 0, 0, 1, 0, 0, 0,
					0, 0, 0, 0, 0, 0, 0, 0,
					0, 0, 0, 0, 0, 0, 0, 0),
			new Proficiencies(0, 0, 0, 0, 0, 0),
			"");
	private static Choice money = new Choice("Money",
			new Attributes(0, 1, 1, 0),
			new Skills(0, 0, 0, 0, 0, 0, 0, 0,
					0, 1, 0, 0, 0, 0, 0, 0,
					0, 0, 0, 0, 0, 0, 0, 0),
			new Proficiencies(0, 0, 0, 0, 0, 0),
			"");

	public static void main(String[] args) {
		List<Choice> fatherMale = new ArrayList<Choice>(){{add(nobleMale); add(merchant); add(warrior); add(hunter); add(nomadMale); add(thief);}};
		List<Choice> fatherFemale = new ArrayList<Choice>(){{add(nobleFemale); add(merchant); add(warrior); add(hunter); add(nomadFemale); add(thief);}};
		List<Choice> earlyLife = new ArrayList<Choice>(){{add(page); add(apprentice); add(assistant); add(urchin); add(steppeChild);}};
		List<Choice> adulthoodMale = new ArrayList<Choice>(){{add(squire); add(troubadour); add(student); add(peddler); add(smith); add(poacher);}};
		List<Choice> adulthoodFemale = new ArrayList<Choice>(){{add(ladyInWaiting); add(troubadour); add(student); add(peddler); add(smith); add(poacher);}};
		List<Choice> reasonForAdventuring = new ArrayList<Choice>(){{add(revenge); add(loss); add(wanderlust); add(forcedOut); add(money);}};
		List<Choice> allChoices = new ArrayList<>();

		for(Choice iFather : fatherMale) {
			for(Choice iEarlyLife : earlyLife) {
				for(Choice iAdulthood : adulthoodMale) {
					for(Choice iReasonForAdventuring : reasonForAdventuring) {
						allChoices.add(Choice.add(Choice.add(Choice.add(Choice.add(male, iFather), iEarlyLife), iAdulthood), iReasonForAdventuring));
					}
				}
			}
		}
		for(Choice iFather : fatherFemale) {
			for(Choice iEarlyLife : earlyLife) {
				for(Choice iAdulthood : adulthoodFemale) {
					for(Choice iReasonForAdventuring : reasonForAdventuring) {
						allChoices.add(Choice.add(Choice.add(Choice.add(Choice.add(female, iFather), iEarlyLife), iAdulthood), iReasonForAdventuring));
					}
				}
			}
		}

		List<Choice> sortedOnTotalAttributes = new ArrayList<>(allChoices);
		Collections.sort(sortedOnTotalAttributes);
		Collections.reverse(sortedOnTotalAttributes);
	}
}
