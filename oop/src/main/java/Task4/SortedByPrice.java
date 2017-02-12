package Task4;


import Task2.Stationary;

import java.util.Comparator;

public class SortedByPrice implements Comparator<Stationary> {
    @Override
    public int compare(Stationary o1, Stationary o2) {
        int pr1=o1.getPrice();
        int pr2=o2.getPrice();
        return pr1-pr2;
    }
}
