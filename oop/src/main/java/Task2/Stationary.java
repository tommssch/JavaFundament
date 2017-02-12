package Task2;

public class Stationary {

private int price;
private String name;

public Stationary(){}

public Stationary(String nm,int pr){
    setName(nm);
    setPrice(pr);
}
public void setPrice(int pr1){
    price=pr1;
}
public void setName(String nm1){
    name=nm1;
}
public String getName(){
    return name;
}
public int getPrice(){
    return  price;
}

public boolean equals(Object ob){
    if(this==ob)
        return true;
    if(ob==null|| getClass()!=ob.getClass())
        return false;

    Stationary obj= (Stationary)ob;

    if(name==null?obj.getName()==null:name.equals(obj.getName()))
        if(price==obj.getPrice())
            return true;
    return false;
}
public String toString(){
    return "class:"+this.getClass().toString()+" name:"+name+" price:"+price;
}

public String get(){
    return name+"| price:"+price;
}

    @Override
    public int hashCode() {
        int result = price;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }
}
