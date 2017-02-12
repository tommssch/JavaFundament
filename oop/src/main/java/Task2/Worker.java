package Task2;

public class Worker
{
    private String name;
    private Stationary[] st;

    public Worker(Stationary[] st1,String nm) {
        init(st1);
        setName(nm);

    }
    public void setName(String nam){
        this.name=nam;
    }
    public String getName(){
        return name;
    }
    public int  getStatistics(){
        int sum=0;
        for (Stationary aSt : st) sum += aSt.getPrice();

        return sum;
    }

    public String getStatistic(){

        String str= "";
        for (Stationary sta:st) {
            str+= sta.get()+'\n';
        }
        return name +" has: \n"+str;
    }
    private void init(Stationary[] st1){
        st=new Stationary[st1.length];

        for (int i=0;i<st1.length;i++) {
            st[i]=new Stationary(st1[i].getName(),st1[i].getPrice());
        }

    }


}
