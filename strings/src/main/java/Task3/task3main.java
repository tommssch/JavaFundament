package Task3;

import java.io.IOException;
import java.util.regex.*;

public class task3main {

    public static void main(String[] args) throws IOException {

        String path="strings\\src\\main\\resources\\javahtml.html";
        JavaRegExp jre1=new JavaRegExp(path);
        jre1.findImg();
        jre1.findSequance();
        jre1.isGoStraight();
        jre1.printText();

    }

}
