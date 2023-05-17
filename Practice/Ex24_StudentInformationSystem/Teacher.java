package Ex24_StudentInformationSystem;

public class Teacher {
    // qualifications determined
    String name;
    String MPNo;
    String branch;


    // values passed into class
    Teacher(String name, String MPNo, String branch) {
        this.name = name;
        this.MPNo = MPNo;
        this.branch = branch;
    }

    // teacher outputs information to the screen
    public void printTeacher() {
        if (this.name != null) {
            System.out.println(this.name + " Academician of the course: " + this.branch);
        } else {
            System.out.println(null + " to the course no Academician has been appointed.");
        }
    }
}
