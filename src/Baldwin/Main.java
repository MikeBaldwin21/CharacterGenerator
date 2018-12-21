package Baldwin;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import static Baldwin.Choice.*;

public class Main {
	public static void main(String[] args) {
		buildChoiceCombinations();
	}

	private static void buildChoiceCombinations() {
		List<Choice> fatherMale = new ArrayList<Choice>(){{add(nobleMale); add(merchant); add(warrior); add(hunter); add(nomadMale); add(thief);}};
		List<Choice> fatherFemale = new ArrayList<Choice>(){{add(nobleFemale); add(merchant); add(warrior); add(hunter); add(nomadFemale); add(thief);}};
		List<Choice> earlyLife = new ArrayList<Choice>(){{add(page); add(apprentice); add(assistant); add(urchin); add(steppeChild);}};
		List<Choice> adulthoodMale = new ArrayList<Choice>(){{add(squire); add(troubadour); add(student); add(peddler); add(smith); add(poacher);}};
		List<Choice> adulthoodFemale = new ArrayList<Choice>(){{add(ladyInWaiting); add(troubadour); add(student); add(peddler); add(smith); add(poacher);}};
		List<Choice> reasonForAdventuring = new ArrayList<Choice>(){{add(revenge); add(loss); add(wanderlust); add(forcedOut); add(money);}};
		List<Choice> allChoices = new ArrayList<>();
		List<Choice> onlyNoble = new ArrayList<>();

		for(Choice iFather : fatherMale) {
			for(Choice iEarlyLife : earlyLife) {
				for(Choice iAdulthood : adulthoodMale) {
					for(Choice iReasonForAdventuring : reasonForAdventuring) {
						if(iFather.getName().contains("Noble"))
							onlyNoble.add(Choice.add(Choice.add(Choice.add(Choice.add(male, iFather), iEarlyLife), iAdulthood), iReasonForAdventuring));
						allChoices.add(Choice.add(Choice.add(Choice.add(Choice.add(male, iFather), iEarlyLife), iAdulthood), iReasonForAdventuring));
					}
				}
			}
		}

		List<Choice> maleOnlyNobleSortedOnAttributeTotal = new ArrayList<>(onlyNoble);
		maleOnlyNobleSortedOnAttributeTotal.sort(Comparator.comparingInt(o2 -> o2.getAttributes().getTotal()));
		Collections.reverse(maleOnlyNobleSortedOnAttributeTotal);

		List<Choice> maleOnlyNobleSortedOnAttributeModTotal = new ArrayList<>(onlyNoble);
		maleOnlyNobleSortedOnAttributeModTotal.sort(Comparator.comparingInt(o2 -> o2.getAttributes().getModTotal()));
		Collections.reverse(maleOnlyNobleSortedOnAttributeModTotal);

		List<Choice> maleOnlyNobleSortedOnAttributeModTotalFloat = new ArrayList<>(onlyNoble);
		maleOnlyNobleSortedOnAttributeModTotalFloat.sort(Comparator.comparingDouble(o2 -> o2.getAttributes().getModTotalFloat()));
		Collections.reverse(maleOnlyNobleSortedOnAttributeModTotalFloat);

		List<Choice> maleSortedOnAttributeTotal = new ArrayList<>(allChoices);
		maleSortedOnAttributeTotal.sort(Comparator.comparingInt(o2 -> o2.getAttributes().getTotal()));
		Collections.reverse(maleSortedOnAttributeTotal);

		List<Choice> maleSortedOnAttributeModTotal = new ArrayList<>(allChoices);
		maleSortedOnAttributeModTotal.sort(Comparator.comparingInt(o2 -> o2.getAttributes().getModTotal()));
		Collections.reverse(maleSortedOnAttributeModTotal);

		List<Choice> maleSortedOnAttributeModTotalFloat = new ArrayList<>(allChoices);
		maleSortedOnAttributeModTotalFloat.sort(Comparator.comparingDouble(o2 -> o2.getAttributes().getModTotalFloat()));
		Collections.reverse(maleSortedOnAttributeModTotalFloat);

		List<Choice> maleSortedByStrength = new ArrayList<>(allChoices);
		maleSortedByStrength.sort(Comparator.comparingInt(o -> o.getAttributes().getStrength()));
		Collections.reverse(maleSortedByStrength);

		List<Choice> maleSortedByAgility = new ArrayList<>(allChoices);
		maleSortedByAgility.sort(Comparator.comparingInt(o -> o.getAttributes().getAgility()));
		Collections.reverse(maleSortedByAgility);

		List<Choice> maleSortedByIntelligence = new ArrayList<>(allChoices);
		maleSortedByIntelligence.sort(Comparator.comparingInt(o -> o.getAttributes().getIntelligence()));
		Collections.reverse(maleSortedByIntelligence);

		List<Choice> maleSortedByCharisma = new ArrayList<>(allChoices);
		maleSortedByCharisma.sort(Comparator.comparingInt(o -> o.getAttributes().getCharisma()));
		Collections.reverse(maleSortedByCharisma);

		for(Choice iFather : fatherFemale) {
			for(Choice iEarlyLife : earlyLife) {
				for(Choice iAdulthood : adulthoodFemale) {
					for(Choice iReasonForAdventuring : reasonForAdventuring) {
						allChoices.add(Choice.add(Choice.add(Choice.add(Choice.add(female, iFather), iEarlyLife), iAdulthood), iReasonForAdventuring));
					}
				}
			}
		}

		List<Choice> sortedOnAttributeTotal = new ArrayList<>(allChoices);
		sortedOnAttributeTotal.sort(Comparator.comparingInt(o2 -> o2.getAttributes().getTotal()));
		Collections.reverse(sortedOnAttributeTotal);

		List<Choice> sortedOnAttributeModTotal = new ArrayList<>(allChoices);
		sortedOnAttributeModTotal.sort(Comparator.comparingInt(o2 -> o2.getAttributes().getModTotal()));
		Collections.reverse(sortedOnAttributeModTotal);

		List<Choice> sortedOnAttributeModTotalFloat = new ArrayList<>(allChoices);
		sortedOnAttributeModTotalFloat.sort(Comparator.comparingDouble(o2 -> o2.getAttributes().getModTotalFloat()));
		Collections.reverse(sortedOnAttributeModTotalFloat);

		List<Choice> sortedByStrength = new ArrayList<>(allChoices);
		sortedByStrength.sort(Comparator.comparingInt(o -> o.getAttributes().getStrength()));
		Collections.reverse(sortedByStrength);

		List<Choice> sortedByAgility = new ArrayList<>(allChoices);
		sortedByAgility.sort(Comparator.comparingInt(o -> o.getAttributes().getAgility()));
		Collections.reverse(sortedByAgility);

		List<Choice> sortedByIntelligence = new ArrayList<>(allChoices);
		sortedByIntelligence.sort(Comparator.comparingInt(o -> o.getAttributes().getIntelligence()));
		Collections.reverse(sortedByIntelligence);

		List<Choice> sortedByCharisma = new ArrayList<>(allChoices);
		sortedByCharisma.sort(Comparator.comparingInt(o -> o.getAttributes().getCharisma()));
		Collections.reverse(sortedByCharisma);
	}
}
