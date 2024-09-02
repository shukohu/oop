public class Hogwarts {
    private String name;
    private String surname;
    private int magicPower;
    private int transgression;

    public Hogwarts(String name, String surname, int magicPower, int transgression) {
        this.name = name;
        this.surname = surname;
        this.magicPower = magicPower;
        this.transgression = transgression;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getPowerOfMagic() {
        return magicPower;
    }

    public int getTransgressionDistance() {
        return transgression;
    }

    public void compareStudent(Hogwarts student) {
        int comparison1 = this.magicPower + this.transgression;
        int comparison2 = student.magicPower + student.transgression;
        if (comparison1 > comparison2) {
            System.out.println(this.getName() + " обладает большей мощностью магии, чем " + student.getName());
        } else if (comparison1 < comparison2) {
            System.out.println(student.getName() + " обладает большей мощностью магии, чем " + this.getName());
        } else {
            System.out.println(this.getName() + " " + student.getName() + " Обладают большой мощностью магии");
        }
    }
}
