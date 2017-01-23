package Task1;


public class main {

    public static void main(String[] args) {
        Pen obj1=new Pen();
        obj1.setClr(color.RED);
        obj1.setName("Wolf");
        obj1.setPrice(45);

        Pen obj2=new Pen("Drake",34,color.BLUE);

        System.out.println("Equals "+obj1.equals(obj2));
        System.out.println("object1 "+obj1.toString());
        System.out.println("object2 "+obj2.toString());
        System.out.println("------------------");

        obj2.setClr(obj1.getColor());
        obj2.setPrice(obj1.getPrice());
        obj2.setName(obj1.getName());

        System.out.println("Equals "+obj1.equals(obj2));
        System.out.println("hashCode obj1"+obj1.hashCode());
        System.out.println("hashCode obj2"+obj2.hashCode());
    }
}
