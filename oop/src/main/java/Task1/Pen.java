package Task1;

public class Pen {

    private  String name;
    private int price;
    private color clr;



    public Pen(){}

    public Pen(String nm,int pr,color clr1){
        this.name=nm;
        this.price=pr;
        this.clr=clr1;
    }

    public void setName(String nm1) {
        this.name=nm1;
    }

    public void setPrice(int pr1){
        this.price=pr1;
    }

    public void setClr(color clr1){
        this.clr=clr1;
    }

    public String getName()
    {
        return this.name;
    }

    public int getPrice()
    {
        return this.price;
    }

    public color getColor()
    {
        return  this.clr;
    }



    public boolean equals(Pen o)
    {
        if(this.name.equals(o.getName()))
            if(this.price==o.getPrice())
                if(this.clr==o.getColor())
                    return true;

        return false;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + price;
        result = 31 * result + (clr != null ? clr.hashCode() : 0);
        return result;
    }
    public String toString(){
        return "name:"+name+" price:"+price+" color:"+clr;
    }
}
