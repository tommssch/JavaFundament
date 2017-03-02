package Task1;

import java.time.LocalDate;
import java.time.LocalTime;

public class task1main {

    public static void main(String[] args){

        LocalDate s=LocalDate.of(1994,12,14);
        LocalTime t=LocalTime.of(12,14);
        InterruptedException e=new InterruptedException("Oops");
        CrazyLogger log=new CrazyLogger();
        log.printToLog("sst");
        log.printToLog("Bad");
        log.printToLog("SomeMessage to you",s,t);
        log.printToLog(e.toString());
        log.findInfobyMessage("SomeMessage",true);
        log.findInfobyTime(t,true);

        log.findInfobyDate(s,true);

        //System.out.println(log.getLog());


    }

}
