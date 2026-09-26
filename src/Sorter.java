import static java.lang.Math.*;

public class Sorter {
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
        return 0;
    }

    public void sort(Person[] persons) {
        int n = persons.length;

        for (int j=0 ; j<n-1; j++){
            for (int i=0 ; i<n-1-j ; i++) {
                boolean swap = false;
                int compareSurname = compareWord(persons[i].getSurname(), persons[i+1].getSurname());
                if (compareSurname>0) {
                   swap = true;
                }
                else if (compareSurname==0) {
                    int compareName = compareWord(persons[i].getName(), persons[i + 1].getName());
                    if (compareName > 0) {
                        swap =true;
                    }
                }
                if (swap) {
                    Person tmp = persons[i];
                    persons[i] = persons[i + 1];
                    persons[i + 1] = tmp;
                }
            }

        }

    }
}
