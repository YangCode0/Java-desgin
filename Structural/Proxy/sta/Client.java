package sta;

/**
 * 静态代理模式
 *
 * 静态代理：由程序员创建或特定工具自动生成源代码，也就是在编译时就已经将接口、被代理类、代理类等确定下来。在程序运行之前，代理类的.class文件就已经生成。
 *
 * 
 * 情景：学生上交班费，班长收齐，上交给老师
 * 角色分配： 被代理人：学生   代理类：班长
 *
 *
 * 这里并没有直接通过张三（被代理对象）来执行上交班费的行为，而是通过班长（代理对象）来代理执行了，这就是代理模式。
 *
 * 代理模式最主要的就是有一个公共接口（Proxy.sta.Person），一个具体的类（Proxy.sta.Student），一个代理类（StudentsProxy），
 * 代理类持有具体类的实例，代为执行具体类实例方法。上面说到，代理模式就是在访问实际对象时引入一定程度的间接性，
 * 因为这种间接性，可以附加多种用途。这里的间接性就是指不直接调用实际对象的方法，那么我们在代理过程中就可以加上一些其他用途。
 * 就这个例子来说，加入班长在帮张三上交班费之前想要先反映一下张三最近学习有很大进步，通过代理模式很轻松就能办到：
 *  public void submit() {
 *         System.out.println("张三最近学习有进步！");
 *         stu.submit();
 *     }
 *
 */

public class Client {

    public static void main(String[] args) {


        Person zhangsan = new Student("张三");

        Person monitor = new StudentProxy(zhangsan);

        monitor.submit();
    }
}
