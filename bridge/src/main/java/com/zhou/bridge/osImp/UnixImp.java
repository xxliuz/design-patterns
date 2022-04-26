package com.zhou.bridge.osImp;

import com.zhou.bridge.matrix.Matrix;

/**
 * @Author: zhou.liu
 * @Date: 2022/4/26 11:13
 * @Description: Unix操作系统实现类：具体实现类
 */
public  class UnixImp implements ImageImp {
    public void doPaint(Matrix m) {
        //调用Unix系统的绘制函数绘制像素矩阵
        System.out.print("在Unix操作系统中显示图像：");
    }
}