import java.util.Scanner;
void main() {
    Human h1 =new Human(100, "Adam", true);
    Employee e1 = new Employee(25, "Carl",false, "Teacher",450.5f);
    Student s1 = new Student (18,"Yerassyl", true,"Smart Technology",2.94f);

    h1.introduce();
    System.out.println(h1.getName());
    Scanner scanner = new Scanner(System.in);

    s1.setAge(scanner.nextInt());
    System.out.println(s1.getName());
    System.out.println(s1.getGpa());
    s1.setAge(20);
    System.out.println(e1.getName());
    System.out.println(e1.getPosition());
    System.out.println(s1.getAge());
}
