package Task5;


import java.util.ArrayList;

public class Student<T>{

    private String fst_name;
    private String lst_name;
    ArrayList<T> marks;


    public Student(){}

    public Student(String fst,String lst){
        setFst_name(fst);
        setLst_name(lst);
        marks=new ArrayList<>(5);
    }


    public void setFst_name(String nm){
        fst_name=nm;
    }
    public void setLst_name(String nm){
        lst_name=nm;
    }
    public void addMark(T mk){
        marks.add(mk);
    }
    public void removeMark( int index){
        marks.remove(index);
    }
    public Double getMidMark(){
        Double num=0.0;
        for(int i=0;i<marks.size();i++)
           num+=Double.parseDouble(marks.get(i).toString());
        return num.doubleValue()/marks.size();
    }

    public String getFst_name(){
        return this.fst_name;
    }
    public String getLst_name(){return this.lst_name;}
    public  T getMark(int index){
        return marks.get(index);
    }
    public ArrayList<T> getMarks(){
        return marks;
    }

    @Override
    public String toString() {
        return "Student{" +
                "fst_name='" + fst_name + '\'' +
                ", lst_name='" + lst_name + '\'' +
                ", marks=" + marks +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student<?> student = (Student<?>) o;

        if (fst_name != null ? !fst_name.equals(student.fst_name) : student.fst_name != null) return false;
        if (lst_name != null ? !lst_name.equals(student.lst_name) : student.lst_name != null) return false;
        return marks != null ? marks.equals(student.marks) : student.marks == null;
    }

    @Override
    public int hashCode() {
        int result = fst_name != null ? fst_name.hashCode() : 0;
        result = 31 * result + (lst_name != null ? lst_name.hashCode() : 0);
        result = 31 * result + (marks != null ? marks.hashCode() : 0);
        return result;
    }

}
