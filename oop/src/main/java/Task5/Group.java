package Task5;


import java.util.ArrayList;
import java.util.Arrays;

public class Group {
    private discipline disp;
    private ArrayList<Student> stud;

    public Group(){}
    public Group(discipline dis){this.disp=dis;}
    public Group(int i){
        switch (i){
            case 0:disp=discipline.MATH;
                break;
            case 1:disp=discipline.RUS_LANG;
                break;
            case 2:disp=discipline.PHYSICS;
                break;
            case 3:disp=discipline.FOR_LANG;
                break;
            case 4:disp=discipline.CHEMISTRY;
                break;
            case 5:disp=discipline.INFORMATICS;
                break;
            default:disp=discipline.MATH;
        }
        stud=new ArrayList<>(5);
    }

    public discipline getDisp() {
        return disp;
    }

    public void setDisp(discipline disp) {
        this.disp = disp;
    }

    public ArrayList<Student> getStudents() {return stud;}
    public Student getStudent(int index){return stud.get(index);}

    public void setStud(ArrayList<Student> stud) {
        this.stud = stud;
    }
    public  void addStudent(Student st){

        stud.add(new Student(st.getFst_name(),st.getLst_name()));}
   public void delStudent(int index){
        stud.remove(index);
    }

    @Override
    public String toString() {
        return "Group{" +
                "disp=" + disp +
                ", stud=" + stud +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Group group = (Group) o;

        if (disp != group.disp) return false;
        return stud != null ? stud.equals(group.stud) : group.stud == null;
    }

    @Override
    public int hashCode() {
        int result = disp != null ? disp.hashCode() : 0;
        result = 31 * result + (stud != null ? stud.hashCode() : 0);
        return result;
    }
}
