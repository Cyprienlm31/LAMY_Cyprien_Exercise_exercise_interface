public class Main {
    public static void main(String[] args) {
        Person[] persons = {
                new Person("Jean", "Dupont"),
                new Person("Alice", "Martin"),
                new Person("Marc", "Dupont"),
                new Person("Zoe", "Bernard"),
                new Person("Paul", "Lefevre")
        };

        Rectangle[] rectangles = {
                new Rectangle(3.0, 4.0),
                new Rectangle(1.5, 2.0),
                new Rectangle(5.0, 5.0),
                new Rectangle(2.0, 8.0),
                new Rectangle(6.0, 1.0)
        };

        Sorter sorter = new Sorter();
        sorter.sort(persons);
        for (Person person : persons) {
            person.printFullName();
        }
        sorter.sort(rectangles);
        for (Rectangle rectangle : rectangles) {
            System.out.println("area = " + rectangle.area());
        }
    }
}
