public class Gryffindor extends Hogwarts {
    private int nobility;
    private int honor;
    private int bravery;

    public Gryffindor(String name, String surname, int nobility, int honor, int bravery, int magicPower, int transgression) {
        super(name, surname, magicPower, transgression);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    public int getNobility() {
        return nobility;
    }

    public int getHonor() {
        return honor;
    }

    public int getBravery() {
        return bravery;
    }

    @Override
    public String toString() {
        return getName() + nobility + honor + bravery;
    }

    public void studentinformationGryffindor() {
        System.out.println(getName() + " " + nobility + " " + honor + " " + bravery);
    }

    public static void compareStudent(Gryffindor comparison1, Gryffindor comparison2) {
        int student1 = comparison1.getNobility() + comparison1.getHonor() + comparison1.getBravery();
        int student2 = comparison2.getNobility() + comparison2.getBravery() + comparison2.getHonor();
        if (student1 > student2) {
            System.out.println(comparison1.getName() + " лучший ученик Гриффиндора, чем " + comparison2.getName());
        } else if (student1 < student2) {
            System.out.println(comparison2.getName() + " лучший ученик Гриффиндора, чем " + comparison1.getName());
        } else {
            System.out.println(comparison1.getName() + " " + comparison2.getName() + " Лучшие ученики Гриффиндора.");
        }
    }
}




