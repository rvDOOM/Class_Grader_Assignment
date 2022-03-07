import java.io.File;
        import java.util.*;

public class UnitTestRunner {

    public static void main(String[] args) {

        UnitTest obj = new UnitTest();      //Create UnitTest object
        Scanner input = new Scanner(System.in);     //Scanner object to read in files from file allExams.txt
        ArrayList<Student> student = new ArrayList<Student>();      //ArrayList holds student info
        HashMap<String, ArrayList<String>> finalResults = new HashMap<String, ArrayList<String>>();     //HashMap key: student name values: average
        UnitTest grade = new UnitTest();

        //iterate through scanner item input
        try{
            input = new Scanner(new File("/home/rvdoom/IdeaProjects/Class_Grader_Assignment/src/allExams.txt"));
        } catch (Exception e) {
            System.out.println("File not found!");
        }

        //iterate through scanner item input
        while(input.hasNext()) {
            //instantiate ArrayList of studentAnswers at start of loop
            //This allows the program to populate a new list every time the loop begins
            ArrayList<String> studentAnswers = new ArrayList<String>();
            //Next few lines grab all the information from the file and puts them in their respective variables/objects
            String lastName = input.next();
            String firstName = input.next();
            Student s = new Student(lastName, firstName);
            String fullName = lastName + firstName;
            student.add(s);                 //Add student object to ArrayList
            //Input all of a students answers into a single string
            String answers = input.nextLine();
            answers = answers.trim();                   //trim the space between the name and the first answer
            //Parse the string to remove spaces. Add answers into ArrayList
            String[] parse = answers.split("\\s");
            for (String value : parse) {
                studentAnswers.add(value);
                finalResults.put(fullName.toLowerCase(), studentAnswers);       //Insert ArrayList answers into hashmap
            }
            s.setAverage(grade.calculateGrade(finalResults.get(fullName.toLowerCase())));                 //call on setAverage function to set students average as the value in the hashmap
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