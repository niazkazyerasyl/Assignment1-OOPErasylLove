import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Employee empoloyee1 = new Employee(25, "Carl", false, "Teacher", 450.5f);
        Human AsHuman = new Employee(30, "Adam", true, "Manager", 900.0f);
        IWork AsWork = new Employee(40, "Mike", true, "Engineer", 1200.0f);
        Student student1 = new Student(18, "Yerassyl", true, "Smart Technology", 2.94f);
        Human sAsHuman = new Student(19, "Aruzhan", true, "Cybersecurity", 3.2f);
        IStudy sAsStudy = new Student(20, "Dias", false, "Data Science", 3.6f);
        empoloyee1.introduce();
        System.out.println(empoloyee1.getRole());
        System.out.println(empoloyee1.getName());
        System.out.println(empoloyee1.getWorkInfo());
        empoloyee1.study();
        System.out.println(empoloyee1.getStudyInfo());
        student1.introduce();
        System.out.println(student1.getRole());
        System.out.println(student1.getMajor());
        System.out.println(student1.getGpa());
        student1.study();
        System.out.println(student1.getStudyInfo());
        student1.printStudentCard();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter new age for student " + student1.getName() + ": ");
        int newAge = scanner.nextInt();
        student1.setAge(newAge);
        System.out.println("Updated age: " + student1.getAge());
        AsHuman.introduce();
        sAsHuman.introduce();
        AsWork.work();
        sAsStudy.study();
        scanner.close();
    }
}
