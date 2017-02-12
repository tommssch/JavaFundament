package Task3;


import Task1.color;
import Task2.Stationary;

public class Pencil extends Stationary {

    private color col;
    private String model;


    public Pencil(int pr,color clr,String md){
        super("Pencil",pr);
        col=clr;
        model=md;
    }
    public String getModel(){
        return model;
    }
    public color getCol(){
        return col;
    }
    public String toString(){
        return getClass().toString()+ "| name: "+get()+"| model:"+getModel()+"| color:"+getCol();
    }

}
