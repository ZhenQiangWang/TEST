package com.sjms.factory.simple;

/**
 * 简单工程模式
 * 又叫静态工厂模式，简单工厂只包括一个抽象产品类（该类可以是接口，也可以是具体的类），
 * 所有需要的产品类都是该抽象产品类的子类。简单工厂模式中工厂为具体产品工厂，产品为抽象产品，由工厂实例创建产品实例：
 */
public class SimpleFactory {
    public static Shape createShape(String name) throws InstantiationException,
            IllegalAccessException,
            ClassNotFoundException {
        //使用java的反射机制来产生对象实例
        if(name.equals("Circle")){
            return (Shape) Class.forName("com.sjms.factory.simple.Circle").newInstance();
        }else {
            return null;
        }
    }
}
