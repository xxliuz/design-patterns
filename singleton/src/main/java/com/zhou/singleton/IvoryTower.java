package com.zhou.singleton;


/**
 * @Author: zhou.liu
 * @Date: 2022/4/19 9:39
 * @Description: 单例类,急切初始化的静态实例保证线程安全。final修饰类，不允许被继承，实现细节不会被改变。
 */
public final class IvoryTower {

    /**
     * 私有构造函数，因此没有人可以实例化该类
     */
    private IvoryTower(){

    }

    /**
     * 静态到类的类实例
     */
    private static final IvoryTower INSTANCE = new IvoryTower();

    /**
     * 由用户调用以获取类的实例
     * @return IvoryTower实例
     */
    public static IvoryTower getInstance(){
        return INSTANCE;
    }
}
