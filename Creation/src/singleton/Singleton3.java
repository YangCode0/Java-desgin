package singleton;

/**
 * @author: wzy
 * @create: 2023-08-09 15:16
 **/

/**
 * Ⅲ 懒汉式-线程安全
 * 只需要对 getInstance() 方法加锁，那么在一个时间点只能有一个线程能够进入该方法，从而避免了实例化多次 instance。
 *
 * 但是当一个线程进入该方法之后，其它试图进入该方法的线程都必须等待，即使 instance 已经被实例化了。
 * 这会让线程阻塞时间过长，因此该方法有性能问题，不推荐使用。
 */
public class Singleton3 {
    private static Singleton3 instance;

    private Singleton3() {
    }

    public static synchronized Singleton3 getInstance() {
        if (instance == null) {
            instance = new Singleton3();
        }
        return instance;
    }
}

