public class Human {
    private int age;
    private String name;
    private boolean active;

    public Human(int age, String name, boolean active) {
        this.age = age;
        this.name = name;
        this.active = active;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }
    public void introduce(){
        System.out.println("Hi im " +name+",age "+age+".");
    }

    public String getRole(){
        System.out.print("Hello");
        return "Role returned";
    };
}
