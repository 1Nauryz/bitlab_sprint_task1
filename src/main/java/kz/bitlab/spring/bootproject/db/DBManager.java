package kz.bitlab.spring.bootproject.db;

import kz.bitlab.spring.bootproject.db.Student;

import java.util.ArrayList;

public class DBManager {
    private static final ArrayList<Student> students = new ArrayList<>();
    private static long id = 6L;
    static {
        students.add(new Student(1L, "Meiirbek", "Ongaibay", 78, "B"));
        students.add(new Student(2L, "Nauryz", "Aitmurat", 58, "D"));
        students.add(new Student(3L, "Yernur", "Assilov", 62, "C"));
        students.add(new Student(4L, "Ayan", "Serikkan", 93, "A"));
        students.add(new Student(5L, "Dias", "Orazbek", 45, "F"));
    }

    public static ArrayList<Student> getStudents(){
        return students;
    }

    public static void addStudent(Student student){
        if (student.getExam() >= 90) {
            student.setMark("A");
        } else if (student.getExam() >= 75) {
            student.setMark("B");
        } else if (student.getExam() >= 60) {
            student.setMark("C");
        } else if (student.getExam() >= 50) {
            student.setMark("D");
        } else {
            student.setMark("F");
        }
        student.setId(id);
        id++;
        students.add(student);
    }

}
