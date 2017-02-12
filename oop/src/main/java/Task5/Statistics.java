package Task5;


import java.util.ArrayList;

public  class Statistics {

    public static String getStatistics(Group[] group,String fst_name,String lst_name)
        {

            Double max=0.0;
            String disp=new String();
            for(Group gr:group){
                for(Student st:gr.getStudents()){
                    if((st.getFst_name().equals(fst_name)) && (st.getLst_name().equals(lst_name)))
                    {
                        if(max<st.getMidMark()) {
                            max = st.getMidMark();
                            disp=gr.getDisp().toString();
                        }
                        else if(max.equals(st.getMidMark()))
                            disp+=", "+gr.getDisp().toString();
                    }
                }
            }
            return "Student:"+fst_name+" "+lst_name+" best mark in group: "+disp+" is:"+max;

        }

}
