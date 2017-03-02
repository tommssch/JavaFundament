package Task2;

import java.util.Locale;
import java.util.ResourceBundle;

public class Quiz {
        private ResourceBundle res;
        private ResourceBundle quest;

        public Quiz(Locale locale){
            res= ResourceBundle.getBundle("res",locale);
            quest=ResourceBundle.getBundle("quest",locale);
        }

        public String getQuestion(int key){
            if(key<0)
                return "wrong number of question";
            if(key>this.getSizeQuest())
                return "wrong number of question";

            return quest.getString("quest"+key);
        }
        public String getAnswer(int key)  {

            if(key<0)
                return "wrong number of answer";
            if(key>this.getSizeQuest())
                return "wrong number of answer";

           return res.getString("answer" + key);

        }
        public int getSizeQuest(){
            return quest.keySet().size();
        }

}

