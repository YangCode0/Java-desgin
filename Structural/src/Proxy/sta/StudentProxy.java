package Proxy.sta;

/**
 * 学生代理类，也实现了Person接口
 */

public class StudentProxy implements Person {
//被代理的学生
    Student stu;

    public StudentProxy(Person stu) {
        //只代理学生对象
        if (stu.getClass()==Student.class){
            this.stu = (Student) stu;
        }
    }

    //代理上交班费，调用被代理学生的上交班费的行为
    @Override
    public void submit() {
        System.out.println("张三最近学习有进步！");
        stu.submit();
    }
}
