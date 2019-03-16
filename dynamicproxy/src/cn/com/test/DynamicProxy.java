package cn.com.test;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class DynamicProxy implements InvocationHandler {

    private Object target;

    public Object bind(Object target){
        this.target = target;
        return Proxy.newProxyInstance(target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        Before();
        Object result = method.invoke(target,args);
        after();
        return result;
    }

    private void after() {
        System.out.println("关闭事务！");
    }

    private void Before() {
        System.out.println("开启事务！");
    }


}
