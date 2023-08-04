package com.pattern.singletonPattern;

/**
 * Singleton 单例模式中只有一个 INSTANCE 枚举元素，枚举可以保证真个程序生命周期中只有一个实例对象存在，
 * 同时还避免了常规 Singleton 单例模式 private 构造方法被反射调用和序列化问题 (枚举提供了序列化保证机制，确保多次序列化和反序列化不会创建多个实例对象)。
 */
public class EnumSingleTon {
    private EnumSingleTon() {
    }

    static enum SingletonEnum {
        INSTANCE;

        private EnumSingleTon enumSingleTon = null;

        private SingletonEnum() {
            enumSingleTon = new EnumSingleTon();
        }

        public EnumSingleTon getInstance() {
            return enumSingleTon;
        }
    }

    public static EnumSingleTon getInstance() {
        return SingletonEnum.INSTANCE.getInstance();
    }
}
