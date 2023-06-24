package dynamic;

public class MonitorUtil {
    private static ThreadLocal<Long> threadLocal = new ThreadLocal<Long>();

    public static void start() {
        threadLocal.set(System.currentTimeMillis());
    }

    //结束打印耗时
    public static void finish(String methodName) {
        long finishTime = System.currentTimeMillis();
        System.out.println(methodName + "方法耗时" + (finishTime - threadLocal.get()) + "ms");

    }
}
