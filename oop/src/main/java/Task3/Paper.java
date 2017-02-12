package Task3;

import Task2.Stationary;

public class Paper extends Stationary {
    private int num;
    private String formate;

    public Paper(int pr1,String formate,int num){
        super("Paper",pr1);
        this.num=num;
        this.formate=formate;
    }
    public int getNum(){
        return num;
    }
    public String getFormate(){
        return formate;
    }
    public String toString(){
        return getClass().toString()+"| name: "+get()+"| formate:"+getFormate()+"| num of lists: "+getNum();
    }
}
