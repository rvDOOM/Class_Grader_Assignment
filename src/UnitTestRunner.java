import java.io.File;
import java.util.*;

public class UnitTestRunner {

    public static void main(String[] args) {

        UnitTest obj = new UnitTest();      //Create UnitTest object
        Scanner input = new Scanner(System.in);
        ArrayList<Student> student = new ArrayList<Student>();
        HashMap<String, ArrayList<String>> finalResults = new HashMap<String, ArrayList<String>>();
        UnitTest grade = new UnitTest();

            try{
                input = new Scanner(new File("/home/rvdoom/IdeaProjects/Class_Grader_Assignment/src/allExams.txt"));
            } catch (Exception e) {
                System.out.println("File not found!");
            }

            while(input.hasNext()){
                ArrayList<String> studentAnswers = new ArrayList<String>();
                String lastName = input.next();
                String firstName = input.next();
                Student s = new Student(lastName, firstName);
                String fullName = lastName + firstName;
                student.add(s);
                String answers = input.nextLine();
                answers = answers.trim();
                String[] parse = answers.split("\\s");
                for (String value : parse) {
                    studentAnswers.add(value);
                    finalResults.put(fullName.toLowerCase(), studentAnswers);
                }
                s.setAverage(grade.calculateGrade(studentAnswers));
                System.out.println(firstName + " " + lastName);
                System.out.println("Average GPA: " + s.getAverage() + "\n");

            }
            input.close();


//
//            Iterator<Map.Entry<String, ArrayList<String>>> it = finalResults.entrySet().iterator();
//            for(Map.Entry<String, ArrayList<String>> me : finalResults.entrySet()){
//                System.out.println("Key: " + me.getKey() + "\n" + me.getValue());
//                UnitTest calculate = new UnitTest();
//
//            }



        }

    }
