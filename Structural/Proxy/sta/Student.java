package sta;

public class Student implements Person {
    private String name;

    public Student(String name) {
        this.name = name;
    }

    @Override
    public void submit() {
        System.out.println(name + "交班费50");
    }
}
