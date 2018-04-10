package Application.controler;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Sort {
    public static <T> void fill(ArrayList<T> list, T val, Comparator<T> comparator) {
        Collections.sort(list, comparator);
    }
}



