package Task3;


import lombok.SneakyThrows;

import java.io.*;
import java.util.ArrayList;
import java.util.regex.*;

public class JavaRegExp {

    private StringBuilder search;
    private Pattern pat;
    private Matcher mat;
    private ArrayList<StringBuilder> img;
    private ArrayList<StringBuilder> sequence;
    private ArrayList<StringBuilder> textlink;
    private final static String EXPR1 ="<img (\\w+=\"[^\"]*\" )*(src=\"\\./[^\"]+\")( \\w+=\"[^\"]*\")*>";
    private final static String EXPR2="\\([Рр]ис\\. [0-9]+[ и [0-9]+]*\\)";

    public JavaRegExp(String file1) throws IOException {

        search= new StringBuilder();
        sequence=new ArrayList<>(5);
        img=new ArrayList<>(5);
        textlink=new ArrayList<>(5);
        try (BufferedReader br = new BufferedReader(
                new InputStreamReader(
                        new FileInputStream(file1),
                        "cp1251"))) {
            while (br.ready()) {
                search.append(br.readLine()).append('\n');
            }
        }

    }
    public String getInfo(){
        return search.toString();
    }

    public void findImg(){
        pat=Pattern.compile(EXPR1);
        mat=pat.matcher(search.toString());
        while(mat.find())
            img.add(new StringBuilder(mat.group()));

    }
    public void findSequance(){
        pat=Pattern.compile(EXPR2);
        mat=pat.matcher(search.toString());
        while(mat.find())
            sequence.add(new StringBuilder(mat.group()));

    }
    public void printSearch(){
        System.out.println("Size:"+img.size());
        if(img.size()==0)
            System.out.println("Array is empty");
        for(StringBuilder sa:img)
            System.out.println(sa.toString());
    }
    public void printSequence(){
        System.out.println("Size:"+sequence.size());
        if(sequence.size()==0)
            System.out.println("Array is empty");
        for(StringBuilder sa:sequence)
            System.out.println(sa.toString());
    }


    @SuppressWarnings("ResultOfMethodCallIgnored")
    public void isGoStraight(){
        pat=Pattern.compile("[0-9]+");
        if(sequence.size()==0)
        {
            System.out.println("Array is empty");
            return;
        }
        mat=pat.matcher(sequence.get(0));
        mat.find();
        int pred=Integer.parseInt(mat.group());
        int now=0;
        for(int i=1;i<sequence.size();i++){
            mat=pat.matcher(sequence.get(i).toString());
            mat.find();
            now=Integer.parseInt(mat.group());
            if(pred>now)
            {
                System.out.println("pred:"+pred+" now:"+mat.group());
                System.out.println("Isnt Go Straight");
                return;
            }
            pred=now;
        }
        System.out.println("Is go Straight");
    }
    public void printText(){
        parseText();
        System.out.println(textlink.size());
        if(textlink.size()==0) {
            System.out.println("Array is emprty");
            return;
        }
        for(StringBuilder sa:textlink)
            System.out.println(sa.toString());
    }

    private void parseText(){
        StringBuilder parse=new StringBuilder(search);
        parse.replace(0,parse.length(),parse.toString().replaceAll("&nbsp;",""));
        parse.replace(0,parse.length(),parse.toString().replaceAll("<[^<>]+>",""));
        parse.replace(0,parse.length(),parse.toString().replaceAll("\\n",""));
        pat=Pattern.compile("[А-ЯЁ][^.!?]*(\\([Рр]ис\\. [0-9]+[ и [0-9]+]*\\)[^.?!(]*)+[.|?|!]{1,3}");
        mat=pat.matcher(parse.toString());
        while(mat.find())
            textlink.add(new StringBuilder(mat.group()));

    }


}
