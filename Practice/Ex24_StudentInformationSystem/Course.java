package Ex24_StudentInformationSystem;

public class Course {
    // qualifications determined
    Teacher courseTeacher;
    String name;
    String code;
    String prefix;
    int note;

    //
    Course(String name, String code, String prefix){
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.note = 0;
    }

    // If the course codes match, add the teacher, otherwise it will give an error message
    public void addTeacher(Teacher t){
        if (this.prefix.equals(t.branch)) {
            this.courseTeacher = t; System.out.println("The operation is successful"); }
        else { System.out.println(t.name + " Academician cannot teach this course."); }
    }
}

