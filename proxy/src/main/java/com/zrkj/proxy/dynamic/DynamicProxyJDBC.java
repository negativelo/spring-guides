package com.zrkj.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Arrays;

public class DynamicProxyJDBC implements InvocationHandler {
    private Object proxied;

    public DynamicProxyJDBC(Object proxied) {
        System.out.println("dynamic proxy handler constuctor: " + proxied.getClass());
        this.proxied = proxied;
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("dynamic proxy name: " + proxy.getClass());
        System.out.println("method: " + method.getName());
        System.out.println("args: " + Arrays.toString(args));

        Object invokeObject = method.invoke(proxied, args);
        if (invokeObject != null) {
            System.out.println("invoke object: " + invokeObject.getClass());
        } else {
            System.out.println("invoke object is null");
        }
        return invokeObject;
    }
}
