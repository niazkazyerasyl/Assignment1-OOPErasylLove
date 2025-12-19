public class Student extends Human{
    private String major;
    private float gpa;

    public Student(int age, String name, boolean active, String major, float gpa) {
        super(age, name, active);
        this.major = major;
        this.gpa = gpa;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public float getGpa() {
        return gpa;
    }

    public void setGpa(float gpa) {
        this.gpa = gpa;
    }
}
