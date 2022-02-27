import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;


public class UnitTest {
    private Scanner input = new Scanner(System.in);
    private ArrayList<String> answerKey = new ArrayList<String>();

    public void UnitTest(){
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

    public double calculateGrade(ArrayList<String> Students){
        double average = 0.0;
        int counter = 0;
        for(String i : answerKey){
            if(Students == answerKey)
                counter++;
        }
        return ((double)counter/answerKey.size())*100;
    }
}
