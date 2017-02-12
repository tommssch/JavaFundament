package Task4;


import Task2.Stationary;

import java.util.Comparator;

public class SortedByBoth implements Comparator<Stationary> {

    @Override
    public int compare(Stationary o1, Stationary o2) {
        int pr1=o1.getPrice();
        int pr2=o2.getPrice();

        int result1=pr1-pr2;
        int result2=o1.getName().compareTo(o2.getName());

        return result1+result2;

    }
}
