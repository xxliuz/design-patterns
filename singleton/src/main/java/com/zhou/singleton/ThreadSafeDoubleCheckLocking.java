package com.zhou.singleton;

/**
 * @Author: zhou.liu
 * @Date: 2022/4/19 10:29
 * @Description: 线程安全双重检查锁定: http://www.cs.umd.edu/~pugh/java/memoryModel/DoubleCheckedLocking.html
 */
public final class ThreadSafeDoubleCheckLocking {

    private static volatile ThreadSafeDoubleCheckLocking INSTANCE;

    private ThreadSafeDoubleCheckLocking(){
        if(INSTANCE !=null){
            throw new IllegalStateException("Already initialized.");
        }
    }

    /**
     *  公共存储器
     * @return ThreadSafeDoubleCheckLocking单例
     */
    public static ThreadSafeDoubleCheckLocking getInstance() {
        /**
         * 局部变量将性能提高 25%
         */
        ThreadSafeDoubleCheckLocking result = INSTANCE;
        /**
         * 检查单例实例是否已初始化。 如果它被初始化，那么我们可以返回实例。
         */
        if(result == null){
            /**
             *  它没有初始化，但我们不能确定，因为其他线程可能已经同时初始化了它。所以为了确保我们需要锁定一个对象来获得互斥。
             */
            synchronized (ThreadSafeDoubleCheckLocking.class){
                /**
                 * 再次将实例分配给局部变量，以检查它是否被某个其他线程初始化，而当前线程被阻止进入锁定区域。
                 * 如果它已初始化，那么我们可以返回之前创建的实例 // 就像之前的 null 检查一样。
                 */
                result = INSTANCE;
                if(result == null){
                    INSTANCE = result = new ThreadSafeDoubleCheckLocking();
                }
            }
        }
        return result;
    }
}
