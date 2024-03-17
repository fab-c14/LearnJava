import java.util.Scanner;

public class QuestionService {
    // how we will represent questions
    Question[] questions = new Question[5]; // at this point i need five questions
    // for now we have hardcoded questions
    String[] selection = new String[5];

    public QuestionService() {
        questions[0] = new Question(1, "Size of int?", "1", "2", "3", "4", "4");
        questions[1] = new Question(2, "Size of double", "1", "8", "3", "4", "8");
        questions[2] = new Question(3, "Size of char?", "1", "2", "3", "4", "2");
        questions[3] = new Question(4, "Size of long?", "1", "2", "8", "4", "8");
        questions[4] = new Question(5, "Size of boolean?", "1", "2", "3", "4", "1");

    }

    public void playQuiz() {
        for (Question q : questions) {
            System.out.println("Question no : " + q.getId());
            System.out.println(q.getQuestion());
            System.out.print("A) " + q.getOpt1() + "\t");
            System.out.print("B) " + q.getOpt2() + "\t");
            System.out.print("C) " + q.getOpt3() + "\t");
            System.out.print("D) " + q.getOpt4() + "\t");
            System.out.println();

            Scanner sc = new Scanner(System.in); // system.in is for input
            selection[q.getId() - 1] = sc.nextLine(); // whatever users write in line will be stored in variable-- but
                                                      // value will
            // be
            // changed everytime so it should be array
        }
        System.out.println("Your Answers : ");
        for (String s : selection) {

            System.out.println(s);
        }
    }

    // class can have multipile variables
    public void printScore() {
        int score = 0;
        // check all five answers

        for (int i = 0; i < questions.length; i++) {
            Question que = questions[i];
            String actualAnswer = que.getAnswer();
            String userAnswer = selection[i];
            if (actualAnswer.equals(userAnswer)) {
                score++;
            }
        }
        System.out.println("Your Score is : " + score);
    }

}
