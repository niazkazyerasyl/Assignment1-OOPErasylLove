public class Employee extends Human{
    private String position;
    private float salary;
    public static String company = "AITU";

    public Employee(int age, String name, boolean active, String position, float salary) {
        super(age, name, active);
        this.position = position;
        this.salary = salary;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public static String getCompany() {
        return company;
    }

    public static void setCompany(String company) {
        Employee.company = company;
    }
    @Override
    public String getRole(){
        return "Employee";
    }
}
