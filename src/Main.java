public class Main {
    public static void main(String[] args) {
        Person[] persons = {
                new Person("Jean", "Dupont"),
                new Person("Alice", "Martin"),
                new Person("Marc", "Dupont"),
                new Person("Zoe", "Bernard"),
                new Person("Paul", "Lefevre")
        };
        Sorter sorter = new Sorter();
        sorter.sort(persons);
        for (Person person : persons) {
            person.printFullName();
        }
    }
}
