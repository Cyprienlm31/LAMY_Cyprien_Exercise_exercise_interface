import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();
        persons.add(new Person("Jean", "Dupont"));
        persons.add(new Person("Alice", "Martin"));
        persons.add(new Person("Marc", "Dupont"));
        persons.add(new Person("Zoe", "Bernard"));
        persons.add(new Person("Paul", "Lefevre"));

        List<Rectangle> rectangles = new ArrayList<>();
        rectangles.add(new Rectangle(3.0, 4.0));
        rectangles.add(new Rectangle(1.5, 2.0));
        rectangles.add(new Rectangle(5.0, 5.0));
        rectangles.add(new Rectangle(2.0, 8.0));
        rectangles.add(new Rectangle(6.0, 1.0));

        Collections.sort(persons);
        for (Person person : persons) {
            person.printFullName();
        }
        Collections.sort(rectangles);
        for (Rectangle rectangle : rectangles) {
            System.out.println("area = " + rectangle.area());
        }
    }
}
