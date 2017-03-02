package Task1;


import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Formatter;

public class CrazyLogger {

    private StringBuilder logger;
    private final static String  template="%tF:%tR–%s;";
    private Formatter format;


    CrazyLogger(){
        logger= new StringBuilder();
        format =new Formatter(logger);
    }
     void printToLog(String message){

            format.format(template,LocalDate.now(),LocalTime.now(),message);
            format.flush();
            logger.append('\n');

    }

     void printToLog(String message,LocalDate date,LocalTime time){

        format.format(template,date,time,message);
        format.flush();
        logger.append('\n');

    }

     String findInfobyDate(LocalDate date, boolean out){
        StringBuilder substr=new StringBuilder(logger);
        StringBuilder search=new StringBuilder();
        int end;
        int strt=substr.indexOf(date.toString());

        while(strt!=-1)
        {
            end=substr.indexOf(";",strt);
            search.append(substr,strt,end+2);
            substr.replace(strt,end+1,"");
            strt=substr.indexOf(date.toString());
        }

        if(out)
            System.out.println(search.toString());
        return search.toString();
    }
    String findInfobyTime(LocalTime time, boolean out){
        StringBuilder sbstr=new StringBuilder(logger);
        StringBuilder search=new StringBuilder();
        int end;
        int strt=sbstr.indexOf(time.toString());
        while(strt!=-1){

            end=sbstr.indexOf(";",strt);
            search.append(sbstr.substring(strt-11,end+1));
            sbstr.replace(strt-11,end+1,"");
            strt=sbstr.indexOf(time.toString());
        }
        if(out)
            System.out.println(search);
        return search.toString();
    }
     String findInfobyMessage(String mess,boolean out)
    {
        StringBuilder search=new StringBuilder();
        StringBuilder substr=new StringBuilder(logger);
        int end;
        int strt=substr.indexOf(mess);
        while (strt!=-1)
        {
            end=substr.indexOf(";",strt);
            search.append(substr.substring(strt-18,end+1));
            substr=substr.replace(strt-18,end+1,"");
            strt=substr.indexOf(mess);
        }
        if(out)
            System.out.println(search.toString());
        return search.toString();
    }
    public StringBuilder getLog(){
        return logger;
    }
}
