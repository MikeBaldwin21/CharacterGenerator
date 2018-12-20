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

	public void increaseProficiencesBasedOnAgility() {
		proficiencies.setOneHanded(proficiencies.getOneHanded() + attributes.getAgility() * 5);
		proficiencies.setTwoHanded(proficiencies.getTwoHanded() + attributes.getAgility() * 5);
		proficiencies.setPolearms(proficiencies.getPolearms() + attributes.getAgility() * 5);
		proficiencies.setArchery(proficiencies.getArchery() + attributes.getAgility() * 5);
		proficiencies.setCrossbows(proficiencies.getCrossbows() + attributes.getAgility() * 5);
		proficiencies.setThrowing(proficiencies.getThrowing() + attributes.getAgility() * 5);
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
		result.name = a.name + " + " + b.name;
		result.attributes = Attributes.add(a.attributes, b.attributes);
		result.skills = Skills.add(a.skills, b.skills);
		result.proficiencies = Proficiencies.add(a.proficiencies, b.proficiencies);
		result.equipement = a.equipement + " + " + b.equipement;
		return result;
	}

	@Override
	public String toString() {
		return attributes.toString();
	}
}
