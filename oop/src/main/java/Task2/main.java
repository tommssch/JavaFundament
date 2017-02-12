package Task2;


public class main {
    public static void main(String[] args) {

        Stationary[] sta= new Stationary[5];
        sta[0]=new Stationary("Pen",40);
        sta[1]=new Stationary("Book",450);
        sta[2]=new Stationary("Pencil",20);
        sta[3]=new Stationary("Pack of paper",250);
        sta[4]=new Stationary("Scissors",100);

        Worker wk=new Worker(sta,"Ivan");
        System.out.println(wk.getName()+" Summ:"+wk.getStatistics());
        System.out.println(wk.getStatistic());
    }
}
