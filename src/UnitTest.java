import java.io.File;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;


public class UnitTest {
    private Scanner input = new Scanner(System.in);
    private ArrayList<String> answerKey = new ArrayList<String>();

    public UnitTest(){
        try{
            input = new Scanner (new File("/home/rvdoom/IdeaProjects/Class_Grader_Assignment/src/answers.txt"));
        } catch (Exception e) {
            System.out.println("File not found!");
        }

        while(input.hasNext()){
            String answer = input.next();
            answerKey.add(answer);
        }

        input.close();
    }

    public double calculateGrade(ArrayList<String> answers){
        double average = 0.0;
        double counter = 0;
        for(int i = 0; i < answerKey.size(); i++){
            if(Objects.equals(answers.get(i), answerKey.get(i)))
                counter++;
        }
        return (counter/answerKey.size())*100;
    }
}
