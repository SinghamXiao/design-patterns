package com.singham.yuan.design.patterns.proxy;

public class Main {

    public static void main(String[] args) {
        Subject subject = new RealSubject();
        StaticProxy staticProxy = new StaticProxy(subject);
        staticProxy.execute("Execute StaticProxy!");

        Subject jDKProxy = (Subject) new JDKProxy(subject).getProxyInstance();
        System.out.println(subject.getClass());
        System.out.println(jDKProxy.getClass());
        jDKProxy.execute("Execute JDKProxy!");

        RealSubject cglibProxy1 = (RealSubject) new CglibProxy(subject).getProxyInstance();
        System.out.println(subject.getClass());
        System.out.println(cglibProxy1.getClass());
        cglibProxy1.execute("Execute CglibProxy!");

        Subject cglibProxy2 = (Subject) new CglibProxy(subject).getProxyInstance();
        System.out.println(subject.getClass());
        System.out.println(cglibProxy2.getClass());
        cglibProxy2.execute("Execute CglibProxy!");

        OtherSubject cglibProxy3 = (OtherSubject) new CglibProxy(new OtherSubject()).getProxyInstance();
        System.out.println(subject.getClass());
        System.out.println(cglibProxy3.getClass());
        cglibProxy3.execute("Execute CglibProxy!");
    }
}
