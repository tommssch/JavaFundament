package Task3;

import Task2.Stationary;


public class Scissors extends Stationary {
    private String model;
    private int quality;

    public Scissors(int pr,int qual,String md){
        super("Sciccors",pr);
        model=md;
        quality=qual;
    }
    public String getModel(){
        return model;
    }
    public int getQuality(){
        return quality;
    }
    public String toString(){
        return getClass().toString() +"| name:"+ get() + "| model:"+getModel()+"| quality:"+getQuality();
    }


}
