package Task4;

import Task1.color;
import Task2.Stationary;
import Task3.Paper;
import Task3.Pencil;
import Task3.Scissors;



import java.util.Arrays;


public class interfaces {
    public static void main(String[] args) {

        SortedByBoth comp1=new SortedByBoth();
        SortedByName comp2=new SortedByName();
        SortedByPrice comp3=new SortedByPrice();

        Stationary[]  novice=new Stationary[3];
        novice[0]=new Pencil(100, color.BLACK,"THE BEST!!!!");
        novice[1]= new Paper(300,"A4",40);
        novice[2]=new Scissors(50,30,"for paper");


        System.out.println("SORTED BY PRICE");
        Arrays.sort(novice,comp3);
        for (Stationary aNovice : novice) System.out.println(aNovice.toString());

        System.out.println("SORTED BY NAME");
        Arrays.sort(novice,comp2);
        for (Stationary aNovice : novice) System.out.println(aNovice.toString());

        System.out.println("SORTED BY PRICE AND NAME");
        Arrays.sort(novice,comp1);
        for (Stationary aNovice : novice) System.out.println(aNovice.toString());
  }
}
