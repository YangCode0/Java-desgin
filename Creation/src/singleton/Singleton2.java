package singleton;

/**
 * @author: wzy
 * @create: 2023-08-09 15:12
 **/

/**
 *
 * Ⅱ 饿汉式-线程安全
 * 线程不安全问题主要是由于 instance 被实例化多次，采取直接实例化 instance 的方式就不会产生线程不安全问题。
 *
 * 但是直接实例化的方式也丢失了延迟实例化带来的节约资源的好处。
 */
public class Singleton2 {
    private static Singleton2 instance = new Singleton2();

    // 私有构造方法，防止外部实例化
    private Singleton2() {
        // 初始化操作
    }

    // 提供公共方法获取实例
    public static Singleton2 getInstance() {
        return instance;
    }
}

