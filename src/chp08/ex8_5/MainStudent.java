package chp08.ex8_5;

public class MainStudent {

    public static void main(String[] args) {
        Student s1 = new Student(20240101, "유유유");
        Student s2 = new Student(20240102, "유");
        Student s3 = new Student(20240103, "유유");

        System.out.printf("생성된학생객채의개스: %d개",Student.count);
    }
}
