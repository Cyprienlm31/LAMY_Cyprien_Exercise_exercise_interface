import static java.lang.Math.*;

public class Sorter {

    public <T extends Sortable<T>> void sort(T[] objects) {
        int n = objects.length;

        for (int j=0 ; j<n-1; j++){
            for (int i=0 ; i<n-1-j ; i++) {
                boolean compare = objects[i].isBigger(objects[i], objects[i+1]);

                if (compare) {
                    T tmp = objects[i];
                    objects[i] = objects[i + 1];
                    objects[i + 1] = tmp;
                }
            }

        }

    }
}
