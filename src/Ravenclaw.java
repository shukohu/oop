public class Ravenclaw extends Hogwarts {
    private int smart;
    private int wise;
    private int witty;

    public Ravenclaw(String name, String surname, int smart, int wise, int witty, int magicPower, int transgression) {
        super(name, surname, magicPower, transgression);
        this.smart = smart;
        this.wise = wise;
        this.witty = witty;

    }

    public int getSmart() {
        return smart;
    }

    public int getWise() {
        return wise;
    }

    public int getWitty() {
        return witty;
    }

    @Override
    public String toString() {
        return getName() + smart + wise + witty;
    }


    public void studentInformationRavenclaw() {
        System.out.println(getName() + " " + smart + " " + wise + " " + witty);
    }

    public static void compareStudent(Ravenclaw comparison1, Ravenclaw comparison2) {
        int student1 = comparison1.getSmart() + comparison1.getWise() + comparison1.getWitty();
        int student2 = comparison2.getSmart() + comparison2.getWitty() + comparison2.getWise();
        if (student1 > student2) {
            System.out.println(comparison1.getName() + " лучший ученик Когтевранца, чем " + comparison2.getName());
        } else if (student1 < student2) {
            System.out.println(comparison2.getName() + " лучший ученик Когтевранца, чем " + comparison1.getName());
        } else {
            System.out.println(comparison1.getName() + " " + comparison2.getName() + " Лучшие ученики Когтевранца.");
        }
    }
}

