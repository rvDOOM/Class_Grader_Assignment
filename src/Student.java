public class Student {
    private String lastName;
    private String firstName;
    private double average = 0.0;


    public Student(){
        lastName = "Doe";
        firstName = "John";
    }

    public Student(String lastName, String firstName){
        this.lastName = lastName;
        this.firstName = firstName;
    }


    public String getLastName() {
        return lastName;
    }


    public String getFirstName() {
        return firstName;
    }


    public double getAverage() {
        return average;
    }

    public void setAverage(double average) {
        this.average = average;
    }
}

