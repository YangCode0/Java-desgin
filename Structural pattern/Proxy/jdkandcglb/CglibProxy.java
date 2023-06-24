package Proxy.jdkandcglb;


import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class CglibProxy implements MethodInterceptor {
    private Object target;//需要代理的目标对象

    //重写拦截方法
    @Override
    public Object intercept(Object o, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
        System.out.println("Cglib动态代理，监听开始！");
        Object result = method.invoke(target, args);//方法执行参数：target 目标对象 arr参数数组
        System.out.println("Cglib动态代理，监听结束！");
        return result;
    }

    //定义获取代理对象的方法
    public UserManager getCglibProxy(Object targetObject) {
        this.target = targetObject;//为目标对象target赋值
        Enhancer enhancer = new Enhancer();
        //设置父类,因为Cglib是针对指定的类生成一个子类，所以需要指定父类
        enhancer.setSuperclass(targetObject.getClass()); //UserManagerImpl
        enhancer.setCallback(this);//设置回调
        Object result = enhancer.create();//创建并返回代理对象
        return (UserManager) result;
    }


}
