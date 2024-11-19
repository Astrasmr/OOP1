import model.GriffindorStudent;
import model.HogwartsStudent;

public class Main {
    public static void main(String[] args) {
        GriffindorStudent harry = new GriffindorStudent("Harry Potter",
                1, 2, 3, 4, 5);
        GriffindorStudent ron = new GriffindorStudent( "Ron Weasley", 2,
                6,4, 10, 2);
        ron.challengeStudent(harry);
        HogwartsStudent malfoy = new HogwartsStudent("Malfoy", 9,5);
        HogwartsStudent germiona = new HogwartsStudent("Germiona", 4,20);
        malfoy.challengeStudent(germiona);
    }
}