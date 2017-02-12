package Task5;

import java.util.ArrayList;
import java.util.Random;

public class task5 {
    public static void main(String[] args) {


        Group[] gr = new Group[6];
        Student[] st = new Student[4];
        //number of stud that will be in group
        Random togr = new Random();
        Random mark = new Random();
        //init group by index; 0=MATH, etc
        for (int i = 0; i < gr.length; i++)
            gr[i] = new Group(i);

        st[0] = new Student("Artyom", "Ageev");
        st[1] = new Student("Andrey", "Ivanov");
        st[2] = new Student("Petr", "Pavlov");
        st[3] = new Student("Kostya", "Atroshenkov");

        for (Group Gr1 : gr)
            for (int i = 0; i < togr.nextInt(st.length) + 1; i++)
                Gr1.addStudent(st[i]);
        for(int k=0;k<4;k++) {
            for (Group Gr : gr)
                for (int j = 0; j < Gr.getStudents().size(); j++) {

                    if (Gr.getDisp().ordinal() % 2 == 0)
                        Gr.getStudent(j).addMark(mark.nextInt(4) + 2);
                    else
                        Gr.getStudent(j).addMark(mark.nextInt(4) + 2.0);
                }
        }
        for (Group b:gr) {
            System.out.println(b.toString());
        }
        System.out.println(Statistics.getStatistics(gr,"Artyom","Ageev"));

    }
}
