package Task2;


import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;

public class task2main {

    public static void main(String[] args) {
        Quiz quiz;
        Scanner sc = new Scanner(System.in);

            System.out.println("Hello User!!!\n" +
                    "Please Enter number to choose Language:\n" +
                    "1 for ENGLISH\n" +
                    "2 for RUSSIAN");

            if(sc.nextInt()==1)
                 quiz= new Quiz(new Locale("en"));
            else
                 quiz = new Quiz(new Locale("ru"));

        for(int i=1;i<quiz.getSizeQuest()+1;i++)
            System.out.println(i+":"+quiz.getQuestion(i)+'\n');

        System.out.println("Please Enter number of question where you want to get answer\n" +
                "To Exit Enter 0\n");
        int choose;
        choose=sc.nextInt();

        while(choose!=0)
        {
            System.out.println(quiz.getAnswer(choose));
            choose=sc.nextInt();
        }
    }
}