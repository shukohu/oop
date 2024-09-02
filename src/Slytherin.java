public class Slytherin extends Hogwarts{
    private int trick;
    private int determination;
    private int ambition;

    public Slytherin(String name, String surname, int trick, int determination, int ambition, int magicPower, int transgression) {
        super(name, surname, magicPower, transgression);
        this.ambition = ambition;
        this.determination = determination;
        this.trick = trick;

    }

    public int getAmbition() {
        return ambition;
    }

    public int getDetermination() {
        return determination;
    }

    public int getTrick() {
        return trick;
    }

    @Override
    public String toString() {
        return getName() + trick + determination + ambition;
    }

    public void studentInformationSlytherin() {
        System.out.println(getName() + " " + trick + " " + determination + " " + ambition);
    }

    public static void compareStudent(Slytherin comparison1, Slytherin comparison2) {
        int student1 = comparison1.getAmbition() + comparison1.getDetermination() + comparison1.getTrick();
        int student2 = comparison2.getAmbition() + comparison2.getTrick() + comparison2.getDetermination();
        if (student1 > student2) {
            System.out.println(comparison1.getName() + " лучший ученик Слизерина, чем " + comparison2.getName());
        } else if (student1 < student2) {
            System.out.println(comparison2.getName() + " лучший ученик Слизерина, чем " + comparison1.getName());
        } else {
            System.out.println(comparison1.getName() + " " + comparison2.getName() + " Лучшие ученики Слизерина.");


        }
    }
}
