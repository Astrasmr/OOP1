import model.GriffindorStudent;
import model.HogwartsStudent;

public class Main {
    public static void main(String[] args) {
        GriffindorStudent harry = new GriffindorStudent("Harry Potter",
                1, 2, 3, 4, 5);
        GriffindorStudent ron = new GriffindorStudent( "Ron Weasley", 2,
                6,4, 1, 2);
        ron.challengeStudent(ron);

    }
}