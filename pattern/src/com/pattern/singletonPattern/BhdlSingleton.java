package com.pattern.singletonPattern;

/**
 *饱汉单例模式
 */
public class BhdlSingleton {
    //饱汉模式，声明时就创建实例对象
    public static final BhdlSingleton instance = new BhdlSingleton();

    //单类模式的构造方法必须为private，以避免通过构造方法创建对象实例，
    //并且必须显示声明构造方法，以防止使用默认构造方法
    private BhdlSingleton() {}

    //单类模式必须对外提供获取实例对象的方法
    public static BhdlSingleton getInstance(){
        return instance;
    }
}
