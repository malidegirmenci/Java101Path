package Ex24_StudentInformationSystem;

public class Main {
    public static void main(String[] args) {

        // lesson objects created
        Course math = new Course("Math", "MATH101","MATH");
        Course physics = new Course("Physics", "PHY101", "PHY");
        Course chemistry = new Course("Chemistry","CHM101", "CHM");
        Course vivaMAth = new Course("Math", "MATH101","MATH");
        Course vivaPhy = new Course("Physics", "PHY101", "PHY");
        Course vivaChm = new Course("Chemistry","CHM101", "CHM");

        // teacher objects created
        Teacher t1 = new Teacher("Johnny Bravo","90123","MAT");
        Teacher t2 = new Teacher("Martin Stanley", "90456", "PHY");
        Teacher t3 = new Teacher("Alexa Lolita", "90789", "CHM");

        // teachers added to classes
        math.addTeacher(t1);
        physics.addTeacher(t2);
        chemistry.addTeacher(t3);

        // student objects created and grade information entered
        Student s1 = new Student("Martin Eden", 4, "01", math, physics,chemistry,vivaMAth,vivaPhy,vivaChm);
        s1.addBulkExamNote(50,20,40,50,60,80);
        s1.isCheckPass();

        Student s2 = new Student("Sascha Timberland",4,"02",math, physics,chemistry,vivaMAth,vivaPhy,vivaChm);
        s2.addBulkExamNote(100,50,40,60,40,70);
        s2.isCheckPass();

        Student s3 = new Student("Minerva Mariam",4,"03",math,physics,chemistry,vivaMAth,vivaPhy,vivaChm);
        s3.addBulkExamNote(50,20,40,20,10,30);
        s3.isCheckPass();

        // print teacher information
        t1.printTeacher();
        t2.printTeacher();
        t3.printTeacher();

    }
}
