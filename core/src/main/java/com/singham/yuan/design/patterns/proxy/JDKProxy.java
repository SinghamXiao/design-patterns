package com.singham.yuan.design.patterns.proxy;

import java.lang.reflect.Proxy;

public class JDKProxy {

    private Object target;

    public JDKProxy(Object target) {
        this.target = target;
    }

    public Object getProxyInstance() {
        return Proxy.newProxyInstance(
                target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                (proxy, method, args) -> method.invoke(target, args)
        );
    }

}