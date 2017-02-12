package Task3;

import Task1.color;
import Task2.Stationary;

public class inheritance
{
    public static void main(String[] args) {

        Stationary[]  novice=new Stationary[3];
        novice[0]= new Paper(300,"A4",40);
        novice[1]=new Pencil(100, color.BLACK,"THE BEST!!!!");
        novice[2]=new Scissors(299,30,"for paper");

        for(Stationary st:novice){
            System.out.println(st.toString());
        }


    }
}
