import java.util.Scanner;

public class javaquizgame {
    public static void main(String[] args) {
        String[] questions={"Who was the fist president of india","First elment of periodic table","First PM of india","Fist metal of peiodic table","Current president of india" };
        String[][] options={
            {"a.Dr Rajendra Prasad","b. Pdt Jawaharlal Nehru","c. Dr Bhimrao Ambedekar","d.Dr Rammanohar Lohia"},
            {"a.H","b.He","c.Li","d.Kr"},
            {"a.Dr Rajendra Prasad","b. Pdt Jawaharlal Nehru","c. Dr Bhimrao Ambedekar","d.Dr Rammanohar Lohia"},
            {"a.H","b.He","c.Li","d.Kr"},
            {"a.Dr Rajendra Prasad","b.Narendra Modi","c. Dr Bhimrao Ambedekar","d.Droupdi Murmu"},
        };
        String[] ans={"a","a","b","c","d"};
        int score=0;
        String guess="";
        Scanner input=new Scanner(System.in);
        System.out.println("*******************************");
        System.out.println("Welcome to the java quiz game");
        System.out.println("*******************************");
        for(int i=0;i<questions.length;i++)
        {
            System.out.println(questions[i]);
            for(String option:options[i])
            {
                System.out.println(option);
            }

            System.out.println("Enter your guess");
            guess=input.next();
            if(guess.equalsIgnoreCase(ans[i]))
            {
                System.out.println("************");
                System.out.println("correct");
                System.out.println("*************");
                score++;
            }
            else
            {
               System.out.println("************");
                System.out.println("wrong");
                System.out.println("*************");  
            }
        }

        System.out.println("your final score is "+score+" out of "+questions.length);



        input.close();
    }
}
