package Task4;


import Task2.Stationary;

import java.util.Comparator;

public class SortedByName implements Comparator<Stationary> {
    @Override
    public int compare(Stationary o1, Stationary o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
