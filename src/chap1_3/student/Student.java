package chap1_3.student;

public class Student {
    String studentId;
    String name;
    int grade;

    Student(String id, String studentName, int studentGrade) {
        studentId = id;
        name = studentName;
        grade = studentGrade;
    }

    void updateGrade(int newGrade){
        grade = newGrade;
        System.out.println(grade + "학년으로 업데이트 되었습니다");
    }


    void printStudentInfo() {
        System.out.printf("학생 아이디: %s, 이름: %s, 학년: %d", studentId, name, grade);
    }
}
