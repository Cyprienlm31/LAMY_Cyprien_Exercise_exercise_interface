import static java.lang.Math.min;

public class Person implements Sortable<Person> {
    private String name;
    private String surname;
    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }
    public String getName() { return name; }

    public String getSurname() { return surname; }

    public void printFullName() {
        System.out.println(name + " "+ surname);
    }

    private int compareWord(String word1, String word2) {
        int n = min(word1.length(), word2.length());
        for (int i=0; i<n; i++) {
            char a = word1.charAt(i);
            a = Character.toLowerCase(a);
            char b = word2.charAt(i);
            b = Character.toLowerCase(b);
            if (a != b) {
                return a-b;
            }
        }
        return word1.length() - word2.length();
    }

    @Override
    public boolean isBigger(Person person1, Person person2) {
        int comp = compareWord(person1.surname, person2.surname);
    if (comp >0) {
        return true;
    }
    else if (comp == 0) {
        int comp2 = compareWord(person1.name, person2.name);
        return (comp2 >0);
        }
    else {
        return false;
    }
    }
}
