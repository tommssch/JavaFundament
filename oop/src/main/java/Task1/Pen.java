package Task1;
//Simple class Pen with price,name,Color of ink.
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


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Pen pen = (Pen) o;

        if (price != pen.price) return false;
        if (name != null ? !name.equals(pen.name) : pen.name != null) return false;
        return clr == pen.clr;
    }

    public boolean equalss(Object o)
    {
        if (this==o)
            return true;
        if(o ==null|| getClass() != o.getClass())
            return false;

        Pen p=(Pen)o;

        if (name==null?p.getName()==null:name.equals(p.getName()))
            if (this.price == p.getPrice())
                if (this.clr == p.getColor())
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
        return "Class:"+this.getClass().toString()+" name:"+name+" price:"+price+" color:"+clr;
    }
}
