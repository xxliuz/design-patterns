package com.zhou.singleton;


/**
 * @Author: zhou.liu
 * @Date: 2022/4/19 9:39
 * @Description: 单例类,急切初始化的静态实例保证线程安全。final修饰类，不允许被继承，实现细节不会被改变。
 */
public final class IvoryTower {

    /**
     * 饿汉式
     * 类加载到内存后，就实例化一个单例，JVM保证线程安全
     * 唯一缺点：不管用到与否，类装载时就完成实例化
     * Class.forName("")
     * （话说你不用的，你装载它干啥）
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
