package chap1_3.student;

public class StudentMain {
    public static void main(String[] args) {
        Student student = new Student("20242554", "뽀로로", 2);
        student.updateGrade(2);
        student.printStudentInfo();
    }
}
