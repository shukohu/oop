import java.util.Random;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Gryffindor harryPotter = new Gryffindor("Harry", "Potter", 100, 100, 100, 100, 100);
        Gryffindor hermioneGranger = new Gryffindor("Hermione", "Granger", 78, 100, 87, 76, 65);
        Gryffindor ronWeasley = new Gryffindor("Ron", "Weasley", 66, 54, 78, 72, 54);

        Slytherin dracoMalfoy = new Slytherin("Draco", "Malfoy", 98, 99, 100, 100, 88);
        Slytherin grahamMontague = new Slytherin("Graham", "Montague", 67, 54, 75, 78, 52);
        Slytherin gregoryGoyle = new Slytherin("Gregory", "Goyle", 78, 44, 52, 35, 67);

        Hufflepuff zachariasSmith = new Hufflepuff("Zachar", "Smith", 68, 57, 45, 87, 67);
        Hufflepuff cedricDiggory = new Hufflepuff("Cedric", "Diggory", 98, 76, 56, 89, 87);
        Hufflepuff justinFinchFletchley = new Hufflepuff("Justin", "Fletchley", 74, 54, 67, 73, 56);

        Ravenclaw zhouChang = new Ravenclaw("Zhou", "Chang", 87, 64, 84, 75, 43);
        Ravenclaw padmaPatil = new Ravenclaw("Padma", "Patil", 66, 43, 52, 78, 77);
        Ravenclaw marcusBelby = new Ravenclaw("Marcus", "Belby", 71, 34, 76, 88, 65);

        harryPotter.studentinformationGryffindor();
        hermioneGranger.studentinformationGryffindor();
        ronWeasley.studentinformationGryffindor();



        harryPotter.compareStudent(dracoMalfoy);
        hermioneGranger.compareStudent(cedricDiggory);


        ronWeasley.compareStudent(grahamMontague);


        Gryffindor.compareStudent(harryPotter, hermioneGranger);
        Hufflepuff.compareStudent(zachariasSmith, justinFinchFletchley);
        Ravenclaw.compareStudent(padmaPatil, marcusBelby);
        Slytherin.compareStudent(dracoMalfoy, gregoryGoyle);

        System.out.println();



    }

}